
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
//		int a=10;
//		int b=10;
		HashMapDemo hashMapDemo = new HashMapDemo();
		hashMapDemo.show();

	}
	
	public void show()

	{
		Map map = new HashMap<>();
		map.put("govind", 1);
		map.put(1, "kk");
		map.put(1, "Ashotosh Anand");
		System.out.println(map.get("govind"));
		System.out.println(map.get(1));
//		Map<String,Integer> map = new HashMap<>();
//		HashMap<String, Integer>  hashmap = new HashMap<>();
//		hashmap.put("",null);
//		hashmap.put("",1);
//		hashmap.put("5",null);
//		hashmap.put(null,null);
//		hashmap.put("3",2);
//		hashmap.put("2",null);
//		Object arrp[] = new Object[20];
//		arrp[0] = new Integer(10);
//		arrp[1] = new  HashMap<>();
//		arrp[3] = "jkdj";
//		
//		for(int i=0;i<arrp.length;i++)
//		{
//			System.out.println(""+arrp[i]);
//		}
//		
		System.out.println("sdsdsdsd");	
//		Iterator<Entry<String, Integer>> iterator = hashmap.entrySet().iterator();
//		while(iterator.hasNext())
//		{
//			System.out.println(" "+iterator.next());
//		}

		System.out.println(map);
//		FOR(ENTRY<OBJECT,OBJECT> ENTRY: MAP.ENTRYSET()) {
//			SYSTEM.OUT.PRINTLN(ENTRY.GETKEY()+":"+ENTRY.GETVALUE());
//		}
		//while(hashmap.keySet().iterator().hasNext()) {
			
	//	}
		
		
		Map<Integer,String> map3 = new HashMap<>();
		String s;
		map3.put(null, "dfjkhj");
		map3.put(1, "gb");
		map3.put(2, "3");
	

		map3.put(null, "dpatffel");
		map3.put(null, "sdsds");
		System.out.println(map3.get(2));
		System.out.println(map3.get(1));
		System.out.println(map3.get(null));
		
		
	}
	

}
