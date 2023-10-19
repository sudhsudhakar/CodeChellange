package code;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value");
		String rev = s.nextLine();
		String reverse ="";
		for (int i=rev.length()-1;i>=0;i--) {
		reverse=reverse+rev.charAt(i);	
		}
		System.out.println(reverse);
		
		
	}
}
