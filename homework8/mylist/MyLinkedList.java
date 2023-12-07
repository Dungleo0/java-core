package homework8.mylist;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    private MyLinkedListNode getNoteByIndex(int index) {
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    @Override
    public void add(Object o) {
        add(o,size);
    }

    @Override
    public void add(Object o, int index) {
        checkBoundaries(index, size);
        if (index == 0) {
            head = new MyLinkedListNode(o, head);
        } else {
            MyLinkedListNode current = getNoteByIndex(index - 1);
            current.setNext(new MyLinkedListNode(o, current.getNext()));
        }
        size++;
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size);

        if (index == 0) {
            head = head.getNext();
        } else {
            MyLinkedListNode previous = getNoteByIndex(index - 1);
            previous.setNext(previous.getNext().getNext());
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size);
        MyLinkedListNode node = getNoteByIndex(index);
        return node.getPayload();
    }

}
