public class MyLinkedList {

    private Node head;
    private Node tail;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    //Вставка элемента в начало списка
    public void addFirst(String data) {
        Node temp = new Node(data);

        if (isEmpty())
            tail = temp;
        else
            head.prev = temp;

        temp.next = head;
        head = temp;
    }

    //Вставка элемента в конец списка
    public void addLast(String data) {
        Node temp = new Node(data);

        if (isEmpty())
            head = temp;
        else
            tail.next = temp;

        temp.prev = tail;
        tail = temp;
    }

    //Вставка по индексу
    public void addByIndex(String data, int index) {
        Node curr = head;
        int i = 0;

        while (curr != null && i != index) {
            curr = curr.next;
            i++;
        }

        Node temp = new Node(data);

        curr.prev.next = temp;
        temp.prev = curr.prev;
        curr.prev = temp;
        temp.next = curr;
    }

    //Удаление первого элемента
    public void removeFirst() {
        if (head.next == null) {
            tail = null;
        } else
            head.next.prev = null;

        head = head.next;
    }

    //Удаление последнего элемента
    public void removeLast() {
        if (head.next == null)
            head = null;
        else
            tail.prev.next = null;

        tail = tail.prev;
    }

    //Удаление по индексу
    public void removeAt(int index) {
        Node curr = head;
        int i = 0;

        while (i != index) {
            curr = curr.next;
            i++;

            if (curr == null)
                return;
        }

        if (curr == head)
            removeFirst();
        else curr.prev.next = curr.next;

        if (curr == tail)
            removeLast();
        else
            curr.next.prev = curr.prev;

    }

    public void replace(String data, int index){
        removeAt(index);
        addByIndex(data,index);
    }

    //Вывод списка в консоль
    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}