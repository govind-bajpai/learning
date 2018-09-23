import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import org.json.JSONException;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

public class JsonReader {

	public static void main(String[] args) throws IOException, JSONException {

		// String sURL =
		// "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
		String sURL = "https://samples.openweathermap.org/data/2.5/find?lat=55.5&lon=37.5&cnt=10&appid=b6907d289e10d714a6e88b30761fae22";
		// Connect to the URL using java's native library
		URL url = new URL(sURL);
		URLConnection request = url.openConnection();
		request.connect();

		// Convert to a JSON object to print data
		JsonParser jp = new JsonParser(); // from gson
		JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); // Convert the input
																								// stream to a json
																								// element
		JsonObject rootobj = root.getAsJsonObject(); // May be an array, may be an object.
		System.out.println(rootobj.toString());
		ArrayList<Example> list = new ArrayList();

		Gson gson = new Gson();
		Example fromJson = gson.fromJson(rootobj, Example.class);

		System.out.println(fromJson.getMessage());
		for (List lister : fromJson.getList()) {
			if (lister.getName().equals("Newtonhill") || lister.getName().equals("Stonehaven")) {
				lister.getSys().setCountry("India");
			} else {
				lister.getSys().setCountry("Pakistan");
			}
		}
		ArrayList<List> filterList = new ArrayList<>();
		for (List lister : fromJson.getList()) {
			if (lister.getSys().getCountry().equalsIgnoreCase("India")) {
				filterList.add(lister);
			}

		}

		for (List fL : filterList) {
			System.out.println(fL.getName());

		}

	}
}