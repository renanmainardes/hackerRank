package challenges;

import java.util.Arrays;
import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {

        if((s.length()<1) || (s.length()> 1000)){
            return "String size not allowed!";
        }

        int arraySize = (s.length()-k+1);

        String[] initial = new String[arraySize];

        for(int i=0;i<arraySize;i++) {

            initial[i] = s.substring(i,i+k);

        }

        Arrays.sort(initial);

        String smallest = initial[0];
        String largest = initial[arraySize - 1];


        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }


}
