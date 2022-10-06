package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class mystremwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty()
		Properties p = System.getProperties();
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		findEvenNo(myList);
		
		List<Integer> myListSame = Arrays.asList(10,15,8,49,25,98,98,32,15);
		finddublicate(myListSame);
	
		fingnoumberStartwith1(myList);
	   
         Object[][] a = new  Object[3][];
         System.out.println(Arrays.deepToString(a));

         String as = "";
         int aa = (Integer) 4;
	}

	private static void fingnoumberStartwith1(List<Integer> myList) {
		System.out.println("find number with 1");
		myList.stream().map(s -> s + "").filter(x -> x.startsWith("1")).forEach(System.out::println);
		
	}
	public  void fingnoumberwith1(String myList, int... ints) {
		System.out.println("find number with 1");
		//myList.stream().map(s -> s + "").filter(x -> x.startsWith("1")).forEach(System.out::println);
		
	}

	public static void findEvenNo(List<Integer> myList) {
		System.out.println("find even");
		myList.stream().filter(n->n%2 == 0).forEach(System.out::println);
	}
	
	public static void finddublicate(List<Integer> mylist) {
		System.out.println("find dublicate no");
		Set<Integer> set = new HashSet<Integer>();
		mylist.stream().filter(n -> !set.add(n)).forEach(System.out::println);
	}
}
