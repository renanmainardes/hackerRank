package challenges;

import java.util.InputMismatchException;
import java.util.Scanner;


public class JavaExcepetionHandlingTryCatch {


    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);



    try {
        int x = scan.nextInt();
        int y = scan.nextInt();
        int resultado = x / y;
        System.out.println(resultado);
    }

    catch(ArithmeticException e) {
        System.out.println(e);
    }

    catch(InputMismatchException e ) {
        System.out.println(e.getClass().getName());
    }




}
}
