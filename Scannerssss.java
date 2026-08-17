import java.util.Scanner;

public class Scannerssss{
    public static void main(String [] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter your name");
         String name = sc.nextLine();
         System.out.println("area of circle");
         double area = sc.nextDouble();
         System.out.println("Name: " + name);
         System.out.println("Area: " + area);
         sc.close();
    }

}
