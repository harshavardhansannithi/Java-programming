import java.util.Scanner;
class pre9
{
public static void main(String[] arg)
{
int i;
int a[]=new int[20];
Scanner sc=new Scanner(System.in);
for(i=0;i<=5;i++)
{
a[i]=sc.nextInt();
}
if(a[i]%3==0 && a[i]%5==0){
System.out.print("Health is wealth");
}
else if(a[i]%3==0){
System.out.print("Health");
}
else if(a[i]%3==0){
System.out.print("Health");
}
else{
System.out.print("Zero");
}
}
}
 