import java.util.Scanner;
public class ArrangeRows {
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

        Scanner enterСolumn = new Scanner(System.in);                         // Вовод строку по которой сортировать
        System.out.println("Enter string  to sort");
        int numberColumn = enterArraySize.nextInt();

        for (int i = 0; i < arraySize; i++) {
            System.out.println();
            for (int j = 0; j < arraySize; j++) {
                System.out.print(arrayRandom[i][j] + "  ");
            }
        }                               // Вывод заполненного массива
        System.out.println();


        int [][] arraySort = new int [arraySize][arraySize];
        int bigNumber = interval + 1;
        int smallNumberPosition = 0;
        int columnPositionArraySort = 0;
        for (int i = 0; i < arraySize; i++) {

            int smallNumber = interval +1;
            for (int j = 0; j < arraySize; j++) {
                if (arrayRandom [numberColumn][j] < smallNumber) {
                    smallNumber = arrayRandom[numberColumn][j];
                    smallNumberPosition = j;
                }
            }

            for (int k = 0; k < arraySize; k++) {
                arraySort [k][i]= arrayRandom [k][smallNumberPosition];
                arrayRandom [k][smallNumberPosition] = bigNumber;

            }
            columnPositionArraySort++;

        }

        for (int i = 0; i < arraySize; i++) {
            System.out.println();
            for (int j = 0; j < arraySize; j++) {
                System.out.print(arraySort[i][j] + "  ");
            }
        }                              // Вывод отсортированного массива
    }
}
