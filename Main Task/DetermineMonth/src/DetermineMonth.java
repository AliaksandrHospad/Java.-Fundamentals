import java.util.Scanner;

public class DetermineMonth {

    public static void main(String[] args) throws IllegalAccessException {
        Scanner enterNumbersOFMonth = new Scanner(System.in);
        System.out.println("Enter the number of month");
        byte numbersOFMonth = (byte) enterNumbersOFMonth.nextInt();
        if (numbersOFMonth > 0 && numbersOFMonth < 13){
            switch (numbersOFMonth){
                case 1:System.out.println("January");
                 break;
                case 2:System.out.println("February");
                    break;
                case 3:System.out.println("March");
                    break;
                case 4:System.out.println("April");
                    break;
                case 5:System.out.println("May");
                    break;
                case 6:System.out.println("June");
                    break;
                case 7:System.out.println("July");
                    break;
                case 8:System.out.println("August");
                    break;
                case 9:System.out.println("September");
                    break;
                case 10:System.out.println("October");
                    break;
                case 11:System.out.println("November");
                    break;
                case 12:System.out.println("December");
                    break;
                default: throw new IllegalAccessException ("Enter valid mumber of month= "  + numbersOFMonth );
            }
        }
        else System.out.println("Enter valid mumber of month");
    }

}



