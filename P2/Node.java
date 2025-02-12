package P2;

public class Node {
    private int nilai;
    private Node next;

    // Inisialisasi Node
    public Node(int nilai) {
        this.nilai = nilai;
        this.next = null;
    }

    // Getter dan Setter
    
    public int getNilai() {
        return nilai;
    }

    public Node getNext() {
        return next;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
