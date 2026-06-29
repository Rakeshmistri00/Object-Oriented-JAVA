import java.util.Scanner;   //Import Scanner class
class NegativeValueException extends Exception{   //Beginning of exception class
    NegativeValueException(String msg){   //Constructor
        super(msg);
    }
}   //End of exception class
class NegativeArray{   //Beginning of the class 'NegativeArray'
    public static void main(String args[]){   //Beginning of the main method
        Scanner sc = new Scanner(System.in);   //Scanner object
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];   //Create array
        try{
            for(int i = 0; i < n; i++){   //Input array elements
                System.out.println("Enter element " + (i + 1) + ":");
                arr[i] = sc.nextInt();
                if(arr[i] < 0){   //Check negative value
                    throw new NegativeValueException("Negative value found");
                }
            }
            System.out.println("Array elements are:");
            for(int i = 0; i < n; i++){
                System.out.println(arr[i]);
            }
        }
        catch(NegativeValueException e){   //Handle custom exception
            System.out.println(e.getMessage());
        }
    }   //End of the main method
}   //End of the class 'NegativeArray'