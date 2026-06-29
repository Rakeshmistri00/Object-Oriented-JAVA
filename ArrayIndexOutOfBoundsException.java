import java.util.Scanner;   //Import Scanner class
class ExceptionDemo{   //Beginning of the class 'ExceptionDemo'
    public static void main(String args[]){   //Beginning of the main method
        Scanner sc = new Scanner(System.in);   //Scanner object
        try{
            int arr[] = new int[5];   //Create array
            System.out.println("Enter index:");
            int index = sc.nextInt();
            System.out.println("Enter number:");
            int num = sc.nextInt();
            arr[index] = 100;   //May generate ArrayIndexOutOfBoundsException
            int result = 100 / num;   //May generate ArithmeticException
            System.out.println("Result = " + result);
        }
        catch(ArrayIndexOutOfBoundsException e){   //Handle array exception
            System.out.println("ArrayIndexOutOfBoundsException Occurred");
        }
        catch(ArithmeticException e){   //Handle arithmetic exception
            System.out.println("ArithmeticException Occurred");
        }
        System.out.println("Program Ended");
    }   //End of the main method
}   //End of the class 'ExceptionDemo'