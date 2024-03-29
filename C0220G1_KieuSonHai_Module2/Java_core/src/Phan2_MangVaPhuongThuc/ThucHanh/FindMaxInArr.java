package Phan2_MangVaPhuongThuc.ThucHanh;

import java.util.Scanner;

public class FindMaxInArr {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("The application finds the largest value in the array.");

        int size;
        int[] array;
        do {
            System.out.print("Enter a size: ");
            size = input.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " :");
            array[i] = input.nextInt();
            i++;
        }

        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
