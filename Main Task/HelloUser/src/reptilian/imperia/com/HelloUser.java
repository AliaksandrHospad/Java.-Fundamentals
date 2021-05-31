import java.util.Scanner;

public class HelloUser {
    public static void  main (String[]args){
        Scanner enterName = new Scanner(System.in);
        System.out.println("imput your name");
        String nameUser = enterName.nextLine();
        System.out.println ("Hello " + nameUser);



    }

}
