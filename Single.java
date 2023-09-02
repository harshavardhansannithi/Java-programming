class A
{
public void display()
{
System.out.println("Base");
}
}
class B extends A
{
public void display1()
{
System.out.println("Derived");
}
}
class Single
{
public static void main(String[] arg)
{
B b=new B();
b.display1();
B a=new B();
a.display();
}
}
