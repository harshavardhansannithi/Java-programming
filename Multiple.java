class A
{
public void display()
{
System.out.println("Bye");
}
}
interface B
{
public void display1();
}
class C extends A implements B
{
public void display1()
{
System.out.println("Interface");
}
}
class Multiple
{
public static void main(String arg[])
{
C s=new C();
s.display();
s.display1();
}
}