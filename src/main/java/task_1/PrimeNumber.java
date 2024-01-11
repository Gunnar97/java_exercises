package task_1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Write your number");
        int number = n.nextInt();
        boolean isPrimeNumber = isPrimeNumber(number);
        if(isPrimeNumber){
            System.out.println("The entered number is prime!");
        }else {
            System.out.println("The entered number is not prime!");
        }
    }

    private static boolean isPrimeNumber(int value) {
        if (value <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
