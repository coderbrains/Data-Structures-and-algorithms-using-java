package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_HashMap {

	public static void main(String[] args) {
		
		Map<Integer,String> maps = new HashMap<>();
		maps.put(1, "Awanish");
		maps.put(2, "Manish");
		maps.put(3, "Arjun Singh");
		maps.put(4, "Khushee");
		
		Map<Integer, String> map = new HashMap<>();
		
		map.putAll(maps);
		map.putIfAbsent(5, "Late SB Singh");
		
//		System.out.println(map.get(5));
//		
//		System.out.println(map.containsKey(5));
//		
//		System.out.println(map.keySet());
//		
//		System.out.println(map.entrySet());
//		
//		
//		
//		
//		System.out.println(maps);
		
		for(Entry<Integer,String> entry : map.entrySet()) {
			entry.setValue(entry.getValue() + " Main ");
		}
		
		System.out.println(map);

	}

}
