public  class StudentResult {
    public static void main(String [] args)
    {
        try{
            String name = args[0];
            int rollno = Integer.parseInt(args[1]);
            int marks1 = Integer.parseInt(args[2]);
            int marks2 = Integer.parseInt(args[3]);
            int marks3 = Integer.parseInt(args[4]);
            if(marks1<0 || marks1>100 ||
               marks2<0 || marks2>100 ||
               marks3<0 || marks3>100){
                System.out.println("marks should be between 0 and 100");
                return;
               }
               int total= marks1+marks2+marks3;
               double percentage= total/3.0;
               String grade;
               if (percentage>=80)
                grade="A";
            else if (percentage>=60)
                grade="B";
            else if (percentage>=40)
                grade="C";
            else
                grade="F";
            String resultstatus ;
            if(percentage>=40)
                resultstatus="pass";
            else
                resultstatus="fail";
            System.out.println("Name: "+name);
            System.out.println("Roll No: "+rollno);
            System.out.println("Marks1: "+marks1);
            System.out.println("Marks2: "+marks2);
            System.out.println("Marks3: "+marks3);
            System.out.println("Total: "+total);
            System.out.println("Percentage: "+percentage);
            System.out.println("Grade: "+grade);
            System.out.println("Resultstatus: "+resultstatus);
        }

            catch (NumberFormatException e)
           {
            System.out.println("enter valid numbers");

            }
        }
    }
    

