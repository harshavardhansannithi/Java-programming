import java.util.Scanner;
public class while
{
public static void main(String arg[])
{
int n,i=1,a;
Scanner sc=new Scanner(System.in);
System.out.print("Enter n:");
n=sc.nextInt();
while(i<=n){
a=a+i;
i=i+1;
}
System.out.print("n series"+a);
}
}