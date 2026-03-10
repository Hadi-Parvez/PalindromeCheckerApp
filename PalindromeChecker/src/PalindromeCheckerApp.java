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
@version 2.0
 */
import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word : ");
        String wrd=sc.nextLine(),temp = "";
        for(int i=0;i<wrd.length();i++)
            temp=wrd.charAt(i)+temp;
        if(temp.equals(wrd))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}