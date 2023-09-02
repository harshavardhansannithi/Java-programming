import java.util.Scanner;
public class largest
{
public static void main(String[] arg){
int num1,num2,num3;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the num1:");
num1=sc.nextInt();
System.out.print("Enter the num2:");
num2=sc.nextInt();
System.out.print("Enter the num3:");
num3=sc.nextInt();
if(num1>num2&&num1>num3){
System.out.print("Num1 is largest");
}
else if(num2>num1&&num2>num3){
System.out.print("Num2 is largest");
}
else{
System.out.print("Num3 is largest");
}
}
}
