package classlab.week10;

public class Recursive {

	public static int recursion(int num) {
		int result = 0;
		if (num ==0 || num ==1) {
			return num;
		}
		
		else {
			result = recursion(num-1) + recursion(num-2);
			return result;
		}
		//return result;
	}

	public static void main(String[] args) {
		for(int i=0; i<11; i++) {
			System.out.println(recursion(i) + "\t");
		}
		//recursion(11);

	}
}
