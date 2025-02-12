package P2;

public class nodeMain {
    public static void main(String[] args) {

        // Membuat dua node
        // Node n1 = new Node(5);
        // Node n2 = new Node(7);
        
        Node n1 = new Node(5);
        Node n2 = new Node(7);
        Node n3 = new Node(9);
        Node n4 = new Node(8);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

        // Node n1 = new Node(2);
        // Node n2 = new Node(3);
        // Node n3 = new Node(5);
        // Node n4 = new Node(7);
        // Node n5 = new Node(9);

        // n1.setNext(n2);
        // n2.setNext(n3);
        // n3.setNext(n4);
        // n4.setNext(n5);

        // Mencetak node
        Node p = n1;

        // kondisi p tidak sama dengan null
        while (p != null) {
            System.out.printf("%d ", p.getNilai());
            p = p.getNext();
        }
    }
}
