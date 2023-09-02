import java.util.Scanner;
public class swapn
{
public static void swap(int m, int n)
	{
		// Swapping the values
		int temp =m;
		m =n;
	        n = temp;
System.out.print("m is" +n );
System.out.print("n is"  +m);
	}
 
public static void main(String[] args)
{
int temp,m,n;
Scanner sc=new Scanner(System.in);
System.out.print("m=");
m=sc.nextInt();
System.out.print("n=");
n=sc.nextInt();
System.out.print("m is"+n );
System.out.print("n is"+m);
}
}