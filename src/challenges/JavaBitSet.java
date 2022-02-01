package challenges;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if((n<1) || (n>1000)){
            System.out.println("Number of bits not allowed!");
            return;
        }


        int operations = sc.nextInt();

        if((operations<1) || (operations>10000)){
            System.out.println("Number of bits not allowed!");
            return;
        }


        BitSet bitSet1 = new BitSet(n);
        BitSet bitSet2 = new BitSet(n);

        for (int i = 0; i < operations; i++) {

            String op = sc.next();
            int opInicial = sc.nextInt();
            int opFinal = sc.nextInt();

            if (op.equals("AND")) {

                if (opInicial == 1) {
                    bitSet1.and(bitSet2);

                } else {
                    bitSet2.and(bitSet1);
                }


            }

            if (op.equals("OR")) {

                if (opInicial == 1) {
                    bitSet1.or(bitSet2);

                } else {
                    bitSet2.or(bitSet1);
                }


            }

            if (op.equals("XOR")) {

                if (opInicial == 1) {
                    bitSet1.xor(bitSet2);

                } else {
                    bitSet2.xor(bitSet1);
                }


            }

            if (op.equals("SET")) {

                if (opInicial == 1) {
                    bitSet1.set(opFinal);

                } else {
                    bitSet2.set(opFinal);
                }


            }

            if (op.equals("FLIP")) {

                if (opInicial == 1) {
                    bitSet1.flip(opFinal);

                } else {
                    bitSet2.flip(opFinal);
                }


            }

            System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());

        }

    }

}
