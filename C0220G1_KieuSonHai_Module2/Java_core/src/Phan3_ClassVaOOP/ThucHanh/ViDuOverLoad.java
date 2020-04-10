package Phan3_ClassVaOOP.ThucHanh;

public class ViDuOverLoad {
        // Dấu ... là quy tắc tạo Parameter List
        // ...x lúc này là một mảng một chiều linh động
        // tức là nó tự động co giãn được đối với các đối số truyền vào.
        public int tong(int ...x) {
            int sum = 0;
            for (int i : x) {
                sum += i;
            }
            return sum;
        }
    }

