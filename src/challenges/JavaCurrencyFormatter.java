package challenges;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        if ((payment < 0) || (payment > Math.pow(10, 9))) {
            System.out.println("Input not allowed!");
            return;
        }

        Locale us = new Locale("en", "US");
        Locale india = new Locale("en", "IN");
        Locale china = new Locale("zh", "CN");
        Locale france = new Locale("fr", "FR");

        NumberFormat numberFormatUs = NumberFormat.getCurrencyInstance(us);
        NumberFormat numberFormatIndia = NumberFormat.getCurrencyInstance(india);
        NumberFormat numberFormatChina = NumberFormat.getCurrencyInstance(china);
        NumberFormat numberFormatFrance = NumberFormat.getCurrencyInstance(france);

        System.out.println("US: " + numberFormatUs.format(payment));
        System.out.println("India: " + numberFormatIndia.format(payment));
        System.out.println("China: " + numberFormatChina.format(payment));
        System.out.println("France: " + numberFormatFrance.format(payment));
    }

}
