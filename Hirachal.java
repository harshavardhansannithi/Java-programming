class P
{
public void display()
{
System.out.println("Grandparent");
}
}
class C1 extends P
{
public void display1()
{
System.out.println("Parent");
}
}
class C2 extends P
{
public void display2()
{
System.out.println("Child");
}
}
class C3 extends P
{
public void display3()
{
System.out.println("GrandChild");
}
}

class Hirachal
{
public static void main(String arg[])
{
C3 s=new C3();
s.display3();
s.display();
C1 n=new C1();
n.display1();
n.display();
C2 a=new C2();
a.display2();
a.display();
}
}