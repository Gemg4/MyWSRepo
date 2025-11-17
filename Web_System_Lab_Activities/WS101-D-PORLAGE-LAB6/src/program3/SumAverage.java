package program3;

import java.util.Scanner;

public class SumAverage {
        public void start(){
            Scanner scn = new Scanner(System.in);
            int[] numbers = new int[5];
            IO.println("Enter 5 number:");
            for (int i = 0; i < 5; i++) {
                IO.print(i+1+": ");
                numbers[i] = scn.nextInt();
            }
            for(int num: numbers) {
                IO.print(num + " ");
            }
            int sum = sum(numbers);
            double avg = avg(sum, numbers.length);
            IO.println("\nSum is: "+ sum);
            IO.println("Avg is: " + avg);
        }

        private int sum(int[] numbers){
            int sum = 0;
            for(int num : numbers) sum += num;
            return sum;
        }

        private double avg(int sum, int length){
            return  (double) sum / length;
        }
}