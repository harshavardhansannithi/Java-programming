import java.util.Scanner;
public class for9
{
public static void main(String arg[])
{
int n,i,a;
Scanner sc=new Scanner(System.in);
System.out.print("Enter n:");
n=sc.nextInt();
for(i=100;i<=n;i++){
if(i%9==0){
System.out.println("this no div by 9 "+i);
}
}
}
}