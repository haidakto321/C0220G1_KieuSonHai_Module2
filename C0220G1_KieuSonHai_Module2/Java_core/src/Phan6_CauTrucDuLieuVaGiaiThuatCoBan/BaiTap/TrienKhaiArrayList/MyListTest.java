package Phan6_CauTrucDuLieuVaGiaiThuatCoBan.BaiTap.TrienKhaiArrayList;

public class MyListTest {

    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(7);
        listInteger.add(8);
        listInteger.add(9);
        listInteger.add(10);
        listInteger.add(11);
        System.out.println("Mang: ");
        for (int i = 0; i < listInteger.size(); i++) {
            System.out.print(listInteger.get(i) + " ");
        }

        System.out.println("\nMang co kich thuoc: " + listInteger.size());

        if (listInteger.contains(5)) {
            System.out.println("Phan tu co trong mang");
        } else {
            System.out.println("Phan tu ko nam trong mang");
        }

        System.out.println("Phan tu nam tai index: " + listInteger.indexOf(7));

        MyList<Integer> list2 = listInteger.clone();
        System.out.println("Mang copy: ");
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i)+" ");
        }
        listInteger.clear();
        System.out.println("\n"+listInteger.get(1));
    }
}

