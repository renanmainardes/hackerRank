package challenges;

public class JavaInheritance2 {

    public static void main(String[] args) {

        class Arithmetic{
            int add(int a, int b){
                int sum = a + b;
                return sum;
            }
        }

        class Adder extends Arithmetic{

        }

    }



}
