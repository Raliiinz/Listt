package Feb1019;

public interface List301 <T>{
    void add(T e) throws EmptyElementException;
    void delete(int index) throws IndexOutOfBoundsException;
    Object pop();
    Object get(int index) throws IndexOutOfBoundsException;
    int size();
}
