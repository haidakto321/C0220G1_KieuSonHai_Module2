package Phan3_ClassVaOOP.BaiTap.QuadraticEquation;

import Phan3_ClassVaOOP.BaiTap.StopWatch;

public class SelectionSort {
    public static void main(String[] args) {
        StopWatch test = new StopWatch();
        test.start();
        int arr[] = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor((Math.random() * 10000) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            // Assume first element is min
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;

                }
            }
            if (min != i) {
                final int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        test.stop();
        System.out.println("Thoi gian chay: " + test.getElapsedTime() + " ms");
    }
}
