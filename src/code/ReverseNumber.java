package code;

import java.util.Scanner;

public class ReverseNumber {
 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the Number:");
	int num = in.nextInt();
	int reverse = 0;
	int rem;
	while (num>0){
		rem = num % 10;
		reverse = (reverse*10)+rem;
		num = num/10;
	}
System.out.println(reverse);	
	
}
}
