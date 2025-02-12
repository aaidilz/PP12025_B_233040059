package P2;

public class nodeMain {
    public static void main(String[] args) {

        // Membuat dua node
        Node n1 = new Node(5);
        Node n2 = new Node(7);

        // Menghubungkan dua node
        n1.setNext(n2);

        // Mencetak node
        Node p = n1;

        // kondisi p tidak sama dengan null
        while (p != null) {
            System.out.printf("%d ", p.getNilai());
            p = p.getNext();
        }
    }
}
