
import java.util.Scanner;
public class LargestNumberIncreasingNumbers {
    public static void main(String[] args) {
        Scanner enterArraySize = new Scanner(System.in);                         // Создание массива N x N
        System.out.println("Enter size of array");
        int arraySize = enterArraySize.nextInt();
        int [][] arrayRandom = new int [arraySize][arraySize];

        Scanner enterInterval = new Scanner(System.in);
        System.out.println("Enter interval of values");
        int interval = enterArraySize.nextInt();
        for (int i = 0; i < arraySize; i++) {                                    // Заполнение массива
            for (int j = 0; j < arraySize; j++) {
                arrayRandom [i][j] = (int) ((Math.random() * ((2*interval) +1)) - interval);
            }
        }

        for (int i = 0; i < arraySize; i++) {
            System.out.println();
            for (int j = 0; j < arraySize; j++) {
                System.out.print(arrayRandom[i][j] + "  ");
            }
        }                               // Вывод заполненного массива
        System.out.println();
        int maxCounterString =0;
        int maxTempCounter = 0;
        int stringOfArray = 0;
        for (int i = 0; i < arraySize; i++) {           //Максимальное число идущию подряд чисел в строках
            if (maxCounterString < maxTempCounter) {
                maxCounterString = maxTempCounter;
                stringOfArray = i-1;
            }
            int tempCounter = 0;
            maxTempCounter = 0;

            for (int j = 0; j < arraySize-1; j++) {
                if (arrayRandom[i][j] < arrayRandom [i][j+1]){
                    tempCounter++;
                }
                else tempCounter = 0;
                if (maxTempCounter < tempCounter) maxTempCounter = tempCounter;
            }
        }

        int maxCounterColumn = 0;
        int columnOfArray = 0;
        maxTempCounter = 0;
        for (int j = 0; j < arraySize; j++) {          //Максимальное число идущию подряд чисел в столбцах
            if (maxCounterColumn < maxTempCounter) {
                maxCounterColumn = maxTempCounter;
                columnOfArray = j-1;
            }
            int tempCounter = 0;
            maxTempCounter = 0;

            for (int i = 0; i < arraySize-1; i++) {
                if (arrayRandom[i][j] < arrayRandom [i+1][j]){
                    tempCounter++;
                }
                else tempCounter = 0;
                if (maxTempCounter < tempCounter) maxTempCounter = tempCounter;
            }
        }
        // Сравнение где больше идуших подряж цыфр (в строках или столбац) и вывод большего значения + смой строки (столбца)
        if (maxCounterString >= maxCounterColumn) {
            System.out.println("Max number increasing numbers in string = " + maxCounterString + " The number of string = " + stringOfArray);
            System.out.print("String № " + stringOfArray + " :    ");
            for (int i = 0; i < arraySize; i++) {
                System.out.print(arrayRandom[stringOfArray][i] + " ");
            }
        }
        else {
            System.out.println("Max number increasing numbers in column = " + maxCounterColumn + " The number of column = " + columnOfArray);
            System.out.println("Column № " + stringOfArray + " :    ");

            for (int i = 0; i < arraySize; i++) {
                System.out.println(arrayRandom[i][columnOfArray]);
            }
        }
    }
}
