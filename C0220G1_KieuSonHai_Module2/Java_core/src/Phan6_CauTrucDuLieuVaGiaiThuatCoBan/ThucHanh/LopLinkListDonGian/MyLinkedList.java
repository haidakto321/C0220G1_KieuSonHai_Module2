package Phan6_CauTrucDuLieuVaGiaiThuatCoBan.ThucHanh.LopLinkListDonGian;

public class MyLinkedList <E>{

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    private  Node head;
    private  int numNodes;
    public MyLinkedList() {

    }

//    public MyLinkedList(Object data) {
//        head = new Node(data);
//    }

    public void addFirst(E element) {
        Node temp=head;
        head=new Node(element);
        head.next=temp;
        numNodes++;
    }
    public void addLast(E element) {
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=new Node(element);
        numNodes++;
    }
    public Node get(int index) {
        Node temp=head;
        for(int i=0;i<index;i++) {
            temp=temp.next;
        }
        return temp;
    }

    public void add(int index,E element) {
        Node temp=head;
        Node holder;
        for(int i=0;i<index-1 && temp.next !=null;i++) {
            temp=temp.next;
        }
        holder =temp.next;
        temp.next=new Node(element);
        temp.next.next=holder;
        numNodes++;
    }

    public void printList() {
        Node temp=head;
        while (temp !=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
