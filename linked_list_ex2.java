// Ex2: 
// Write a function named findPrevious(int key) to return a Node previous value of key in SinglyLinkedList.
// This function returns a Node right before the node with data equal to key
// For example:
// Create a SinglyLinkedList 
// 10 -> 20 -> 30 -> 40 -> null
// i/ list.findPrevious(30) -> return node with data 20
// ii/ list.findPrevious(10) -> return null
// iii/ list.findPrevious(50) -> return null
// iv/ linkedlist is empty -> return null

public class linked_list_ex2{
    public static void main(String[]args){
        // Node currentNode = new Node(4);
        SinglyLinkedList nodeLinkedList = new SinglyLinkedList();
        nodeLinkedList.append(10);
        nodeLinkedList.append(20);
        nodeLinkedList.append(30);
        nodeLinkedList.append(40);
        nodeLinkedList.printLinkedList();
        System.out.println((nodeLinkedList.findPreviousNode(50)));
    }
}

class Node{
        int data;
        Node nextNode;

    public Node(int data){
        this.data = data;
        this.nextNode = null;
    }
}

class SinglyLinkedList{
    Node head;
    public SinglyLinkedList(){
        this.head = null;
    }

    public void append(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
            return;
        }
        Node last = this.head;
        while (last.nextNode != null){
            last = last.nextNode;
        }
        last.nextNode = newNode;
    }

    // print is a void function
    // while current.next != null

    public void printLinkedList(){
        Node curNode = this.head;
        while(curNode != null){
            System.out.println(curNode.data);
            curNode = curNode.nextNode;
        }
    }

// Create a SinglyLinkedList 
// 10 -> 20 -> 30 -> 40 -> null    
// i/ list.findPrevious(30) -> return node with data 20 ------ Done
// ii/ list.findPrevious(10) -> return null ------ Done
// iii/ list.findPrevious(50) -> return null ------ Done
// iv/ linkedlist is empty -> return null ------ Done
    public Node findPreviousNode( int key){
        //  i/ list.findPrevious(30) -> return node with data 20
        Node curNode = this.head;
        Node prNode = null;

        if(curNode.data == key){
            return prNode;
        }
        while(curNode != null){
            if(curNode.data == key){
                
                return prNode;
                
            }
            prNode = curNode;
            curNode = curNode.nextNode;
        }
        return null;
        
    }

}

