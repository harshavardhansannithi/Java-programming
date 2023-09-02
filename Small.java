import java.util.Scanner;
public class Small
{
public static void main(String[] arg)
{
int num1,num2,num3;
Scanner sc=new Scanner(System.in);
System.out.print("Enter num1:");
num1=sc.nextInt();
System.out.print("Enter num2:");
num2=sc.nextInt();
System.out.print("Enter num3:");
num3=sc.nextInt();
if(num1<num2&&num1<num3){
System.out.print("num1 is smallest");
}
else if(num2<num1&&num2<num3){
System.out.print("num2 is smallest");
}
else{
System.out.print("num3 is smallest");
}
}
}
