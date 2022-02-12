import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		float result = 0;
		System.out.println("Enter Two Number: ");
		System.out.print("> ");
		float firstNumber = kb.nextFloat();

		System.out.print("> ");
		float secondNumber = kb.nextFloat();
		System.out.println("Would you like to add, subtract, multiply or divide?");
		System.out.print("> ");
		String option = kb.next().toLowerCase();
		
		
		
			switch(option){
				case "add":
				result = firstNumber + secondNumber;
				System.out.println(firstNumber + " + " + secondNumber + " = " + result);
				break;
				case "subtract":
				result = firstNumber - secondNumber;
				System.out.println(firstNumber + " - " + secondNumber + " = " + result);
				break;
				case "multiply":
				result = firstNumber * secondNumber;
				System.out.println(firstNumber + " * " + secondNumber + " = " + result);
				break;
				case "divide":
				if(secondNumber != 0){
					result = firstNumber / secondNumber;
					System.out.println(firstNumber + " / " + secondNumber + " = " + result);
				}
				else{
					System.out.println("Error: Divide by Zero");
				}
				
				break;
				default: System.out.println("Not An Option");
				break;
			}
		
		

		
	}
}
