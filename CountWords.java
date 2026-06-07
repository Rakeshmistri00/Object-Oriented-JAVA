import java.util.Scanner;   //Import Scanner class
class CountWords{   //Beginning of the class 'CountWords'
    public static void main(String[] args) {   //Beginning of the main method
        Scanner input = new Scanner(System.in);   //Scanner object for input
        System.out.println("Enter a string:");
        String str = input.nextLine();   //Store input string
        int count = 1;   //Store word count
        for(int i = 0; i < str.length(); i++){   //Check each character
            if(str.charAt(i) == ' '){   //Check space
                count++;
            }
        }
        System.out.println("Number of words in the string:");
        System.out.println(count);   //Print word count
    }   //End of the main method
}   //End of the class 'CountWords'