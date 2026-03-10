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
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word : ");
        String wrd=sc.nextLine(),temp = "";
        Deque<Character> deque=new ArrayDeque<>();
        for(char c:wrd.toCharArray())
        {
            deque.addLast(c);
        }
        boolean isPalindrome =true;
        while(deque.size()>1)
        {
            if(deque.removeLast()!=deque.removeFirst()) {
                isPalindrome = false;
                System.out.println("Not Palindrome");
                System.exit(0);
            }
        }
        if(isPalindrome)
            System.out.println("Palindrome");
    }
}