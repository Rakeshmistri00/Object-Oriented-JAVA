import java.util.Scanner;   //Import the Scanner class from java packages under utility sub-package.
class OccurrenceArray{   //Beginning of the class 'OccurrenceArray'
    public static void main(String[] args) {   //Beginning of the main method
        Scanner input = new Scanner(System.in);   //Create Scanner object for user input
        System.out.println("Enter size of array: ");
        int size = input.nextInt();   //Store array size
        int arr[] = new int[size];   //Create array
        System.out.println("Enter array elements:");
        for(int i = 0; i < size; i++){   //Loop for taking array elements
            arr[i] = input.nextInt();
        }
        System.out.println("Enter element to search: ");
        int element = input.nextInt();   //Store element to search
        int count = 0;   //Variable for counting occurrence
        for(int i = 0; i < size; i++){   //Loop for checking occurrence
            if(arr[i] == element){
                count++;   //Increase count if element matches
            }
        }
        System.out.println("Occurrence of element is: ");
        System.out.println(count);   //Display occurrence count
    }   //End of the main method
}   //End of the class 'OccurrenceArray'