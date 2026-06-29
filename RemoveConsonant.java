import java.util.Scanner;   //Import Scanner class
class RemoveConsonant{   //Start of class
    public static void main(String[] args) {   //Start of main method
        Scanner input = new Scanner(System.in);   //Scanner object for input
        System.out.println("Enter a string:");
        String str = input.nextLine();   //Store input string
        String result = "";   //Store final string
        for(int i = 0; i < str.length(); i++){   //Check each character
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
               ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||
               ch==' '){   //Keep vowels and spaces
                result = result + ch;
            }
        }
        System.out.println("String after deleting consonants:");
        System.out.println(result);   //Print result
    }   //End of main method
}   //End of class