package task_1;
import java.util.Scanner;
public class SumOfAllNumbersFrom1To10 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Write your number");
        int number = n.nextInt();
        int result = totalAmount(number);
        System.out.println(result);
    }

    private static int totalAmount(int value) {
        int result = 0;
        for(int i=1; i <= value; i++){
            result+=i;
        }

        return result;
    }
}
