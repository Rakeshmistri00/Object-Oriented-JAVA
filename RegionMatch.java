import java.util.Scanner;   //Import Scanner class
class RegionMatch{   //Beginning of the class 'RegionMatch'
    public static void main(String[] args) {   //Beginning of the main method
        Scanner input = new Scanner(System.in);   //Scanner object for input
        System.out.println("Enter first string:");
        String str1 = input.nextLine();   //Store first string
        System.out.println("Enter second string:");
        String str2 = input.nextLine();   //Store second string
        boolean result1 = str1.regionMatches(11, str2, 0, 2);   //Check first region
        boolean result2 = str1.regionMatches(0, str2, 0, 3);   //Check second region
        boolean result3 = str1.regionMatches(14, str2, 0, 3);   //Check third region
        System.out.println("str1[11 - 13] == str2[0 - 2] ?");
        System.out.println(result1);
        System.out.println("str1[0 - 3] == str2[0 - 3] ?");
        System.out.println(result2);
        System.out.println("str1[14 - 17] == str2[0 - 3] ?");
        System.out.println(result3);
    }   //End of the main method
}   //End of the class 'RegionMatch'