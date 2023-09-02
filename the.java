import java.io.*;
import java.util.*;
class A implements Runnable
{
public void run()
{
int i;
for(i=0;i<=5;i++)
{
System.out.println(i);
}
}
}

class B implements Runnable
{
public void run()
{
int j;
for(j=0;j<=5;j++)
{
System.out.println(j);
}
}
}

class C implements Runnable
{
public void run()
{
int k;
for(k=0;k<=5;k++)
{
System.out.println(k);
}
}
}

class the
{
public static void main(String[] args)
{
A a=new A();
Thread t=new Thread(a);
t.start();
}
}