import java.util.Scanner;
public class Atm{
    public static void main(String[] arg){
        int a,b,c,d,n1,n2,n3,n4,total;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st denomination:");
        a=sc.nextInt();
        System.out.print("Enter the 1st denomination number of notes:");
        n1=sc.nextInt();
        System.out.print("Enter the 2st denomination:");
        b=sc.nextInt();
         System.out.print("Enter the 2nd denomination number of notes:");
        n2=sc.nextInt();
        System.out.print("Enter the 3rd denomination:");
        c=sc.nextInt();
         System.out.print("Enter the 3rd denomination number of notes:");
        n3=sc.nextInt();
        System.out.print("Enter the 4th denomination:");
        d=sc.nextInt();
         System.out.print("Enter the 4th denomination number of notes:");
        n4=sc.nextInt();
        total=a*n1+b*n2+c*n3+d*n4;
        System.out.println("Total available balance:"+total);
    }
}