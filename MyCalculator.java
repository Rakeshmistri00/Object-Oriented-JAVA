import java.util.Scanner;   //Import Scanner class
class Calculator{   //Beginning of the class 'Calculator'
    int x, y;   //Data members
    Calculator(int a, int b){   //Parameterized constructor
        x = a;
        y = b;
    }
    void addition(){   //Addition
        System.out.println("Addition = " + (x + y));
    }
    void subtraction(){   //Subtraction
        System.out.println("Subtraction = " + (x - y));
    }
    void multiplication(){   //Multiplication
        System.out.println("Multiplication = " + (x * y));
    }
    void division(){   //Division
        System.out.println("Division = " + (x / y));
    }
}   //End of the class 'Calculator'
class MyCalculator extends Calculator{   //Beginning of the class 'MyCalculator'
    MyCalculator(int a, int b){   //Constructor
        super(a, b);
    }
    void square(int n){   //Find square
        System.out.println("Square = " + (n * n));
    }
}   //End of the class 'MyCalculator'
class CalculationDemo{   //Beginning of the class 'CalculationDemo'
    public static void main(String args[]){   //Beginning of the main method
        Scanner sc = new Scanner(System.in);   //Scanner object
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        MyCalculator obj = new MyCalculator(a, b);   //Create object
        obj.addition();
        obj.subtraction();
        obj.multiplication();
        obj.division();
        System.out.println("Enter a number to find square:");
        int n = sc.nextInt();
        obj.square(n);
    }   //End of the main method
}   //End of the class 'CalculationDemo'