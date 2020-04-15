package Phan6_CauTrucDuLieuVaGiaiThuatCoBan.BaiTap.TrienKhaiArrayList;

import java.util.Arrays;
import java.util.Objects;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    private E[] data;

    public MyList() {
        elements = new Objects[DEFAULT_CAPACITY];
    }

    public void ensureCapacity(int minCapacity) {
        int newSize = elements.length + minCapacity;
        elements=Arrays.copyOf(elements,newSize);
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
            data[i + 1] = data[i];
        }
        data[index] = element;
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
            if (o.equals(data[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        if(size == elements.length)
        ensureCapacity(1);
        elements[size++]=e;
        return true;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index " + index + " out of bounds.");
        }
    }

    public E get(int index) {
        checkIndex(index);
        return data[index];
    }

    public void clear() {
        data = (E[]) new Objects[DEFAULT_CAPACITY];
        size = 0;
    }
}
