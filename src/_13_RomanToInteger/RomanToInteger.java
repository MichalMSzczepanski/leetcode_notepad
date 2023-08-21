package _13_RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToIntFast(44));

//        romanToIntFast(23);
//        romanToIntFast(69);
//        romanToIntFast(9);
        // test comment


        StringBuilder sb = new StringBuilder();
        Map<String, Integer> romans = new HashMap<>();
        romans.put("I", 1);
        romans.put("IV", 4);
        romans.put("V", 5);
        romans.put("IX", 9);
        romans.put("X", 10);
        romans.put("XL", 40);
        romans.put("L", 50);
        romans.put("XC", 90);
        romans.put("C", 100);
        romans.put("CD", 500);
        romans.put("D", 500);
        romans.put("DM", 900);
        romans.put("M", 1000);

    }

    public static String romanToIntFast(int number) {
//        https://stackoverflow.com/questions/5931261/java-use-stringbuilder-to-insert-at-the-beginning
//        Warning: It defeats the purpose of StringBuilder, but it does what you asked.
//
//                Better technique (although still not ideal):
//
//        Reverse each string you want to insert.
//                Append each string to a StringBuilder.
//                Reverse the entire StringBuilder when you're done.
//        This will turn an O(n²) solution into O(n).
        return "error";
    }
    public static String romanToInt(int number) {
        char[] array = String.valueOf(number).toCharArray();

        // define singles
        char singlesss = array[array.length - 1];
        int singles = Integer.parseInt(String.valueOf(singlesss));
        String singlesString = new String();
        if (singles == 0) {
            singlesString = "";
        } else if (singles <= 3) {
            for (int i = 0; i < singles; i++) {
                singlesString += "I";
            }
        } else if (singles == 4) {
            singlesString = "IV";
        } else if (singles == 5) {
            singlesString = "V";
        } else if (singles < 9) {
            singlesString = "V";
            for (int i = 0; i < singles - 5; i++) {
                singlesString += "I";
            }
        } else if (singles == 9) {
            singlesString = "IX";
        }
        if (number < 10) {
            System.out.println(singlesString);
            return singlesString;
        }

        // define tens
        char tensss = array[array.length - 2];
        int tens = Integer.parseInt(String.valueOf(tensss));
        String tensString = new String();
        if (tens == 1) {
            tensString = "X";
        } else if (tens <= 3) {
            for (int i = 0; i < tens; i++) {
                tensString += "X";
            }
        } else if (tens == 4) {
            tensString = "XL";
        } else if (tens == 5) {
            tensString = "L";
        } else if (tens < 9) {
            tensString = "L";
            for (int i = 0; i < tens - 5; i++) {
                tensString += "X";
            }
        } else if (tens == 9) {
            tensString = "XC";
        }
        if (number < 100) {
            System.out.println(tensString + singlesString);
            return tensString + singlesString;
        }

        // define hundreds
        char hundredsss = array[array.length - 3];
        int hundreds = Integer.parseInt(String.valueOf(hundredsss));
        String hundredsString = new String();
        if (hundreds == 1) {
            hundredsString = "C";
        } else if (hundreds <= 3) {
            for (int i = 0; i < hundreds; i++) {
                hundredsString += "C";
            }
        } else if (hundreds == 4) {
            hundredsString = "CD";
        } else if (hundreds == 5) {
            hundredsString = "D";
        } else if (hundreds < 9) {
            hundredsString = "D";
            for (int i = 0; i < hundreds - 5; i++) {
                hundredsString += "C";
            }
        } else if (hundreds == 9) {
            hundredsString = "CM";
        }
        if (number < 1000) {
            System.out.println(hundredsString + tensString + singlesString);
            return hundredsString + tensString + singlesString;
        }

        // define thousands
        char thousandsss = array[array.length - 4];
        int thousands = Integer.parseInt(String.valueOf(thousandsss));
        String thousandsString = new String();
        if (thousands == 1) {
            thousandsString = "M";
        } else if (thousands <= 3) {
            for (int i = 0; i < thousands; i++) {
                thousandsString += "M";
            }
        }
        if (number <= 3999) {
            System.out.println(thousandsString + hundredsString + tensString + singlesString);
            return thousandsString + hundredsString + tensString + singlesString;
        }
        return "error";
    }
}
