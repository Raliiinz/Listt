package Feb1019;

public class MyTreeSet<T extends Comparable<T>>{
    private Node<T> head;
    private int size;

    public MyTreeSet() {
        head = null;
        size = 0;
    }
    public void add(T e) throws EmptyElementException {
        if (head == null) {
            head = new Node<T>(e);
            size++;
            return;
        }

        Node<T> newNode = new Node<T>(e);
        Node<T> current = head;

        // Если новый элемент меньше головного элемента
        if (newNode.data.compareTo(current.data) < 0) {
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }


        while (current.next != null) {
            if (newNode.data.compareTo(current.next.data) < 0) {
                newNode.next = current.next;
                current.next = newNode;
                size++;
                return;
            }
            current = current.next;
        }

        current.next = newNode;
        size++;
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

    /*@Override
    public int compareTo(T o) {
        // В данном случае предполагается, что ваш класс T имплементирует интерфейс Comparable<T>
        Comparable<T> comparable = (Comparable<T>) o;
        return comparable.compareTo(this.data);
    }

    /*private Node<T> head;
    private int size;

    public myTreeSet() {
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
    @Override
    public int compareTo(Object o) {

        return 0;
    }*/
}
