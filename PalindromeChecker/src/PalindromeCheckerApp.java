/*
Main Class - PalindromeCheckerApp
Description:
This class is the entry point of the palindrome checker app
At this stage, the application:
-Starts execution from the main() method
-Displays a welcome message
-Shows application version
No palindrome logic added yet
@author Hadi Parvez
@version 2.4.0
 */
import java.util.*;

public class PalindromeCheckerApp {
        private static boolean check(String s, int start, int end) {
            if (start < end) {
                if (s.charAt(start) != s.charAt(end))
                    return false;
                else
                    return check(s, start + 1, end - 1);
            }
            else
                return true;
        }


        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a word : ");
            String wrd=sc.nextLine(),temp = "";

            boolean isPalindrome=check(wrd,0,wrd.length()-1);

            if(isPalindrome)
                System.out.println("word is Palindrome");
            else
                System.out.println("word is not Palindrome");
    }
}