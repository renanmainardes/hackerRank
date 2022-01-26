package challenges;

import java.util.Scanner;

public class JavaSubarray {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if ((n<0) || (n > 100)){
            System.out.println("Number of elements not allowed!");
            return;

       }

        int[] array = new int[n];
        int contador = 0;
        int sum = 0;


        for (int i = 0; i < n; i++) {
            int A = sc.nextInt();

            if ((n<-10000) || (n > 10000)){
                System.out.println("Input not allowed!");
                return;
            }

            array[i] = A;
        }

        for (int i = 0; i < array.length; i++) {

            for (int d = i; d < array.length; d++) {

                if (d>i) {
                    sum = sum + array[d];
                }
                else if (d==i){
                    sum = array[i];
                }
                else {
                    sum = array[i] + array[d];
                }

                if (sum < 0) {
                    contador = contador + 1;
                }

            }

            sum = 0;

        }

        System.out.println(contador);


    }

}
