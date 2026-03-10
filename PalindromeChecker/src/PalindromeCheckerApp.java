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

public class PalindromeCheckerApp {
    public static void main(String[] args){
        String wrd="madam",temp = "";
        for(int i=0;i<wrd.length();i++)
            temp=wrd.charAt(i)+temp;
        if(temp.equals(wrd))
            System.out.println(wrd +" is Palindrome");
        else
            System.out.println(wrd +" is Not Palindrome");
    }
}