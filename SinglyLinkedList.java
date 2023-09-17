public class SinglyLinkedList{
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node();// init head using Node class
        Node node = new Node();// creating node class with node
        node.next = null;// setting this node to null
        node.value = nodeValue;//setting the value which come from the parameter
        head = node;// setting head to node 
        tail = node;// setting tail to node
        size = 1;// setting the size of the node
        return head;// return head
    } 
    // The runtime complexity for creating a Singly Linked List is Big O(1).
    // The space complexity is Big B(1).

    // Insert Method Singly Linked List
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if(head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        }
    }
}
