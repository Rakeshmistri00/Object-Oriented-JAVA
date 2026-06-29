import java.util.Scanner;   //Import Scanner class
class Cube{   //Beginning of the class 'Cube'
    double side;   //Data member
    Cube(double side){   //Constructor
        this.side = side;
    }
    double getVolume(){   //Calculate volume of cube
        return side * side * side;
    }
}   //End of the class 'Cube'
class Cylinder extends Cube{   //Beginning of the class 'Cylinder'
    double height;   //Data member
    Cylinder(double side, double height){   //Constructor
        super(side);
        this.height = height;
    }
    double getVolume(){   //Calculate volume of cylinder
        return 3.14 * side * side * height;
    }
}   //End of the class 'Cylinder'
class VolumeDemo{   //Beginning of the class 'VolumeDemo'
    public static void main(String args[]){   //Beginning of the main method
        Scanner sc = new Scanner(System.in);   //Scanner object
        System.out.println("Enter side of cube:");
        double s1 = sc.nextDouble();
        Cube c1 = new Cube(s1);
        System.out.println("Volume of Cube = " + c1.getVolume());
        System.out.println("Enter radius of cylinder:");
        double r = sc.nextDouble();
        System.out.println("Enter height of cylinder:");
        double h = sc.nextDouble();
        Cylinder c2 = new Cylinder(r, h);
        System.out.println("Volume of Cylinder = " + c2.getVolume());
    }   //End of the main method
}   //End of the class 'VolumeDemo'