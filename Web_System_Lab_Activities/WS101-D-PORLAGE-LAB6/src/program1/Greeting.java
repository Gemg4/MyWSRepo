package program1;

import java.util.Scanner;

public class Greeting {
    public void greet(){
        Scanner scn = new Scanner(System.in);
        IO.println("Enter your name:");
        String name = scn.nextLine();
        IO.println("Enter your age:");
        int age = scn.nextInt();
        IO.println("Hello " + name + " you are " + age + " years old!");
    }
}
