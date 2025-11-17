package program2;

import java.util.Scanner;

public class Fibonacci {
    public void fib(){
        Scanner scn = new Scanner(System.in);
        IO.println("Enter Fib num:");
        int num = scn.nextInt();
        fib(num);
    }

    public void fib(int num){
        int num1 = 0, num2 = 1;
        for (int i = 0; i <= num; i++) {
            IO.print(num1 + " ");
            int next = num1+num2;
            num1 = num2;
            num2 = next;
        }
    }
}
