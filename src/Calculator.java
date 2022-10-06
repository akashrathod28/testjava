import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		String action = "";
		do
		{
			System.out.println("please enter an action");
			action = scanner.next();
			if (!action.equals("q")) {
				System.out.println("please enter a :");
				int a = Integer.parseInt(scanner.next());
				
				int b = 0;
				
				if (!action.equals("!")) {
				 System.out.println("please enter a :");
				 b = Integer.parseInt(scanner.next());
				}
				switch(action){
					case "+": System.out.println("a + b =" + Operations.sum(a,b));
						break;
					case "-": System.out.println("a - b =" + Operations.sub(a,b));
					break;
					case "*": System.out.println("a * b =" + Operations.multi(a,b));
					break;
					case "/": System.out.println("a / b =" + Operations.div(a,b));
					break;
					case "!": System.out.println("a factorial =" + Operations.fact(a));
					break;
					default :
					
				}
			}
		}while(!action.equals("q"));
	}

}
