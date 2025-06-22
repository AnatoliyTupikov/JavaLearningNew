package Lab04.Part2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SimpleArray {
    public static void isSorted(int... arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i != (arr.length - 1) && arr[i] > arr[i + 1]) {
                System.out.println("Please try again");
                return;
            }
        }
        System.out.println("Ok");
    }

    public static void userArray() {
        var scanner = new Scanner(System.in);

        System.out.print("Array length: ");
        int length = scanner.nextInt();

        String result = "[";
        System.out.println("Numbers of array:");
        for (int i = 0; i < length; i++) {
            int el = scanner.nextInt();
            if (i == 0) result += " " + el;
            else result += ", " + el;
        }

        System.out.print("Result: " + result + "]");
    }

    private static String arrStr(int... arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) result += " " + arr[i];
            else result += ", " + arr[i];
        }
        return result + "]";
    }

    public static void swapFirstLast(int... arr) {
        int newFirst = arr[arr.length - 1];
        int newLast = arr[0];

        System.out.println("Array 1: " + arrStr(arr));

        arr[0] = newFirst;
        arr[arr.length - 1] = newLast;

        System.out.println("Array 2: " + arrStr(arr));
    }

    public static void firstUniq(int... arr) {
        for (int i = 0; i < arr.length; i++) {
            var el = arr[i];
            boolean isBreaked = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == el) {
                    isBreaked = true;
                    break;
                }
            }
            if (!isBreaked) {
                System.out.println("Array: " + arrStr(arr));
                System.out.println("The first unique value: " + arr[i]);
                return;
            }
        }
    }

    private static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) return arr;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, arr.length / 2));
        int[] right = mergeSort(Arrays.copyOfRange(arr, arr.length / 2, arr.length));

        int leftI = 0;
        int rightI = 0;
        int r = 0;

        while (leftI < left.length && rightI < right.length) {
            var leftValue = left[leftI];
            var rightValue = right[rightI];

            if (leftValue <= rightValue) {
                arr[r] = leftValue;
                r++;
                leftI++;
            } else {
                arr[r] = rightValue;
                r++;
                rightI++;
            }
        }

        while (leftI < left.length) {
            var leftValue = left[leftI];
            arr[r] = leftValue;
            r++;
            leftI++;
        }

        while (rightI < right.length) {
            var rightValue = right[rightI];
            arr[r] = rightValue;
            r++;
            rightI++;
        }

        return arr;
    }

    public static void randomArr(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(-10, 11);
        }
        System.out.println("Array: " + arrStr(arr));
        mergeSort(arr);
        System.out.println("Sorted array: " + arrStr(arr));
    }
}
