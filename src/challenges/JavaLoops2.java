package challenges;

import java.util.Scanner;

public class JavaLoops2 {

    public static void main(String[] argh) {

        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        if (q < 0 || q > 500) {
            System.out.println("Number of interactions not allowed.");
        } else {


            int produto = 0;
            int soma = 0;
            int c = 0;

            for (int i = 0; i < q; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();

                if ((a < 0) || (a > 50) || (b < 0) || (b > 50)) {
                    break;
                } else {


                    c = 0;

                    for (c = 0; c < n; c++) {

                        produto = produto + ((int) Math.pow(2, c) * b);

                        soma = a + produto;

                        System.out.printf("%d ", soma);


                        soma = 0;


                    }
                    System.out.printf("\n");
                    produto = 0;

                }

            }
            in.close();
        }

    }

}
