package reptilion.imperia.com;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner someLine = new Scanner(System.in);
        System.out.println("Enter some text");
        String line = someLine.nextLine();
        char [] reverse = line.toCharArray();
        int length = line.length();
        int i = 0;
        while (i<length){
            i++;
            System.out.print(reverse[length-i]);
        }
    }
}
