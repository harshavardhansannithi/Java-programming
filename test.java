import java.util.Scanner;
public class test
{
public static void main(String[] arg)
{
int n,reverse,num;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the n:");
num=sc.nextInt();
while(num!=0){
n=num%10;
reverse=num*10+n;
num=num/10;
System.out.print("Reverse number:"+reverse);
}
}
}

