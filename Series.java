import java.util.Scanner;
public class Series
{
public static void main(String arg[])
{
int n,i=1,s=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter n:");
n=sc.nextInt();
while(i<=n){

s=s+i;
i=i+1;
}
System.out.print("n series:"+s);
}
}