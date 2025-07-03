// Example: Insert a Node after a Given Node
// Description: Write a function named insertAfter(Node previousNode, int newData) in SinglyLinkedList.
// We are inserting a newNode with newData reight after given previousNode.
// previousNode is not null.

// 1: previousNode -> null
//    newNode -> null
//    previousNode -> newNode -> null

// 2: previousNode -> anotherNode
//    newNode -> null
//    previousNode -> newNode -> anotherNode  

// class Node -- supporting class for SinglyLinkedList

// class SinglyLinkedList -- main class
class linked_list_ex1 {
    public static void main(String[] args){
        Node currentNode = new Node(3);

        SinglyLinkedList listHieu = new SinglyLinkedList();

        listHieu.append(10);
        listHieu.append(20);
        listHieu.append(30);
        // 10 -> 20 -> 30 -> null
        Node nodeToInsertAfter = listHieu.head.nextNode; // 20
        System.out.println(listHieu.head.data);
        System.out.println(listHieu.head.nextNode.data);
        System.out.println(listHieu.head.nextNode.nextNode.data + "\n");
        

        // insert 25 after 20
        // 10 -> 20 -> 25 -> 30 -> null
        listHieu.insertAfter(nodeToInsertAfter, 25);

        System.out.println(listHieu.head.data);
        System.out.println(listHieu.head.nextNode.data);
        System.out.println(listHieu.head.nextNode.nextNode.data);
        System.out.println(listHieu.head.nextNode.nextNode.nextNode.data);
    }
}


class Node{
    // properties of Node
    int data;
    Node nextNode;

    // constructor to initialize Node
    public Node(int data){
        this.data = data;
        this.nextNode = null; // initially, nextNode is null
    }
}

class SinglyLinkedList{
    // properties of SinglyLinkedList
    Node head;

    // constructor
    public SinglyLinkedList(){
        this.head = null;
    }

    // append function
    public void append(int data){
        Node newNode = new Node(data);

        if (this.head == null){
            this.head = newNode;
            return;
        }

        Node last = this.head;
        while (last.nextNode != null){
            last = last.nextNode;
        }
        last.nextNode = newNode;
        
    }
    public void insertAfter(Node previousNode, int newData){
        Node newNode = new Node(newData);
        
        Node nextPre = previousNode.nextNode;

        previousNode.nextNode = newNode;
        newNode.nextNode = nextPre;
    }
    
}