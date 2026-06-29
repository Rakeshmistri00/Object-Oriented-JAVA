import java.util.Scanner;   //Import Scanner class
class PalindromeString{   //Start of class
    public static void main(String[] args) {   //Start of main method
        Scanner input = new Scanner(System.in);   //Scanner object for input
        System.out.println("Enter a string:");
        String str = input.nextLine();   //Store input string
        String reverse = "";   //Store reversed string
        for(int i = str.length() - 1; i >= 0; i--){   //Reverse the string
            reverse = reverse + str.charAt(i);
        }
        if(str.equals(reverse)){   //Check palindrome
            System.out.println("Palindrome String");
        }
        else{
            System.out.println("Not a Palindrome String");
        }
    }   //End of main method
}   //End of class