package assignments.assignment4;
import java.util.Scanner;

public class DestignationLength {

	public static void main(String[] args) throws InvalidDocumentCodeException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a designation.");
		String input = scan.next();

		try {
			if(input.charAt(0) == 'U' || input.charAt(0) == 'C' || input.charAt(0) == 'P' && input.length() == 2) {
				System.out.println("good job destignation approved");
			} else {
				throw new InvalidDocumentCodeException("Invalid destignation...");
			}
		}
		catch (InvalidDocumentCodeException e) {
			System.out.println(e.getMessage());
		}
	}

}

class InvalidDocumentCodeException extends Exception {
	public InvalidDocumentCodeException(String message) {
		super(message);
	}
}



