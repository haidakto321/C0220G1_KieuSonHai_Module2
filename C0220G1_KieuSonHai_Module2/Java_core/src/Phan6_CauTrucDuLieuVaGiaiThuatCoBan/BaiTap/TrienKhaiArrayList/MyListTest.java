package Phan6_CauTrucDuLieuVaGiaiThuatCoBan.BaiTap.TrienKhaiArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(7);
        listInteger.add(8);
        listInteger.add(9);
        listInteger.add(10);
        System.out.println("Mang: ");
        for(int i=0;i<listInteger.size();i++) {
            System.out.println(listInteger.indexOf(i));
        }

        System.out.println("Mang co kich thuoc: "+listInteger.size());

        if(listInteger.contains(5)) {
            System.out.println("Phan tu co trong mang");
        } else {
            System.out.println("Phan tu ko nam trong mang");
        }

        System.out.println("Phan tu nam tai index: "+listInteger.indexOf(7));

        System.out.println(listInteger.get(3));

        listInteger.clear();
        System.out.println(listInteger.size());

    }
}
