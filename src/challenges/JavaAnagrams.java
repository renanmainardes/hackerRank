package challenges;

import java.util.Scanner;

public class JavaAnagrams {


    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;

        if (a.length() < 1 || a.length() > 50 || b.length() < 1 || b.length() > 50) {
            System.out.println("Input not allowed");
            return false;
        }

        String aLowerCase = a.toLowerCase();
        String bLowerCase = b.toLowerCase();

        java.util.HashMap<Character, Integer> aCharCountMap = new java.util.HashMap<>();
        char[] strArray = aLowerCase.toCharArray();

        for (char c : strArray) {
            if (aCharCountMap.containsKey(c)) {
                aCharCountMap.put(c, aCharCountMap.get(c) + 1);
            } else {
                aCharCountMap.put(c, 1);
            }
        }

        java.util.HashMap<Character, Integer> bCharCountMap = new java.util.HashMap<>();
        char[] strArray2 = bLowerCase.toCharArray();

        for (char c : strArray2) {
            if (bCharCountMap.containsKey(c)) {
                bCharCountMap.put(c, bCharCountMap.get(c) + 1);
            } else {
                bCharCountMap.put(c, 1);
            }
        }

        return aCharCountMap.equals(bCharCountMap);
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }


}