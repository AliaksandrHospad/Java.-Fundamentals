package reptilion.empire.com;
import java.util.Scanner;
public class RandomNumbers {
    public static void main(String[] args) {
        Scanner enterNumberOfRandomNumbers = new Scanner(System.in);
        System.out.println("Enter the number of random numbers");
        int numberOfRandomNumbers = enterNumberOfRandomNumbers.nextInt();
        int i = 0;
        while (i < numberOfRandomNumbers){
            i++;
            System.out.print(" " + (int) (Math.random()*10));
        }

    }
}
