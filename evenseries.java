import java.util.Scanner;
public class evenseries
{
public static void main(String arg[])
{
int n,i=2,s=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter n:");
n=sc.nextInt();
if(i%2==0);
while(i<=n){

s=s+i;
i=i+2;
}
System.out.print("n series:"+s);
}
}