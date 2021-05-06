package maps;

import java.util.*;

public class GroupingAnagrams {

	public static void main(String[] args) {
		
		String[] str = {"ate", "eat", "tan", "tea", "nat", "bat"};
		
		Map<String, LinkedList<String>> anagrams = new HashMap<>();
		
		for(String s : str ) {
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			String ss = new String(ch);
			if(!anagrams.containsKey(ss)) {
				anagrams.put(ss, new LinkedList<String>());
			}
			anagrams.get(ss).add(s);
		}
		
		System.out.println(anagrams.values());

	}

}
