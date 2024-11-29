package practice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterInString {


    public static void main(String[] args) {
        String string1 = "Great responsibility";


        int count;
        char[] string= string1.toLowerCase().toCharArray();
        for (int i = 0; i < string.length; i++) {
            count=1;
            for (int j = i+1; j <  string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ') {
                    count++;
                    string[j]='0';//Set string[j] to 0 to avoid printing visited character

                }
            }
            if (count>1 && string[i] !='0') {
                System.out.println(string[i]+"->"+count+ " times");
            }
        }

        System.out.println("-----------------------------------------------");

        String string3 = "Great responsibility";
        String string4 = "Harsh";

        printDups(string3);
        System.out.println("\n");
//        printDups(string4);

    }


    public static void printDups(String str) {// O(n)
        Map<Character, Integer> map = new HashMap<>();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + "->" + entry.getValue() + " times");
            }
        }
    }




}
