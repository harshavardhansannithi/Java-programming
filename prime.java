import java.util.Scanner;
public class prime
{
public static void main(String arg[])
{
int n,i,a;
Scanner sc=new Scanner(System.in);
System.out.print("Enter n:");
n=sc.nextInt();
for(i=100;i<=n;i++){
if(i%1==0 && i%i==0){
a=a+i;
}
if(a>2){
System.out.println("Composite number:");
}
else{
System.out.println("prime number "+a);
}
}
}
}