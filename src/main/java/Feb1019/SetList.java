package Feb1019;

public class SetList<T> {
    private Node<T> head;
    private int size;

    public SetList() {
        head = null;
        size = 0;
    }
    public void add(T e) throws EmptyElementException {
        boolean flag = false;
        if (head == null) {
            head = new Node<T>(e);
        } else {
            Node<T> current = head;
            while (current.next != null) {
                if(current.data.equals(e)){
                    flag = true;
                    break;
                }
                current = current.next;
            }
            if(!flag) {
                current.next = new Node<T>(e);
            }
        }

        size++;
    }


    public void delete(T e) throws IndexOutOfBoundsException {
        if (size < 0 ) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (head.data.equals(e)) {
            head = head.next;
        } else {
            Node<T> current = head;
            for (int i = 0; i < size; i++) {
                if(current.next.data.equals(e)){
                    break;
                }
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public boolean contains(T e){
        Node<T> current = head;
        while (current.next != null) {
            if(current.data.equals(e)){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public String asList(){
        String str = "";
        Node<T> current = head;
        while (current != null) {
            str = str + current.data + " ";
            current = current.next;
        }
        return str;
    }
}
