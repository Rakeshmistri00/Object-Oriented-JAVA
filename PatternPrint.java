import java.util.Scanner;   //Import Scanner class
class PatternPrint{   //Start of class 'PatternPrint'
    public static void main(String[] args) {   //Start of main method
        Scanner input = new Scanner(System.in);   //Scanner object for input
        System.out.println("Enter number of lines: ");
        int n = input.nextInt();   //Store number of lines
        for(int i = 1; i <= n; i++){   //Loop for rows
            if(i % 2 != 0){   //Check odd row
                for(int j = 1; j <= i; j++){   //Print *
                    System.out.print("*");
                }
                for(int j = 1; j <= i; j++){   //Print 0
                    System.out.print("0");
                }
            }
            else{   //Check even row
                for(int j = 1; j <= i; j++){   //Print 0
                    System.out.print("0");
                }
                for(int j = 1; j <= 2; j++){   //Print **
                    System.out.print("*");
                }
            }
            System.out.println();   //Move to next line
        }
    }   //End of main method
}   //End of class