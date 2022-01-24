package challenges;

import java.util.ArrayList;
import java.util.List;

//NO HACKERRANK, LEMBRAR QUE A CLASSE MYCALCULATOR IMPLEMENTA A CLASSE ADVANCEDARITHMETIC
//USAR: "class MyCalculator implements AdvancedArithmetic" e "@Overrride" no método divisor_sum

public class JavaInterface {

    class MyCalculator {


        public int divisor_sum(int n){

            List<Integer> list = new ArrayList();

            for(int i = 1; i<=n;i++){
                if((n%i)==0){
                    list.add(i);
                }
            }
            int sum = 0;
            for(int i =0; i<=(list.size()-1);i++){
                sum = sum + list.get(i);
            }

            return sum;

        }

    }

    public static void main(String[] args) {

    }

}