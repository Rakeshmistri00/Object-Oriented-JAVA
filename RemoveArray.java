import java.util.Scanner;   //Import the Scanner class from java packages under utility sub-package.
class RemoveArray{   //Beginning of the class 'RemoveArray'
    public static void main(String[] args) {   //Beginning of the main method
        Scanner input = new Scanner(System.in);   //Create Scanner object for user input
        System.out.println("Enter size of array: ");
        int size = input.nextInt();   //Store array size
        int arr[] = new int[size];   //Create array
        System.out.println("Enter array elements:");
        for(int i = 0; i < size; i++){   //Loop for taking array elements
            arr[i] = input.nextInt();
        }
        System.out.println("Enter element to remove: ");
        int element = input.nextInt();   //Store element to remove
        int position = -1;   //Variable for storing element position
        for(int i = 0; i < size; i++){   //Loop for searching the element
            if(arr[i] == element){
                position = i;
                break;
            }
        }
        if(position == -1){   //Check whether element exists or not
            System.out.println("Element not found");
        }
        else{
            for(int i = position; i < size - 1; i++){   //Shift elements to left side
                arr[i] = arr[i + 1];
            }
            System.out.println("Array after removing element:");
            for(int i = 0; i < size - 1; i++){   //Loop for displaying updated array
                System.out.println(arr[i]);
            }
        }

    }   //End of the main method

}   //End of the class 'RemoveArray'