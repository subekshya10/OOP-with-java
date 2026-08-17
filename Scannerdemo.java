import java.util.Scanner;
 class Scannerdemo
  {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("name is: " + name);
    System.out.println("Enter your age");
    int age= sc.nextInt();
    System.out.println("age is: " + age);
    sc.close();
    }
    
}
