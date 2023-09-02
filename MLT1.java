import java.io.*;
import java.util.*;

class A extends Thread
{
public void run()
{
int i;
for(i=0;i<=5;i++)
{
System.out.print(i);
}
}
}

class B extends Thread
{
public void run()
{
int j;
for(j=0;j<=10;j++)
{
System.out.print(j);
}
}
}

class MLT1
{
public static void main(String[] args)
{
B b=new B();
b.start();
b.setPriority(Thread.MAX_PRIORITY);
}
}