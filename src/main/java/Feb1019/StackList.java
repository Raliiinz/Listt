package Feb1019;

public class StackList<T> {
    private Node<T> head;
    private int size;

    public StackList() {
        head = null;
        size = 0;
    }
    public void push(T e) throws EmptyElementException {
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
