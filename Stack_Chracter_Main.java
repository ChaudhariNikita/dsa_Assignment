package assignment;

import java.util.Scanner;

public class Stack_Chracter_Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Stack_Character obj = new Stack_Character();
		System.out.println("Enter charcter");
		String c = in.next();
		obj.create_Stack(c.length());
		for (int i = 0; i < c.length(); i++)
			obj.push(c.charAt(i));
		String r_word = "";
		while (obj.is_Empty() != true)
			r_word += obj.pop();
		System.out.println("reverse word is " + r_word);
	}
}
