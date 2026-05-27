import java.util.Scanner;   //Import Scanner class
class MatrixOperation{   //Start of class
    public static void main(String[] args) {   //Start of main method
        Scanner input = new Scanner(System.in);   //Scanner object for input
        System.out.println("Enter number of rows: ");
        int row = input.nextInt();   //Store rows
        System.out.println("Enter number of columns: ");
        int col = input.nextInt();   //Store columns
        int a[][] = new int[row][col];   //Create first matrix
        int b[][] = new int[row][col];   //Create second matrix
        int result[][] = new int[row][col];   //Create result matrix
        System.out.println("Enter first matrix elements:");
        for(int i = 0; i < row; i++){   //Input first matrix
            for(int j = 0; j < col; j++){
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter second matrix elements:");
        for(int i = 0; i < row; i++){   //Input second matrix
            for(int j = 0; j < col; j++){
                b[i][j] = input.nextInt();
            }
        }
        System.out.println("Choose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        int choice = input.nextInt();   //Store user choice
        switch(choice){
            case 1:   //Addition
                for(int i = 0; i < row; i++){
                    for(int j = 0; j < col; j++){
                        result[i][j] = a[i][j] + b[i][j];
                    }
                }
                break;
            case 2:   //Subtraction

                for(int i = 0; i < row; i++){
                    for(int j = 0; j < col; j++){
                        result[i][j] = a[i][j] - b[i][j];
                    }
                }
                break;
            case 3:   //Multiplication
                for(int i = 0; i < row; i++){
                    for(int j = 0; j < col; j++){
                        result[i][j] = 0;
                        for(int k = 0; k < col; k++){
                            result[i][j] = result[i][j] + a[i][k] * b[k][j];
                        }
                    }
                }
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        System.out.println("Result Matrix:");
        for(int i = 0; i < row; i++){   //Print result matrix
            for(int j = 0; j < col; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }   //End of main method
}   //End of class