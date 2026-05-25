import java.util.Scanner;   //Import Scanner class
class LongestSequence{   //Start of class 'LongestSequence'
    public static void main(String[] args) {   //Start of main method
        Scanner input = new Scanner(System.in);   //Scanner object for input
        System.out.println("Enter size of array: ");
        int size = input.nextInt();   //Store array size
        int arr[] = new int[size];   //Create array
        System.out.println("Enter array elements:");
        for(int i = 0; i < size; i++){   //Input array elements
            arr[i] = input.nextInt();
        }
        //Sort array in ascending order
        for(int i = 0; i < size - 1; i++){
            for(int j = i + 1; j < size; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int maxLength = 1;   //Store longest sequence length
        int currentLength = 1;   //Store current sequence length
        for(int i = 0; i < size - 1; i++){   //Check consecutive elements
            if(arr[i] + 1 == arr[i + 1]){
                currentLength++;
            }
            else if(arr[i] != arr[i + 1]){
                if(currentLength > maxLength){
                    maxLength = currentLength;
                }
                currentLength = 1;
            }
        }
        if(currentLength > maxLength){   //Final check
            maxLength = currentLength;
        }
        System.out.println("Length of longest consecutive sequence:");
        System.out.println(maxLength);   //Print result
    }   //End of main method
}   //End of class 