import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = Arrays.asList(1,2,6,3);
		
		List<Integer> doubleS = myList.stream().map(x->x+2)
				.collect(Collectors.toList());
		System.out.println(doubleS);
		
		int sum = myList.stream().filter(x->x%2==0).reduce(0,(out,i)->out + i);
		System.out.println(sum);
		
		List<Integer> doubleSP = myList.stream().parallel().map(x->x+2)
				.collect(Collectors.toList());
		System.out.println(doubleS);
		
		int sumP = doubleSP.stream().parallel().filter(x->x%2==0).reduce(0,(out,i)->out + i);
		System.out.println(sumP);
		
		
		String s1 = new String( "Test"); 

		String s2 = new String( "Test"); 

		System.out.println(s1==s2) ;
		System.out.println(s1+ " " +s2) ;

		String s11 = new String( "Test"); 

		String s21 = s11; 

		System.out.println(s11==s21) ;
		System.out.println(s11+ " " +s21) ;

		s11 +=s21; 

		System.out.println(s11==s21) ;
		System.out.println(s11+ " " +s21) ;

	

		StringBuffer s12 = new StringBuffer("Test"); 

		String s22 = "Test"; 

	//
		//System.out.println(s12==s22) ;
	}

}
