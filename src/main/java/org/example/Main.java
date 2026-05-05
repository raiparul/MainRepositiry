package org.example;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Traversing an Array
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Traversing array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //Finding Maximum Value in an Array
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum value in array: " + max);

        //Reversing an Array
        int[] arr = {1, 2, 3, 4, 5};
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed array:");
        System.out.println(Arrays.toString(arr));

        //Reversing a List using Collections
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Collections.reverse(list);
        System.out.println("Reversed list using Collections:");
        System.out.println(list);

        //Reversing a List manually (Two Pointer)
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int left1 = 0;
        int right1 = list1.size() - 1;

        while (left1 < right1) {
            int temp = list1.get(left1);
            list1.set(left1, list1.get(right1));
            list1.set(right1, temp);
            left1++;
            right1--;
        }

        System.out.println("Reversed list manually:");
        System.out.println(list1);
    }
}