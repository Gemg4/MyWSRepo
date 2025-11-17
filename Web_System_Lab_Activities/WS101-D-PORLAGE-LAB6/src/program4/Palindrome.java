package program4;

import java.util.Scanner;

public class Palindrome {
    public void isPalindrome(){
        Scanner scn = new Scanner(System.in);
        IO.println("Enter text: ");
        String text = scn.nextLine();
        isPalindrome(text);
    }

    public void isPalindrome(String text){
        String[] letters = text.split("");
        String formedText = "";
        for (int i = letters.length -1; i >= 0 ; i--) {
            formedText += letters[i];
        }
        if(text.equals(formedText)) {
            IO.println(text + " is a palindrome");
        } else {
            IO.println(text + " is not s palindrome");
        }
    }
}
