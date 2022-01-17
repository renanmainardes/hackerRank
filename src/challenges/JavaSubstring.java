package challenges;

import java.util.Scanner;

public class JavaSubstring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        if ((S.length() < 0) || (S.length() > 100)) {
            System.out.println("Input not allowed!");
        }
        else if (start < 0 || end<start || S.length() < end) {
            System.out.println("Start or end values not allowed!");
        }
        System.out.println(S.substring(start, end));



    }




}
