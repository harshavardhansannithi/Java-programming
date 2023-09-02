import java.util.Scanner;
public class pre4{
public static void main(String[] arg){
int days,year,a,weeks;
Scanner sc=new Scanner(System.in);
System.out.print("Enter no of days:");
days=sc.nextInt();
year=days/365;
a=days%365;
weeks=a/7;
days=days%7;
System.out.println("Years:"+year);
System.out.println("weeks:"+weeks);
System.out.println("days:"+days);
}
}




