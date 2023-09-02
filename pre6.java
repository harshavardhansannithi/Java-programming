import java.util.Scanner;
class pre6{
public static void main(String[] arg){
int i,n,j;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number:");
n=sc.nextInt();
for (i=1;i<=n;i++){
int count=0;
for(j=2;j<i;j++){
if (i%j==0){
count++;
break;
}
}
if(count==0)
System.out.println("Prime numbers:"+i);
}
}
}
}



