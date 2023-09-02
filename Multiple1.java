interface A
{
public void display();
}
interface B
{
public void display1();
} 
class C implements A,B
{
public void display2()
{
System.out.println("Interface");
}
}
class Multiple1
{
public static void main(String arg[])
{
C c=new C();
c.display();
c.display1();
}
}