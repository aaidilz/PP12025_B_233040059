package P3;

import P2.Node;

public class List {
    private int data;
    private Node next;

    // Inisialisasi Node List
    public List(int data) {
        this.data = data;
        this.next = null;
    }

    // Getter dan Setter
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
