// Ex4: Detecting a Cycle in a SinglyLinkedList
// Description: 
//      A list known as holding a Cycle if begin at Node and end at a Node
// Write a function in SinglyLinkedList
//          public boolean hasCycle()
// return "true" if it has a Cycle, else return "false"

// Example: 
// 10 -> 20 -> 30 -> 40 -> null     ------ return false
// 10 -> 20 -> 30 -> 40 
//       ^------------|
//                      ------ return true


// How to solve:
//  Floyd's Cycle-Finding Algorithm
//  Use to pointers: slowPointer, fastPointer
//  Two pointers start at head
//  slowPointer = slowPointer.next;
//  fastPointer = fastPointer.next.next;

// If the list has a Cycle:
//  slowPointer and fastPointer will meet each other at point during the work

// if the list does not have a Cycle
//  fastPointer or fastPointer.next reaches "null

public class linkedListEx4{
    public static void main(String[]args){
        SinglyLinkedList ex4List = new SinglyLinkedList();
        ex4List.append(10);
        ex4List.append(20);
        ex4List.append(30);
        ex4List.append(40);
        ex4List.hasCycle();
        // System.out.println(ex4List.hasCycle());

        // Tạo một linkedlist -> null
        SinglyLinkedList testList = new SinglyLinkedList();
        testList.append(10);
        testList.append(20);
        testList.append(30);
        testList.append(40);
        testList.append(50);

        // Tạo điểm bắt đầu của loop
        Node tmpNode = testList.head;
        tmpNode = tmpNode.nextNode; // 20

        // Duyệt qua linkedlist cho tới node cuối cùng
        Node current = testList.head;
        while (current != null) { // nếu node chưa phải null thì tiếp tục chạy
// 10 -> 20 -> 30 -> 40  -> 50
//       ^------------------|
//                      ------ return true
            if (current.nextNode == null){
                current.nextNode = tmpNode;
                break;
            }
            current = current.nextNode; // cho node nhảy node tiếp theo
        }
        System.out.println(testList.hasCycle());
        // testList.printLinkedList();
        
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
            if(this.head ==  null){
                this.head = newNode;
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

    public boolean hasCycle(){
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.nextNode != null){
                slow = slow.nextNode;
                fast = fast.nextNode.nextNode;

                if(slow == fast){
                    return true;
                }
            }
            return false;
        }
    }

