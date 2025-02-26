package P2;

public class Node {
    private double nilai;
    private Node next;

    // Inisialisasi Node
    public Node(double nilai) {
        this.nilai = nilai;
        this.next = null;
    }

    // Getter dan Setter
    
    public double getNilai() {
        return nilai;
    }

    public Node getNext() {
        return next;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
