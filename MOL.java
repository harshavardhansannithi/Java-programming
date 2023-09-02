class Method
{
int area(int x)
{
return x*x;}
float area(float y)
{
return y+y;}
float area(int a,float b)
{
return a*b;}
float area(float x,float y)
{
return x/y;}
}
class MOL
{
public static void main(String[] arg)
{
Method m=new Method();
System.out.println(m.area(10));
System.out.println(m.area(4.5f));
System.out.println(m.area(2,4.5f));
System.out.println(m.area(2.3f,1.5f));
}
}
 
