package Main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
    private final Random random = new Random();
    private final Scanner sc = new Scanner(System.in);

    public int[] createArray() {
        int[] array = new int[getArrayLength()];
        array = random.ints(array.length, -100, 100).toArray();
        System.out.println(Arrays.toString(array));
        return array;
    }

    private int getArrayLength() {
        int length = 0;
        System.out.print("Enter 10 or more: ");
        if (sc.hasNextInt()) {
            length = sc.nextInt();
        }
        sc.nextLine();
        return length >= 10 ? length : getArrayLength();
    }

    public int[] sort(int[] array) {
        System.out.println("Select method 1 in ascending order, or method 2 in descending order: ");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        if (i == 1) {
            return sortUp(array);
        } else if (i == 2) {
            return sortDown(array);
        } else {
            System.out.println("Enter 1 or 2");
        }
        return array;
    }
    public  int [] sortUp (int [] arr) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public  int [] sortDown (int [] arr) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    isSorted = false;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public int[] squared(int[] array) {
        for (int i = 2; i < array.length; i += 3) {
            array[i] = array[i] * array[i] * array[i];
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}