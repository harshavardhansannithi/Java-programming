import java.util.Scanner;
public class pre
{
public static void main(String[] arg)
{
int age,a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Age:");
age=sc.nextInt();
if(age>18)
{
System.out.println("Your are eligible to Vote");
}
else{
a=18-age;
System.out.println("Your are not eligible to vote wait for"+a);
}
}
}
 