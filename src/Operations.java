
public class Operations {

	
	public static int sum(int a, int b) {
		return a + b;
			
	}
	
	public static int sub(int a, int b) {
		return a - b;
			
	}
	
	public static int multi(int a, int b) {
		return a * b;
			
	}
	
	public static int div(int a, int b) {
		return a / b;
			
	}
	
	public static int fact(int a) {
		int fact =1;
		for (int i = a; i > 0; i--) {
            fact *= i;
        }
		return fact;
			
	}
}
