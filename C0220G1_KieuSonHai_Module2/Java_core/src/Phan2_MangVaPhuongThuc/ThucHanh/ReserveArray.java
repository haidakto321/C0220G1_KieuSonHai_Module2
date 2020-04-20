package Phan2_MangVaPhuongThuc.ThucHanh;

import java.util.Scanner;

public class ReserveArray {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("Enter a size of array: ");
            size=input.nextInt();
            if(size>20) {
                System.out.println("Size does not exceed 20");
            }
        } while(size>20);

        array=new int[size];
        int i=0;
        while(i<array.length) {
            System.out.println("Enter a element: "+(i+1)+": ");
            array[i]=input.nextInt();
            i++;
        }
        System.out.println("Elements in array: ");
        for(int j=0;j<array.length;j++) {
            System.out.println(array[j]+" ");
        }

        for(int j=0;j<array.length/2;j++) {
            int temp=array[j];
            array[j]=array[size-1-j];
            array[size-1-j]=temp;
        }
        System.out.println("Reserve array: ");
        for(int j=0;j<array.length;j++) {
            System.out.print(array[j]+" ");
        }
    }
}
