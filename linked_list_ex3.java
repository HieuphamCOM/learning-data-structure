// Ex3: Delete First Occurence of a Node by Value
// Write a function in SinglyLinkedList
//              public void deleteNode(int key)
// It deletes the first node with data equal to key
// Example: Given a list
//  10> -> 20 -> 30 -> 20 -> null
// when we call list.deleteNode(20)
// the list now is      10 -> 30 -> 20 -> null
// Special scenarios:
// if head is null -> ?
// if list is empty -> ?
// if head.data == key -> ?

import javax.swing.SingleSelectionModel;

public class linkedListEx3{
    public static void main(String[]args){
        SinglyLinkedList exLinkedList = new SinglyLinkedList();
        exLinkedList.append(10);
        exLinkedList.append(20);
        exLinkedList.append(30);
        exLinkedList.append(20);
        exLinkedList.deleteNode(10);
        exLinkedList.deleteNode(20);
        exLinkedList.printLinkedList();
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
        this.head  = newNode;
        return;
    }
        Node last = this.head;
        while(last.nextNode != null){
        last = last.nextNode;
            
        }
        last.nextNode = newNode;
    }

    public void printLinkedList(){
        Node curNode = this.head;
        while(curNode != null){
        System.out.println(curNode.data);
        curNode = curNode.nextNode;
        }
    }
    public void deleteNode(int key){
    Node curNode = this.head;
    Node previousNode = null;

    if(curNode != null && curNode.data == key){
        this.head = curNode.nextNode;
        return;
    }
    while(curNode != null && curNode.data != key){
        previousNode = curNode;
        curNode = curNode.nextNode;
    }
    if(curNode == null){
        return;
    }
    previousNode.nextNode = curNode.nextNode;
    }
}

