import java.util.Scanner;   //Import Scanner class
class Student{   //Beginning of the class 'Student'
    int roll_no;   //Data member
    String name;   //Data member
    Student(int roll_no, String name){   //Parameterized constructor
        this.roll_no = roll_no;
        this.name = name;
    }
    boolean isEqual(Student s){   //Check equality
        if(roll_no == s.roll_no && name.equals(s.name))
            return true;
        else
            return false;
    }
    public static void main(String args[]){   //Beginning of the main method
        Scanner input = new Scanner(System.in);   //Scanner object
        System.out.println("Enter Roll No of Student 1:");
        int r1 = input.nextInt();
        input.nextLine();
        System.out.println("Enter Name of Student 1:");
        String n1 = input.nextLine();
        System.out.println("Enter Roll No of Student 2:");
        int r2 = input.nextInt();
        input.nextLine();
        System.out.println("Enter Name of Student 2:");
        String n2 = input.nextLine();
        Student s1 = new Student(r1, n1);   //Create first object
        Student s2 = new Student(r2, n2);   //Create second object
        if(s1.isEqual(s2))
            System.out.println("Objects are Equal");
        else
            System.out.println("Objects are Not Equal");
    }   //End of the main method
}   //End of the class 'Student'