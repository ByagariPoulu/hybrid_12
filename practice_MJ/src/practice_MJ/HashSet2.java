package practice_MJ;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {

	public static void main(String[] args) {

		HashSet hs = new HashSet();

		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(400);
		hs.add(500);
		System.out.println(hs);


		HashSet<Integer> dupHs=new HashSet<Integer>();


		dupHs.add(300);
		dupHs.add(400);
		dupHs.add(500);
		System.out.println(dupHs);


		/*//union
		hs.addAll(dupHs);
		System.out.println(hs);

		//Intersection

		System.out.println(hs.retainAll(dupHs));//Condition becomes true


        */
		
		//Difference

		//hs.removeAll(dupHs);
		//System.out.println(hs);

		System.out.println(dupHs.containsAll(hs));


	}
}
