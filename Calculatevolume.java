import java.util.Scanner;   //Import Scanner class
class Box{   //Beginning of the class Box
    double length, breadth, height;   //Data members
    Box(double l, double b, double h){   //Parameterized constructor
        length = l;
        breadth = b;
        height = h;
    }
    Box(Box x){   //Constructor with object argument
        length = x.length;
        breadth = x.breadth;
        height = x.height;
    }
    double volume(){   //Calculate volume
        return length * breadth * height;
    }
    public static void main(String args[]){   //Beginning of the main method
        Scanner input = new Scanner(System.in);   //Scanner object
        System.out.println("Enter length:");
        double l = input.nextDouble();
        System.out.println("Enter breadth:");
        double b = input.nextDouble();
        System.out.println("Enter height:");
        double h = input.nextDouble();
        Box b1 = new Box(l, b, h);   //First object
        Box b2 = new Box(b1);   //Second object using object argument
        System.out.println("Volume of the box is:");
        System.out.println(b2.volume());
    }   //End of the main method
}   //End of the class Box