package P3;

public class ListMain {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(1);
        list.addTail(4);
        list.addTail(5);
        list.addTail(7);
        System.out.println("List Element: ");
        list.displayElement();
    }
}
