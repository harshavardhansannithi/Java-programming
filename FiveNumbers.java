import java.util.Scanner;
public class FiveNumbers{
public static void main(String arg[])
{
int x,y,z,a,b,sum,avg;
Scanner sc=new Scanner(System.in);
System.out.print("Enter First Number:");
x=sc.nextInt();
System.out.print("Enter Second Number:");
y=sc.nextInt();
System.out.print("Enter Third Number:");
z=sc.nextInt();
System.out.print("Enter Fourth Number:");
a=sc.nextInt();
System.out.print("Enter Fifth Number:");
b=sc.nextInt();
sum=x+y+z+a+b;
avg=sum/5;
System.out.print("sum value:"+sum);
System.out.print("avg value:"+avg);
}
}