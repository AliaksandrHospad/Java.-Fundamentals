package reptilion.imperia.com;
import java.util.Scanner;

public class SumAndMultiplication {


        public static void main(String[] args) {
            int sum = 0;
            int mult = 1;
            int enterNumbersTime;
            Scanner enterNumberOfNumbers = new Scanner(System.in);
            System.out.println("Enter the number of numbers");
            int numberOfNumbers = enterNumberOfNumbers.nextInt();
//            int [] arrayNumbers = new int [numberOfNumbers];
            for (int i = 0; i < numberOfNumbers; i++) {
                Scanner enterNumbers = new Scanner(System.in);
                System.out.println("enter the number № "+ (i+1));
//                arrayNumbers [i]= enterNumbers.nextInt();
                enterNumbersTime = enterNumbers.nextInt();
                sum = sum + enterNumbersTime;
                mult = mult * enterNumbersTime;
                }
            System.out.println("summa= " + sum + "  multiplay= " + mult);
        }
    }


