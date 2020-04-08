package Phan2_MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index, num;
        System.out.println("Nhap gia tri muon them vao mang: ");
        num = input.nextInt();
        System.out.println("Muon them tai vi tri nao: ");
        index = input.nextInt();
        if (index <= 1 || index >= arr.length - 1) {
            System.out.println("Khong chen duoc!");
        }
        for (int i = 0; i < arr.length; i++) {
            if (index == i) {
                for (int j = arr.length - 1; j > index; j--)
                    arr[j] = arr[j - 1];
            }
        }
        arr[index] = num;
        System.out.println("Mang da duoc thay doi la: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

