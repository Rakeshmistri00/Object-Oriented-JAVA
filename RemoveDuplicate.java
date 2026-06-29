import java.util.Scanner;   //Import Scanner class
class RemoveDuplicate{   //Start of class 'RemoveDuplicate'
    public static void main(String[] args) {   //Start of main method
        Scanner input = new Scanner(System.in);   //Scanner object for input
        System.out.println("Enter size of array: ");
        int size = input.nextInt();   //Store array size
        int arr[] = new int[size];   //Create array
        System.out.println("Enter array elements:");
        for(int i = 0; i < size; i++){   //Input array elements
            arr[i] = input.nextInt();
        }
        int temp[] = new int[size];   //Temporary array
        int count = 0;   //Count unique elements
        for(int i = 0; i < size; i++){   //First loop
            int duplicate = 0;   //Check duplicate element
            for(int j = 0; j < count; j++){   //Second loop
                if(arr[i] == temp[j]){   //Check duplicate
                    duplicate = 1;
                    break;
                }
            }
            if(duplicate == 0){   //Store unique element
                temp[count] = arr[i];
                count++;
            }
        }
        System.out.println("Array after removing duplicates:");
        for(int i = 0; i < count; i++){   //Print new array
            System.out.println(temp[i]);
        }
        System.out.println("New length of array:");
        System.out.println(count);   //Print new length
    }   //End of main method
}   //End of class 