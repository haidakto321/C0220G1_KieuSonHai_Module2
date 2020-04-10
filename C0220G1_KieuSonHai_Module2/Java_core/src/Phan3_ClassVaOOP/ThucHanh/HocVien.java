package Phan3_ClassVaOOP.ThucHanh;

public class HocVien { // pascal case
    public String name;
    public String age;

    public String publicName;
    protected String protectedName;
    String defaultName;
    private String privateName;

    static public int ongTietKiem;

    public HocVien(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public HocVien() {

    }

    public HocVien(String name) {
        this.name = name;
    }

    public void hocBai(String monHoc) {
        System.out.println(this.name + " dang hoc " + monHoc);
    }

    public void thi(String tenModule) {
        System.out.println(this.name + " thi " + tenModule);
    }

//    public String thi(String tenModule) {
//        System.out.println(this.name + " thi " + tenModule);
//        return "10";
//    }

    public String thi(int diem) {
        System.out.println(this.name + " thi " + diem);
        return "10";
    }

    public void thi(int diem, String tenModule) {
        System.out.println(this.name + " thi " + tenModule + " duoc diem la " + diem);
    }

    public void thi() {
        System.out.println(this.name + " thi ");
    }

    public static void abc() {
        int a = 3;
    }
}
