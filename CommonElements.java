import java.util.Scanner;   //Import Scanner class
class CommonElements{   //Start of class 'CommonElements'
    public static void main(String[] args) {   //Start of main method
        Scanner input = new Scanner(System.in);   //Scanner object for input
        System.out.println("Enter size of first array: ");
        int size1 = input.nextInt();   //Store first array size
        int arr1[] = new int[size1];   //Create first array
        System.out.println("Enter first array elements:");
        for(int i = 0; i < size1; i++){   //Input first array elements
            arr1[i] = input.nextInt();
        }
        System.out.println("Enter size of second array: ");
        int size2 = input.nextInt();   //Store second array size
        int arr2[] = new int[size2];   //Create second array
        System.out.println("Enter second array elements:");
        for(int i = 0; i < size2; i++){   //Input second array elements
            arr2[i] = input.nextInt();
        }
        System.out.println("Common elements are:");
        for(int i = 0; i < size1; i++){   //Check common elements
            for(int j = 0; j < size2; j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
        System.out.println("First array after removing common elements:");
        for(int i = 0; i < size1; i++){   //Print unique elements of first array
            int common = 0;
            for(int j = 0; j < size2; j++){
                if(arr1[i] == arr2[j]){
                    common = 1;
                    break;
                }
            }
            if(common == 0){
                System.out.println(arr1[i]);
            }
        }
        System.out.println("Second array after removing common elements:");
        for(int i = 0; i < size2; i++){   //Print unique elements of second array
            int common = 0;
            for(int j = 0; j < size1; j++){
                if(arr2[i] == arr1[j]){
                    common = 1;
                    break;
                }
            }

            if(common == 0){
                System.out.println(arr2[i]);
            }
        }
    }   //End of main method
}   //End of class