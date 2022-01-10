package resumos;

import java.util.Arrays;

public class resumoArrays {

    public static void main(String[] args) {
        String[] stringArray = { "a", "b", "c", "d", "e" };
        boolean b = Arrays.asList(stringArray).contains("y");
        System.out.println(b);
// true
    }
    
}
