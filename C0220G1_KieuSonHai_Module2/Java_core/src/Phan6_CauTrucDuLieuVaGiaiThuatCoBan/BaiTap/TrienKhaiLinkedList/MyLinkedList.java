package Phan6_CauTrucDuLieuVaGiaiThuatCoBan.BaiTap.TrienKhaiLinkedList;


public class MyLinkedList<E> {

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

    private Node head;
    private Node tail;
    private int numNodes;

    public MyLinkedList() {

    }

    //    public MyLinkedList(Object data) {
//        head = new Node(data);
//    }
    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;

    }

    public void addLast(E element) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }
    public int size() {
        return numNodes;
    }
    public E remove(int index) {
        if(index<0 || index>numNodes) {
            throw new IllegalArgumentException("Error index "+index);
        }
        Node temp=head;
        Object data = new Object();

        if(index==0) {
            data=temp.data;
            head=head.next;
            numNodes--;
        } else {
            for(int i=0;i<index-1 && temp.next!=null;i++) {
                temp=temp.next;
            }
            data=temp.next.data;
            temp.next=temp.next.next;
            numNodes--;
        }
        return (E) data;
    }
    public boolean remove(E element) {
        if(head.data.equals(element)) {
            remove(0);
            return true;
        } else {
            Node temp=head;
            while (temp.next!=null) {
                if(temp.next.data.equals(element)) {
                    temp.next=temp.next.next;
                    numNodes--;
                    return true;
                }
            }
        }
        return false;
    }
    public MyLinkedList<E> clone() {
        if(numNodes==0) {
            throw new NullPointerException("LinkedList nay null");
        }
        MyLinkedList<E> clone=new MyLinkedList<>();
        Node temp=head;
        //add temp thanh head
        clone.addFirst((E) temp.data);
        temp=temp.next;
        while (temp!=null) {
            clone.addLast((E) temp.data);
            temp=temp.next;
        }
        return clone;
    }

    public boolean constains(E element) {
        Node temp=head;
        while(temp.next!=null) {
            if(temp.data.equals(element)) {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    public int indexOf(E element) {
        Node temp=head;
        for(int i=0;i<numNodes;i++) {
            if(temp.getData().equals(element)) {
                return i;
            }
            temp=temp.next;
        }
        return -1;
    }

    public MyLinkedList<E> getLast() {
        Node temp=head;
        for(int i=0;i<numNodes;i++) {
            if(temp.next==null) {
                return (MyLinkedList<E>) temp.data;
            }
        }

        return null;
    }

    public void printList() {
        Node temp = head;
        System.out.println("=======HEAD "+head.data);
        int i = 0;
        while (temp != null && i< numNodes) {
            System.out.println("i = "+i+" value = "+temp.getData());
            temp = temp.next;
            i++;
        }
    }

    public void clear() {
        Node temp=head;
        for(int i=0;i<numNodes;i++) {
            temp.data=null;
            temp=temp.next;
        }
        numNodes=0;
    }

}
