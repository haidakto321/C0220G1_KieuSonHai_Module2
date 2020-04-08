package Phan2_MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr = {2,7,8,10,17,22};
        boolean check = false;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Mảng ban đầu: "+arr[i]+" ");
        }

        System.out.println("Enter the number need delete: ");
        int num = input.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length-1] = 0;
                check = true;
            }
        }
        if(check){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }else {
            System.out.println("Cant find a number.");
        }
    }
}
