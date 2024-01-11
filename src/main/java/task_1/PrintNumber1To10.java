package task_1;
import java.util.Scanner;
public class PrintNumber1To10 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Write your number from:");
        int numberFrom = n.nextInt();
        System.out.println("Write your number to:");
        int numberTo = n.nextInt();
        for (int i = numberFrom; i<= numberTo; i++ ){
            System.out.println(i);
        }
    }
}
