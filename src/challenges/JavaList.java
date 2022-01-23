package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();

        if((N <1) || (N>4000)) {
            System.out.println("Number of elements not allowed!");
            return;
        }

        List list = new ArrayList(N);

        for(int i=0;i<N;i++){
            int values = sc.nextInt();
            list.add(i, values);
        }

        int Q = sc.nextInt();

        if((Q <1) || (Q>4000)) {
            System.out.println("Number of queries not allowed!");
            return;
        }

        for(int i = 0; i<Q; i++){

            String S = sc.next();

            if(Objects.equals(S, "Insert")) {
                int posInsert = sc.nextInt();
                int insertValue = sc.nextInt();
                list.add(posInsert,insertValue);

            } else if (Objects.equals(S, "Delete")){
                int posDelete = sc.nextInt();
                list.remove(posDelete);
            }
            else {
                System.out.println("Input not allowed!");
            }
        }

        for(int i = 0;i<list.size();i++)
            System.out.print(list.get(i) + " ");
    }



}
