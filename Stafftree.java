class Staff
{
public void display()
{
System.out.println("code,name");
}
}
class teacher extends Staff
{
public void display1()
{
System.out.println("Subject");
System.out.println("Publication");
}
}
class Typist extends Staff
{
public void display2()
{
System.out.println("Speed");
}
}
class officer extends Staff
{
public void display3()
{
System.out.println("Grade");
}
}
class Regular extends Typist
{
public void display4()
{
System.out.println("Salary");
}
}
class casual extends Typist
{
public void display5()
{
System.out.println("Daily wages");
}
}
class Stafftree
{
public static void main(String arg[])
{
Staff s=new Staff();
s.display();
teacher n=new teacher();
n.display1();
n.display();
Typist a=new Typist();
a.display2();
a.display();
officer b=new officer();
b.display3();
b.display();
Regular x=new Regular();
x.display4();
x.display2();
casual y=new casual();
y.display5();
y.display2();
}
}