import java.util.Scanner;

public class NumbersInAscending {


    public static void main(String[] args) {
        double longestNumber = 1.0 / 0.0;;
        int numberOfShortestNumber = 0;
        int flag = 0;
        Scanner enterNumberOfNumbers = new Scanner(System.in);
        System.out.println("Enter the number of numbers");
        int numberOfNumbers = enterNumberOfNumbers.nextInt();
        int [] arrayNumbers = new int [numberOfNumbers];
        int [] arrayNumbersSort = new int [numberOfNumbers];

        for (int i = 0; i < numberOfNumbers; i++) {
            Scanner enterNumbers = new Scanner(System.in);
            System.out.println("enter the number № "+ (i+1));
            int enteredNumber = enterNumbers.nextInt();
            arrayNumbers [i] = enteredNumber;
        }
        while (flag != arrayNumbers.length){
            double shortestNumber = 1.0 / 0.0;
            for (int i = 0; i < arrayNumbers.length; i++) {
                if (Math.abs(arrayNumbers[i]) <= Math.abs(shortestNumber)) {
                    shortestNumber = arrayNumbers[i];
                    numberOfShortestNumber = i;
                }
            }
            arrayNumbersSort [flag] = arrayNumbers[numberOfShortestNumber];
            arrayNumbers [numberOfShortestNumber] = (int) longestNumber;
            flag++;
        }
        for (int i = 0; i < arrayNumbersSort.length; i++) {
            double tempNumber = Math.abs(arrayNumbersSort[i]);
            int lenghtNumber = 0;
            while (tempNumber >= 1){
                tempNumber = tempNumber / 10;
                lenghtNumber++;
            }
            System.out.println(arrayNumbersSort[i] + " length of number = " + lenghtNumber);
        }

    }
}




