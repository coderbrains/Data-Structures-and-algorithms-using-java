package maps;

public class IntroductionToMaps {

	/*
	 * ____________________MAP____________________________
	 * 
	 * 		---> uses key value pair to store the variables
	 *      		Do not allow the same key but different value
	 *      		cannot contain the duplicate keys
	 *      		
	 *      Implementation 
	 *      
	 *      1. Hashmap -- important
	 *      2. TreeMap -- important
	 *      3. EnumMap
	 *      4.LinkedHashMap
	 *      5.WeakHashmap
	 *      
	 *      
	 *      ____________METHODS________________
	 *      
	 *      
	 *      1. put(k,v)
	 *      2.putAll()
	 *      3.putIfAbsent();
	 *      4.get(k)
	 *      5.getOrDefault()
	 *      6.containsKey(k)
	 *      7.containsValue()
	 *      8.replace(k,v)
	 *      9.replace(k,old,new);
	 *      10.remove(k)
	 *      11.remove(k,V)
	 *      12.KeySet()
	 *      13.values()
	 *      14.entrySet()      
	 *      
	 *      Map<Integer,String> maps = new HashMap<>();
				maps.put(1, "Awanish");
				maps.put(2, "Manish");
				maps.put(3, "Arjun Singh");
				maps.put(4, "Khushee");
				
				System.out.println(maps);
				map.putIfAbsent(5, "Late SB Singh");
		
				System.out.println(map.get(5));
				
				System.out.println(map.containsKey(5));
				
				System.out.println(map.keySet());
				
				System.out.println(map.entrySet());
				
		*
		*________________HashCode_____Equals________________________________________
		*
		*
		*   hashcode and equals are the methods which are defined in the object class
		*   Each class we made or predefined inherits the object class of its own
		*   so the methods like equals, hashcode, finalize, getAll etc are also
		*   inherited.
		*   However, The implementation can be overriden by us in the form of interface
		*   
		*   
		*   @Override		
			public boolean equals(Object o) {
				Pen pen = (Pen)o;
				if(this.colour.equals(pen.colour) && this.price == pen.price) {
					return true;
				}else {
					return false;
				}
				
		}
		
			@Override
			public int hashCode() {
				return price + colour.hashCode();
			}
			
			
			_______________CONTRACT_BETWEEN_HASHCODE_AND_EQUAL________________
		*
		*		1. If the two objects are equal then they must have 
		*			same hashcode.
		*		
		*		2. If the two hashcode are equal then the objects 
		*			may or may not equal.
		*
		*____________BEST_PRACTICES__________________________________________
		*
		*	1.Always use the same attributes to generate the equals and the 
		*		hashcode.
		*
		*	2.equals must be consistent---> if the objects are not modified then
		*		it is mandatory to the equal to always return the same value
		*
		*	3. if a.equals(b) == true, Then a.hashcode == b.hashcode()
		*
		*	4.Always override both the functions together
		*
		*
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
