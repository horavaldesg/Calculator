import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int result = 0;
		System.out.println("Enter Two Number: ");
		System.out.print("> ");
		int firstNumber = kb.nextInt();

		System.out.print("> ");
		int secondNumber = kb.nextInt();
		System.out.println("Would you like to add or subtract?");
		System.out.print("> ");
		String option = kb.next();
		
		switch(option.toLowerCase()){
			case "add":
			result = firstNumber + secondNumber;
			System.out.println(firstNumber + " + " + secondNumber + " = " + result);
			break;
			case "subtract":
			result = firstNumber - secondNumber;
			System.out.println(firstNumber + " - " + secondNumber + " = " + result);
			break;
			
		}
		

		
	}
}
