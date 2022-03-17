package classlab.week7;
import java.util.Scanner;

public class ExceptionClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String code1 = scan.nextLine();

		try {
			if (code1.charAt(9) == 'Y') {
				System.out.println("Yes");
			}

			if (code1.substring(2,8).equals("CS122")) {
				System.out.println("inclass");
			}
		}

		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Error:" + e.getMessage());
		}
	}
}


