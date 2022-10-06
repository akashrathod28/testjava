package CollectionWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class arraywork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(2);
		test.add(23);
		test.add(22);
		test.add(12);
		System.out.println(test);
		//Comparator<Integer> comp = Collections.reverseOrder();
		Collections.sort(test);
		System.out.println(test);
	}

}
