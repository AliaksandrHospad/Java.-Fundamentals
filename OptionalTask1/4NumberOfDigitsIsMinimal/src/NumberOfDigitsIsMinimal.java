import java.util.Scanner;

public class NumberOfDigitsIsMinimal {


    public static void main(String[] args) {
        double longestNumber = 1.0 / 0.0;;
        int numberOfShortestNumber = 0;
        int flag = 0;
        int tempDigits = 0;
        Scanner enterNumberOfNumbers = new Scanner(System.in);               //ввод колчиства чисел
        System.out.println("Enter the number of numbers");
        int numberOfNumbers = enterNumberOfNumbers.nextInt();
        int [] arrayNumbers = new int [numberOfNumbers];
        int [] arrayNumbersSort = new int [numberOfNumbers];
        int [] arrayNumberOfDigits = new int [numberOfNumbers];


        for (int i = 0; i < numberOfNumbers; i++) {                           //Ввод массива
            Scanner enterNumbers = new Scanner(System.in);
            System.out.println("enter the number № "+ (i+1));
            int enteredNumber = enterNumbers.nextInt();
            arrayNumbers [i] = enteredNumber;
        }

        for (int i = 0; i < arrayNumbers.length; i++) {                       //Заполнение массима количкством неповторяющихся цифр
            int  numberOfArrayNubers = Math.abs(arrayNumbers[i]);                       //из которого состоит число
            int [] arrayTempForDigits = new int [] {1,0,0,0,0,0,0,0,0,0};     //Временный массив недопускающих подсчета повторов цифр
            int digitCounter = 0;                                             //Счетчик количества неповторяющихся цифр числа
            while (numberOfArrayNubers >= 1){                                 //Разбитие числа на цифры
                tempDigits = numberOfArrayNubers % 10;                        //...
                numberOfArrayNubers = numberOfArrayNubers / 10;               //Укорочение числа (у котого посмотрели последнюю цифру)
                if (tempDigits != arrayTempForDigits [tempDigits]) {          //Проверка на неповторяемость
                    arrayTempForDigits[tempDigits] = tempDigits;              //Внесение новой цифры
                    digitCounter++;                                           //Прибавление количества цифр числа
                    }
                }
            if (Math.abs(arrayNumbers[i])!=0) {
                arrayNumberOfDigits[i] = digitCounter;                       //Заполнение массива количеством цифр числа
            }
            else arrayNumberOfDigits[i] = 1;
        }
        int smallerNumber = 10;
        int indexsmallerNumber=0;
        for (int i = 0; i < arrayNumberOfDigits.length; i++) {
            if (arrayNumberOfDigits[i] < smallerNumber) {
                smallerNumber = arrayNumberOfDigits[i];
                indexsmallerNumber = i;
            }
        }
        System.out.println("In this number, the number of different digits is minimal= " + arrayNumbers[indexsmallerNumber]);



    }
}




