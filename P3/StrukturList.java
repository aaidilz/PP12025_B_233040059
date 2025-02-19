package P3;

import P2.Node;

public class StrukturList {
    private Node HEAD;

    public StrukturList() {
        HEAD = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addHead(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void addTail(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node curNode = HEAD;
            Node posNode = null;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }
    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getNilai() + " ");
            curNode = curNode.getNext();
        }
        System.out.println();
    }

    public void sort() {
        Node curNode = HEAD;
        Node posNode = null;
        while (curNode != null) {
            posNode = curNode.getNext();
            while (posNode != null) {
                if (curNode.getNilai() > posNode.getNilai()) {
                    int temp = curNode.getNilai();
                    curNode.setNilai(posNode.getNilai());
                    posNode.setNilai(temp);
                }
                posNode = posNode.getNext();
            }
            curNode = curNode.getNext();
        }
    }
}
