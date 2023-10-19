package code;

import java.util.Scanner;

public class primenumber {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=in.nextInt();
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count=1;
			}
		}
		if(count==0) {
			System.out.println("it is a prime number");
		}else {
			System.out.println("it is not a prime number");
		}
	}

}
