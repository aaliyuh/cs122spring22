package assignments.assignment4;
import java.util.Scanner;

public class LengthCheck {


	public static void main(String[] args) throws StringTooLongException {
		Scanner scan = new Scanner(System.in);
		int characters = 20;
		String input = "";

		while (input != "DONE!") {
			try {
				System.out.println("Enter a String (DONE! to Finish)");
				input = scan.nextLine();

				if(input.equalsIgnoreCase("DONE!")) {
					return;
				}
				else if(input.length() > characters) {
					throw new StringTooLongException("String cannot be greater than 20 characters");
				}
			}

			catch (StringTooLongException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class StringTooLongException extends Exception {
	public StringTooLongException(String message) {
		super(message);
	}		

}
