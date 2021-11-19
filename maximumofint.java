package methods;
import java.util.Scanner;
public class maximumofint {
public static int max(int a,int b) {
	int c=Math.max(a, b);
	return c;
}
public static int max(int a,int b,int c) {
	int d=Math.max(Math.max(a, b),c);
	return d;
}
public static int max(int a,int b,int c,int d) {
	int e=Math.max(Math.max(Math.max(a, b),c),d);
	return e;
	}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number 1:");
	int f=sc.nextInt();
	System.out.println("Enter number 2:");
	int g=sc.nextInt();
	System.out.println("Enter number 3:");
	int h=sc.nextInt();
	System.out.println("Enter number 4:");
	int i=sc.nextInt();
	int j=max(f,g);
	int k=max(f,g,h);
	int l=max(f,g,h,i);
	System.out.println("Maximum of number "+f+" and "+g+" is "+j);
	System.out.println("Maximum of number "+f+","+g+" and "+h+" is "+k);
	System.out.println("Maximum of number "+f+" ,"+g+","+h+" and "+i+" is "+l);
	}
}
