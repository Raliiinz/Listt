package Feb1019;

public class LinkedList1<T> implements List301<T>{
    private Node<T> head;
    private int size;

    public LinkedList1() {
        head = null;
        size = 0;
    }

    @Override
    public void add(T e) throws EmptyElementException {
        if (head == null) {
            head = new Node<T>(e);
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<T>(e);
        }
        size++;
    }

    @Override
    public void delete(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    @Override
    public T pop() {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            T result = head.data;
            head = null;
            size--;
            return result;
        }
        Node<T> current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        T result = current.next.data;
        current.next = null;
        size--;
        return result;
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public int size() {
        return size;
    }
    public String toString(){
        String str = "";
        Node<T> current = head;
        while (current != null) {
            str = str + current.data + " ";
            current = current.next;
        }
        return str;
    }


}
