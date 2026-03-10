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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word : ");
        String wrd=sc.nextLine(),normalized=wrd.replaceAll(" ","").toLowerCase();;

        boolean isPalindrome=true;

        for(int i=0;i<normalized.length();i++)
        {
            if(normalized.charAt(i)!=normalized.charAt(normalized.length()-1-i))
            {
                isPalindrome=false;
                break;
            }
        }

        if(isPalindrome)
            System.out.println("word is Palindrome");
        else
            System.out.println("word is not Palindrome");
    }
}