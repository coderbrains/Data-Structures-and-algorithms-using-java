package set;

public class Introduction_to_Set {
	
	
	/*
	 * ________________Set______________________________________________
	 * 
	 *  
	 * ---> Do not allow the duplicates in it
	 * ---> It is an interface
	 * ---> Uses the following sets classes
	 *    1.HashSets
	 *    2.LinkedHashSet
	 *    3.EnumSet
	 *    4.TreeSet
	 *    
	 *  Methods used ---->
	 *  
	 *  1. add()
	 *  2. addAll()
	 *  3.remove()
	 *  4.removeAll()
	 *  5.retainAll()
	 *  6.clear()
	 *  7.contains()
	 *  8.isEmpty()
	 *  9.toArray()
	 *  
	 *  
	 *  1. HashSet
	 *  
	 *  ---> order is not preserved
	 *  ---> HashSet<Integer> h = new HashSet<Integer>()
	 *  --->when we use add then it returns false when the elements are not inserted
	 *  	returns true when it is inserted
	 *  --->Uses Hash Function to deliver the elements on its proper place.
	 *  
	 *  
	 *    				 Set<Integer> sets = new HashSet<Integer>();
		
						sets.add(20);
						sets.add(23);
						sets.add(34);
						sets.add(34);
						sets.add(45);
						
						System.out.println(sets);
						
						output - [34, 20, 23, 45]

	 *  2.
	 *  _____________________LinkedHashSet____________________________
	 *  
	 *  Uses LinkedList
	 *  Insertion order is preserved
	 *  operations are same as linked list.
	 *  
	 *  Set<Integer> sets = new LinkedHashSet<Integer>();
		
				sets.add(20);
				sets.add(23);
				sets.add(34);
				sets.add(34);
				sets.add(45);
		
				System.out.println(sets);
				
				o - [20, 23, 34, 45]

	 * 3.
	 * ___________________Treesets_______________________
	 * 
	 * uses tree to store the elements
	 * always store the data in sorted order
	 * 
	 * Set<Integer> sets = new TreeSet<Integer>();
		
		sets.add(33);
		sets.add(20);
		sets.add(30);
		sets.add(3);
		sets.add(4);

		System.out.println(sets);
		
		o/p--->[3, 4, 20, 30, 33]
		
	  *
	  *_______OPERATIONS OF SETS_________________
	  *
	  *
	  *		1. UNION---->
	  *			x.addAll(y);
	  *		
	  *		2.Intersection---->
	  *		   x.retainAll(y);
	  *
	  *		3. Subset--->
	  *			x.containsAll(y)
	  *
	  *

	 */

}
