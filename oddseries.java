import java.util.Scanner;
public class oddseries
{
public static void main(String arg[])
{
int n,i=1,s=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter n:");
n=sc.nextInt();
do{

s=s+i;
i=i+2;
}
while(i<=n);
System.out.print("n series:"+s);
}
}