package task_1;

import java.util.Scanner;

public class FindFaktorialByRecursion {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Write your number");
        int number = n.nextInt();
        if (number<0 || number > 39){
            System.out.println("You can choose number from 0 to 39");
            System.out.println("Please enter your number: ");
            number = n.nextInt();
        }
        long result = findFactorial (number);
        System.out.println(result);
    }

    public  static long findFactorial(int n){
        long result = 1;
        if(n == 1 || n == 0){
            return result;
        }
        result= n * findFactorial(n-1);
        return result;
    }
}

