
public class SinglyLinkedList {

    /*
    Linked list is a form of sequential collection, and it does not have to be in order. A linked list is made up of
    independent nodes that may contain any type of data and each node has a reference to the next node in the link.

    Creation of singly linked list
    1. Create head and tail initialize with null
    2. Create a blank node and assign a value to it and reference to null.
    3. Link head and tail with these nodes.

    Insertion into a linked list in the memory
    1. At the beginning
    2. After a node in the middle of the linked list.
    3. At the end of the linked list.
     */

    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertInSinglyLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null){
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {

        }
    }
}
