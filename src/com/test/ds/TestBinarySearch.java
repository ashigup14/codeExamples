package com.test.ds;

public class TestBinarySearch {
    public static void main(String[] args) {
        // NOTE: Make sure to enable assert before running this code.
        // If you're using IntelliJ, you might be able to use this:
        // https://intellij-support.jetbrains.com/hc/en-us/community/posts/207014815-How-to-enable-assert

        int[] arr1 = {-2, 3, 4, 7, 8, 9, 11, 13};
        assert search(arr1, 11) == 6;
        assert search(arr1, 13) == 7;
        assert search(arr1, -2) == 0;
        assert search(arr1, 8) == 4;
        assert search(arr1, 6) == -1;
        assert search(arr1, 14) == -1;
        assert search(arr1, -4) == -1;

        int[] arr2 = {3};
        assert search(arr2, 6) == -1;
        assert search(arr2, 2) == -1;
        assert search(arr2, 3) == 0;

        System.out.println("If you didn't get an assertion error, this program has run successfully.");
    }

    static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
