import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Two Number: ");
		System.out.print("> ");
		int firstNumber = kb.nextInt();

		System.out.print("> ");
		int secondNumber = kb.nextInt();

		int result = firstNumber + secondNumber;

		System.out.println(firstNumber + " + " + secondNumber + " = "+result);
	}
}
