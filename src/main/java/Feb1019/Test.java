package Feb1019;

public class Test {
    public static void main(String[] args) throws EmptyElementException {
        /*ArrayList1<String> list = new ArrayList1<>();
        list.add("5");
        list.add("10");
        list.add("15");
        list.add("20");
        list.add("25");
        list.add("30");
        System.out.println("Original list: " + list.toString());

        list.delete(2);
        list.delete(3);
        System.out.println("After deletion: " + list.toString());

        list.pop();
        System.out.println("After popping: " + list.toString());
        System.out.println("Size after popping: " + list.size());

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());


        LinkedList1<String> list2 = new LinkedList1<>();
        list2.add("5");
        list2.add("10");
        list2.add("15");
        list2.add("20");
        list2.add("25");
        list2.add("30");
        System.out.println("Original list: " + list2.toString());

        list2.delete(2);
        list2.delete(3);
        System.out.println("After deletion: " + list2.toString());

        list2.pop();
        System.out.println("After popping: " + list2.toString());
        System.out.println("Size after popping: " + list2.size());

        System.out.println("Element at index 1: " + list2.get(1));
        System.out.println("List size: " + list2.size());*/

        SetList<String> list3 = new SetList<>();
        list3.add("5");
        list3.add("10");
        list3.add("5");
        list3.add("20");
        list3.add("25");
        list3.add("10");
        list3.add("30");
        list3.add("15");
        System.out.println("Original list: " + list3.asList());
        list3.delete("15");
        list3.delete("5");
        System.out.println("After deletion: " + list3.asList());

        System.out.println(list3.contains("15"));
        System.out.println(list3.contains("10"));

        MyTreeSet<Integer> list4 = new MyTreeSet<>();
        list4.add(5);
        list4.add(10);
        list4.add(5);
        list4.add(20);
        list4.add(25);
        list4.add(10);
        list4.add(30);
        list4.add(15);
        System.out.println("Original list: " + list4.asList());

    }
}
