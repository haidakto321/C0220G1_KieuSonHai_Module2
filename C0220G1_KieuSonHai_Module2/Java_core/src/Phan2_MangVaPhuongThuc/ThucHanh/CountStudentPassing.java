package Phan2_MangVaPhuongThuc.ThucHanh;

import java.util.Scanner;

public class CountStudentPassing {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Enter a size: ");
            size = input.nextInt();
            if (size > 30)
                System.out.println("Size does not exceed 30");
        } while (size > 30);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter a mark for student " + (i + 1) + " :");
            array[i] = input.nextInt();
            i++;
        }

        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\nThe number of students passing the exam is " + count);
    }
}
