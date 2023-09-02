import java.util.Scanner;
class pre8{
public static void main(String[] arg)
{  
int r,sum=0,temp,n;    
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number:");
n=sc.nextInt(); 
temp=n;    
while(n>0){    
sum=n%10;  
r=(r*10)+sum;    
n=n/10;    
}    
if(temp==sum)    
System.out.println("palindrome number ");    
else    
System.out.println("not palindrome");    
}  
}  