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
        } else if(location == 0) {
            node.next = head;
            head = node;
        } else if(location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while(index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    // Singly Linked List Traversal
    public void traverseSinglyLinkedList() {
        if(head == null) {
            System.out.println("Singly Linked List does not exist!");
        }else {
            Node tempNode = head;
            for(int i=0; i<size;i++) {
                System.out.println(tempNode.value);
                if(i != size -1) {
                    System.out.println(" ->");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
        // runtime complexity for the traverse method is O(N).
        // space complexity for the traverse method is O(1).
    }

    // Search for a node in a Singly Linked List
    boolean searchNode(int nodeValue) {
        if(head != null) {
            Node tempNode = head;
            for(int i=0;i<size;i++) {
                if(tempNode.value == nodeValue) {
                    System.out.println("Found the node at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found! ");
        return false;
    }
    // the runtime complexity for the searching function is Big O(N).
}
