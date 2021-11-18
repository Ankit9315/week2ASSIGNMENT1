package methods;

import java.util.Scanner;

public class multiply {
	public static int Multiplying(int a,int b) {
		int c=a*b;
		 return c;
	 }
	 public static void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter first number");
		 int a=sc.nextInt();
		 System.out.println("Enter second number");
		 int b=sc.nextInt();
		 int f=Multiplying(a,b);
		 System.out.println(" Multiplication of numbers is: "+f);
	}
}
