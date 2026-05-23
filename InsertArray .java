import java.util.Scanner;   //Import the Scanner class from java packages under utility sub-package.
class InsertArray{   //Beginning of the class 'InsertArray'
    public static void main(String[] args) {   //Beginning of the main method
        Scanner input = new Scanner(System.in);   //Create Scanner object for user input
        System.out.println("Enter size of array: ");
        int size = input.nextInt();   //Store array size
        int arr[] = new int[size + 1];   //Create array with extra space for insertion
        System.out.println("Enter array elements:");
        for(int i = 0; i < size; i++){   //Loop for taking array elements
            arr[i] = input.nextInt();
        }
        System.out.println("Enter position to insert element: ");
        int pos = input.nextInt();   //Store insertion position
        if(pos <= 0 || pos > size + 1){   //Check whether position is valid or not
            System.out.println("Invalid Position");
        }
        else{
            System.out.println("Enter element to insert: ");
            int element = input.nextInt();   //Store new element
            for(int i = size; i >= pos; i--){   //Shift array elements to the right side
                arr[i] = arr[i - 1];
            }
            arr[pos - 1] = element;   //Insert new element into array
            System.out.println("Array after insertion:");
            for(int i = 0; i <= size; i++){   //Loop for displaying updated array
                System.out.println(arr[i]);
            }
        }
    }   //End of the main method
}   //End of the class 'InsertArray'