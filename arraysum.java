package methods;
import java.util.Scanner;
public class arraysum {
public static int addvalue(int a[]) {
	int b=0;
	int c=a.length;
	for(int i=0;i<c;i++) {
		b=b+a[i];
	}
	return b;
}
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the  number of elements:");
	int a=sc.nextInt();
	int b[]=new int[a];
	System.out.println("Enter the  values");
	for(int i=0;i<a;i++) {
		b[i]=sc.nextInt();
	}
	int c=addvalue(b);
	System.out.println("Sum of array is: "+c);
}
}
