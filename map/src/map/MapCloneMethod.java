package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCloneMethod {
 public static void main(String args[]){
 
//      HashMap<Integer,String> newmap1 = new HashMap();
//      HashMap<Integer,String> newmap2 = new HashMap();
//
//      // populate 1st map
//      newmap1.put(1, "tutorials");
//      newmap1.put(2, "point");
//      newmap1.put(3, "is best"); 
//
//      // clone 1st map
//      newmap2 = (HashMap)newmap1.clone();
//      newmap2.remove(2);
//      
//      for(Map.Entry m: newmap1.entrySet()){
//   System.out.println(m.getKey()+" "+m.getValue());
	 // }
	 
	 TreeMap<String, String> map = new TreeMap<>();

	 map.put("C", null);
	 map.put("D", null);
	 map.put("E", null);
	 map.put("A", null);
	 map.put("B", null);
	 map.put("C", null);
	 System.out.println(map);
	 System.out.println(map.firstKey());
 
 }
}
