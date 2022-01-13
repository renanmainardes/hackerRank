package challenges;

import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        if (A.length() > 50) {
            System.out.println("Input not allowed");
            return;
        }

        isPalindrome(A);
    }

    private static void isPalindrome(String input) {
        String lowerCaseInput = input.toLowerCase();
        String reversedLowerCaseinput = new StringBuilder(lowerCaseInput).reverse().toString();

        if (lowerCaseInput.equals(reversedLowerCaseinput)) {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");
    }
}








