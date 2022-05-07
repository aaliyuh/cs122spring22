package assignments.assignment6;

//********************************************************************
//ParenMatch.java
//
//Determines whether or not a string of characters contains
//matching left and right parentheses.
//********************************************************************
import java.util.*;
import java.util.Scanner;
public class ParenMatch
{
	public static void main (String[] args)
	{
		Stack s = new Stack();
		String line; // the string of characters to be checked
		Scanner scan = new Scanner(System.in);
		System.out.println ("\nParenthesis Matching");
		System.out.print ("Enter a parenthesized expression: ");
		line = scan.nextLine();
		boolean tooMany = false;
		//loop to process the line one character at a time
		for (int i = 0; i < line.length(); i++) {
			char x = line.charAt(i);
			if (x == '(') {
				s.push(x);
			}
			else if (x == ')') {
				if (s.isEmpty()) {
					tooMany = true;
					break;
				}
				else {
					s.pop();
				}
			}
		}
		//print the results
		if(!s.isEmpty()) {
			System.out.println("Too many left parenthesis indicated." + line);
		}
		else if (tooMany) {
			System.out.println("Too many right parenthesis indicated." + line);
		}
		else {
			System.out.println("Good job.");
		}
	}
}
