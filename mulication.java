package methods;

import java.util.Scanner;

public class mulication {
	public static int intnumber(int a,int b) {
		int c=a*b;
		 return c;
	 }
	public static float floatnumber(float a,float b) {
		float c=a*b;
		 return c;
		 }
	public static long longnumber(long a,long b) {
		long c=a*b;
		 return c;
		 }
	 public static void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
		 int d,e,f;
		 float g,h,i;
		 long j,k,l;
		 System.out.println("Enter int numbers:");
		  d=sc.nextInt();
		  e=sc.nextInt();
		  f=intnumber(d,e);
		  System.out.println("Mulipicaton of integer number is :"+f);
		 System.out.println("Enter float numbers:");
		 g=sc.nextFloat();
		 h=sc.nextFloat();
		i=floatnumber(g,h);
		System.out.println("Mulipicaton of float number is :"+i);
		 System.out.println("Enter long numbers:");
			j=sc.nextLong();
			k =sc.nextLong();
			l=longnumber(j,k); 
			System.out.println("Mulipicaton of long number is :"+l);
	}
}
