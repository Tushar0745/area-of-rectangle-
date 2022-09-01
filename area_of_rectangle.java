import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        int length,breadth,height,t;
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter Length = ");
        length=scan.nextInt();
        System.out.println("Enter Breadth = ");
        breadth=scan.nextInt();
        System.out.println("Enter Height = ");
        height=scan.nextInt();
        t=length*breadth*height;
        
        System.out.println("Area Of Rectangle =" +t);
    }
}
