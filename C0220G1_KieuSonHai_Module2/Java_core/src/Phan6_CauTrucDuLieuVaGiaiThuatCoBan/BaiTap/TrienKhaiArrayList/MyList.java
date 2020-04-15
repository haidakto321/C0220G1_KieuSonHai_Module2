package Phan6_CauTrucDuLieuVaGiaiThuatCoBan.BaiTap.TrienKhaiArrayList;


import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    private E[] data;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapacity(int minCapacity) {
        int newSize = elements.length + minCapacity;
        //hàm arraycopy thằng element là null nên lỗi
//        System.arraycopy(elements,0,elements,0,newSize);
        elements= Arrays.copyOf(elements,newSize);
    }
    public int size() {
        return size=elements.length;
    }

    //    private void ensureCapa() {
//        int newSize = elements.length * 2;
//        elements = Arrays.copyOf(elements, newSize);
//    }
    public void add(int index, E element) {
        ensureCapacity(1);
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    public Object clone() {
        MyList<E> tmp = new MyList<>();
        tmp.elements = Arrays.copyOf(elements, size);
        tmp.size = size;

        return tmp;
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
//        if(size == elements.length)
        ensureCapacity(1);
        elements[size++]=e;
        return true;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index " + index + " out of bounds.");
        }
    }

    public Object get(int index) {
        checkIndex(index);
        return  elements[index];
    }

    public void clear() {
        for (int i = 0; i < size; i++)
            elements[i] = null;

        size = 0;
    }
}
