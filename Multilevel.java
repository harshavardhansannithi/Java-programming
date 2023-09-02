class Area
{
public void display()
{
double L,B,H;
double Area = 2 * (L * B + B * H + H * L);
System.out.println("Area of cubiod");
}
}
class volume extends Area
{
public void display1()
{
double L,B,H;
double Volume = L * B * H;
System.out.println("Volume of cubiod");
}
}
class Cubiod extends volume
{
public void display2()
{
System.out.println("Child");
}
}
class Multilevel
{
public static void main(String arg[])
{
double L,B,H;
Scanner sc=new Scanner(System.in);
System.out.println("Length of cubiod:");
L=sc.nextDouble();
System.out.println("Breadth of cubiod:");
B=sc.nextDouble();
System.out.println("Height of cubiod:");
H=sc.nextDouble();
Cubiod s=new Cubiod();
s.display();
s.display1();
s.display2();

}
}