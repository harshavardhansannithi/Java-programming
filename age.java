import java.util.Scanner;
public class age
{
public static void main(String arg[])
{
int age,a;
Scanner sc=new Scanner(System.in);
System.out.print("Enter age:");
age=sc.nextInt();
if (age>18){
System.out.print("You are eligible for voting");
}
else{
a=18-age;
System.out.print("You are not eligible for voting wait for:"+a);
}
}
} 