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
        Stack<Character> stack=new Stack<>();
        Queue<Character> queue=new LinkedList<>();
        for(char c:wrd.toCharArray())
        {
            stack.push(c);
            queue.add(c);
        }
        boolean isPalindrome =true;
        while(!queue.isEmpty())
        {
            if(queue.remove()!=stack.pop()) {
                isPalindrome = false;
                System.out.println("Not Palindrome");
                System.exit(0);
            }
        }
        if(isPalindrome)
            System.out.println("Palindrome");
    }
}