import java.util.Scanner;   //Import Scanner class
class Rectangle{   //Beginning of the class 'Rectangle'
    int length, breadth;   //Data members
    Rectangle(int l, int b){   //Parameterized constructor
        length = l;
        breadth = b;
    }
    void area(){   //Calculate area
        System.out.println("Area = " + (length * breadth));
    }
    void perimeter(){   //Calculate perimeter
        System.out.println("Perimeter = " + (2 * (length + breadth)));
    }
}   //End of the class 'Rectangle'
class Square extends Rectangle{   //Beginning of the class 'Square'
    Square(int side){   //Constructor
        super(side, side);
    }
}   //End of the class 'Square'
class GeoDiagram{   //Beginning of the class 'GeoDiagram'
    public static void main(String args[]){   //Beginning of the main method
        Scanner input = new Scanner(System.in);   //Scanner object
        System.out.println("Enter length of rectangle:");
        int l = input.nextInt();
        System.out.println("Enter breadth of rectangle:");
        int b = input.nextInt();
        Rectangle r = new Rectangle(l, b);   //Create rectangle object
        System.out.println("Rectangle");
        r.area();
        r.perimeter();
        System.out.println("Enter side of square:");
        int s = input.nextInt();
        Square sq = new Square(s);   //Create square object
        System.out.println("Square");
        sq.area();
        sq.perimeter();
    }   //End of the main method
}   //End of the class 'GeoDiagram'