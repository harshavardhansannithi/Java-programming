class A
{
public void display()
{
System.out.println("Grandparent");
}
}
class B extends A
{
public void display1()
{
System.out.println("Parent");
}
}
interface D
{
public void display2();
}
class C extends B implements D
{
public void display2()
{
System.out.println("Hybrid");
}
}
class Hybrid
{
public static void main(String arg[])
{
C s=new C();
s.display2();
s.display1();
s.display();
}
}