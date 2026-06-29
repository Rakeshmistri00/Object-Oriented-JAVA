import java.util.Scanner;   //Import Scanner class
class PairSum{   //Start of class 'PairSum'
    public static void main(String[] args) {   //Start of main method
        Scanner input = new Scanner(System.in);   //Scanner object for input
        System.out.println("Enter size of array: ");
        int size = input.nextInt();   //Store array size
        int arr[] = new int[size];   //Create array
        System.out.println("Enter array elements:");
        for(int i = 0; i < size; i++){   //Input array elements
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the required sum: ");
        int sum = input.nextInt();   //Store required sum
        System.out.println("Pairs of elements are:");
        for(int i = 0; i < size; i++){   //First loop
            for(int j = i + 1; j < size; j++){   //Second loop
                if(arr[i] + arr[j] == sum){   //Check pair sum
                    System.out.println(arr[i] + " " + arr[j]);   //Print pair
                }
            }
        }
    }   //End of main method
}   //End of class 'PairSum'