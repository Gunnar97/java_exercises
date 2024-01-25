package task_1;

import java.util.Scanner;
public class FindFactorial {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Write your number");
        int number = n.nextInt();
        long result = findFactorial (number);
        System.out.println(result);
    }

    private static long findFactorial(int value) {
        long result = 1;
        if(value == 0 || value == 1){
            result = 1;
        }
        if(value>39){
         System.out.println("You can choose number from 0 to 39");
         result = 0;
        }

        for(int i=1; i <= value; i++) {
            result *= i;
        }

        return result;
    }
}
