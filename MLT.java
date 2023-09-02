import java.util.Scanner;
class A extends Thread
{
public void run()
{
for(int i=0;i<=5;i++)
{
if(i==3){
sleep(500);}
else{
System.out.println(i);}
}
}
}
class B extends Thread
{
public void run()
{
for(int j=0;j<=5;j++)
{
System.out.println(j);
}
}
}
class C extends Thread
{
public void run()
{
for(int k=0;k<=5;k++)
{
System.out.println(k);
}
}
}
class MLT
{
public static void main(String[] arg)
{
A a=new A();
a.start();
B b=new B();
b.start();
C c=new C();
c.start();

}
}