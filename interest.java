import java.util.Scanner;
public class interest {
    public static void main(String[] arg){
        int time;
        double PA,r,i;
        Scanner sc=new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principal amount:");
        PA=sc.nextDouble();
        System.out.print("Enter the no.of years:");
        time=sc.nextInt();
        System.out.print("IS customer is senior citizen(y/n)");
        char g = input.next().charAt(0);
        if(g=='y'||g=='Y'){
            r=12;
            i=PA*time*r/100;
            System.out.print("Interest:"+i);
        }
        if(g=='n'||g=='N'){
            r=10;
            i=PA*time*r/100;
            System.out.print("Interest:"+i);
        }
    }
}
