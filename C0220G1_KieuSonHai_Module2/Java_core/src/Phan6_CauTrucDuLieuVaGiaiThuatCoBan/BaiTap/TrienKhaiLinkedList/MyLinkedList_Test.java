package Phan6_CauTrucDuLieuVaGiaiThuatCoBan.BaiTap.TrienKhaiLinkedList;

public class MyLinkedList_Test {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;
            public Student() {}

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyLinkedList<Student> myLinkedList=new MyLinkedList<>();
        Student student1=new Student(1,"Hai");
        Student student2=new Student(2,"Thang");
        Student student3=new Student(3,"Thua");
        Student student4=new Student(4,"Hoa");

        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addLast(student3);
        myLinkedList.add(2,student4);
        myLinkedList.remove(1);

        System.out.println(student1.getName());
        System.out.println(student3.getName());

        MyLinkedList<Student> cloneLinkedList=myLinkedList.clone();
//        for(int i=0;i<cloneLinkedList.size();i++) {
//            Student student=(Student) cloneLinkedList.get(i);
//            System.out.println(student.getName());
//        }

        myLinkedList.clear();
        System.out.println(myLinkedList.size());

    }
}
