import java.util.Scanner;

public class ShortestAndLongestNumber {


    public static void main(String[] args) {
        double shortestNumber = -1.0 / 0.0;
        double longestNumber = 0;
        int lengthShortestNumber = 0;
        int lenghtLongestNumber = 0;
        Scanner enterNumberOfNumbers = new Scanner(System.in);
        System.out.println("Enter the number of numbers");
        int numberOfNumbers = enterNumberOfNumbers.nextInt();
        for (int i = 0; i < numberOfNumbers; i++) {
            Scanner enterNumbers = new Scanner(System.in);
            System.out.println("enter the number № "+ (i+1));
            int enteredNumber = enterNumbers.nextInt();
            if (Math.abs(enteredNumber) > Math.abs(longestNumber)) longestNumber = enteredNumber;
            if (Math.abs(enteredNumber) < Math.abs(shortestNumber)) shortestNumber = enteredNumber;
        }
        double tempLongestNumber = Math.abs(longestNumber);
        while (tempLongestNumber>=1){
            tempLongestNumber = tempLongestNumber / 10;
            lenghtLongestNumber++;
        }

        double tempShortestNumber = Math.abs(shortestNumber);
        while (tempShortestNumber>=1){
            tempShortestNumber = tempShortestNumber / 10;
            lengthShortestNumber++;
        }

        System.out.println ("longestNumber= " + longestNumber + " lenghtLongestNumber= " + lenghtLongestNumber);
        System.out.println ("shortestNumber= " + shortestNumber + " lengthShortestNumber= " + lengthShortestNumber);
    }
}


