package challenges;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class JavaLoops1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        if ((N<2) || (N > 20)) {
            System.out.println("Wrong input.");
        }

        else {

        for (int x = 1; x<=10;x++) {

            int product = N * x;
            System.out.println(N + " x " + x + " = " + product);
        }

    }
}

}
