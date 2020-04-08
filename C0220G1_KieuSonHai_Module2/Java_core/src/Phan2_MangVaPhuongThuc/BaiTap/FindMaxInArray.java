package Phan2_MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập chiều dài mảng lớn : ");
        int x = input.nextInt();
        System.out.println("Nhập chiều dài của mỗi mảng con: ");
        int y = input.nextInt();
        int[][] arr = new int[x][y];
        int max = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("Nhập phần tử thứ: " + j + " của mảng " + i);
                arr[i][j]=input.nextInt();
            }
        }
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                if (max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max la: " + max);
    }
}
