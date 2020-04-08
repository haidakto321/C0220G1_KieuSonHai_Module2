package Phan2_MangVaPhuongThuc.BaiTap;

public class FindMin {
    public static void main(String[] args) {
        int []arr = {7,0,7,8,2,6,13 };
        int index = minValue(arr);
        System.out.println("Gia tri  nho nhat tai vi tri: " + index);
    }
    public static int minValue(int[] array){
        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        return index;
    }
}
