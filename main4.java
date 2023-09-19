public class main4{
    public static void main(String[] args) {
        // Create a Singly Linked List
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        System.out.println(sLL.head.value);
        
        sLL.insertInLinkedList(6, 0);
        System.out.println(sLL.head.value);

        sLL.insertInLinkedList(6, 1);
        sLL.insertInLinkedList(7, 3);
        sLL.insertInLinkedList(8, 4);
        sLL.insertInLinkedList(9, 5);
        sLL.traverseSinglyLinkedList();


    }
}