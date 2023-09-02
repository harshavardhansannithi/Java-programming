import java.util.Scanner;
public class multiply
{
public static void main(String[] arg){
double x,y,z;
Scanner sc=new Scanner(System.in);
System.out.print("Enter first number:");
x=sc.nextFloat();
System.out.print("Enter second number:");
y=sc.nextFloat();
z=x*y;
System.out.print("Mutiply of two float numbers:"+z);
}
}
