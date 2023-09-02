class p
{
int x=10;
public void display()
{
System.out.println("10");
}
}
class c extends p
{
int y=5;
public void display1()
{
System.out.println("5");
}
}
class Inherits
{
public static void main(String arg[])
{
c s=new c();
s.display1();
s.display();
}
}