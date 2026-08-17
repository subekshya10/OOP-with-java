public class Student 
{
    public static void main(String args[]){
        try{
            String name =args[0];
            int rollno= Integer.parseInt(args[1]);
            int marks1= Integer.parseInt(args[2]);
            int marks2= Integer.parseInt(args[3]);
            int marks3= Integer.parseInt(args[4]);
            int total= marks1+marks2+marks3;
            double percentage = total/3.0;
            System.out.println("Name: "+name);
            System.out.println("Roll No: "+rollno);
            System.out.println("Marks1: "+marks1);
            System.out.println("Marks2: "+marks2);
            System.out.println("Marks3: "+marks3);
            System.out.println("Total: "+total);

        
        if (percentage>=80)
        
            System.out.println("grade=A");
            else if (percentage>=60)
            
                System.out.println("grade=B");
            else if (percentage>=40)
                System.out.println("grade=C");
            else
                System.out.println("grade=F");
        }
            
            catch(NumberFormatException e){  
    }    
    }
}
