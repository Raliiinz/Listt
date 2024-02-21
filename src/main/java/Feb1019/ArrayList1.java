package Feb1019;

import java.util.Arrays;

public class ArrayList1<T> implements List301<T> {
    Object[] array = new Object[10];
    int size;

    public ArrayList1(Object[] array) {
        this.array = array;
        size = 0;
    }
    public ArrayList1(){};

    @Override
    public void add(T e) throws EmptyElementException {
        if (e==null){
            throw new EmptyElementException();
        }
        if (size == array.length) {
            Object[] newArray = new Object[size*2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = e;
    }


    @Override
    public void delete(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
    }

    @Override
    public Object pop() {
        if (size == 0) {
            return null;
        }
        Object result = array[size - 1];
        array[size - 1] = null;
        size--;
        return result;
    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }

    @Override
    public int size() {
        return size;
    }
    public String toString(){
        String str = "";
        for (int i = 0; i < size; i++) {
            str = str+" " +array[i];
        }
        return str;
    }
}
