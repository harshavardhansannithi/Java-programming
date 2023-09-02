import java.util.Scanner;
class Student
{
public void display()
{
int rollno,Math1,Math2,Chem,Phys,Eng,Sum;
Scanner sc=new Scanner(System.in);
System.out.println("Student Roll no:");
rollno=sc.nextInt();
}
}
class Student extends Subjects
{
public void display1()
{
System.out.println("Math1:");
Math2=sc.nextInt();
System.out.println("Math2:");
Math2=sc.nextInt();
System.out.println("Chem:");
Chem=sc.nextInt();
System.out.println("Phys:");
Phys=sc.nextInt();
System.out.println("Eng:");
Eng=sc.nextInt();
}
}
class Students extends C
{
public void display2()
{
C=Math1+Math2+Chem+Phys+Eng;
System.out.println("C");
}
}
class Three
{
public static void main(String arg[])
{
C s=new C();
s.display();
s.display1();
s.display2();
}
}