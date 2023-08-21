package _09_Palindrome_Number;



public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(100));
        System.out.println(isPalindrome(121));

    }

    public static boolean isPalindrome(int x) {
        boolean flag = true;
        if(x < 0) {
            return false;
        }
        char[] array = String.valueOf(x).toCharArray();
        for (int i = 0; i < array.length; i++) {
            if(array[i] != array[array.length - 1 - i]) {
                flag = false;
            }
        }
        return flag;
    }
}
