package classlab.week7;

public class Test {
	public static void a() {
		// order in the catch block MATTERS.
		try { // need both try and catch
			int x = 1;
			int y = 0;
			System.out.println(x/y);
			System.out.println("hello");
		}
		catch(Exception e) { //handles the error and needs parameter
			System.out.println("Error Occured.");
			System.out.println("Error:" + e.getMessage());
			System.out.println(e.getStackTrace());
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error Occured.");
			System.out.println("Error:" + e.getMessage());
			System.out.println(e.getStackTrace());
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		int x = 1;
		int y = 0;
		System.out.println(x/y);
		System.out.println("hello");
	}
}
