package _00_algorythms.sort;

import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {

//        https://www.youtube.com/watch?v=h8eyY7dIiN4&ab_channel=CodingwithJohn
//        https://big-o.io/algorithms/comparison/quicksort/

        Random random = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }
        int[] array = {1,7,3,8,34,9,123,25,234};
        System.out.println("before sorting:");
        System.out.println(array);
        
        quicksort(array, 0, array.length - 1);

        System.out.println("after sorting:");
        System.out.println(array);
        
    }

    private static void quicksort(int[] array, int lowIndex, int highIndex) {
        int pivot = array[highIndex];


    }


}
