public class Main {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        list.addFirst("sdas");
        list.addFirst("1");
        list.addLast("jdansdn");
        list.addLast("eqwefs");
        list.addByIndex("byIndex", 3);
        list.print();

        System.out.println();

        list.replace("qwerty", 2);
        list.removeAt(3);
        list.removeFirst();
        list.removeLast();
        list.print();
    }
}


