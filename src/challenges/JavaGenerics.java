package challenges;

public class JavaGenerics {


    //A SOLUÇÃO É A IMPLEMENTAÇÃO DO MÉTODO PRINT ARRAY APENAS

    public static <E> void printArray(E[] inputArray) {
        // Display array elements
        for (E element : inputArray) {
            System.out.println(element);
        }


    }

    public static void main(String[] args) {
        System.out.println("Sucesso!");
    }



}
