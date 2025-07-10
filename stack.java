// Stack: LIFO - Last In First Out
// rỗ: stack<book>
// ro.isEmpty() - true
// ro.push(nguVan12);
// ro.isEmpty() - false
// ro.push(giaiTich);
// ro.push(vatLy);
// ro.push(hoaHoc);

// ro.peek() - "hoaHoc"

// ro.pop() - "hoaHoc"
// ro.peek() - "vatLy"

// ro.pop() - "vatLy"

// ro.push(dia)
// ro.peek() - "dia"

// stack:   push - pop - peek - isEmpty

// Homework: Create a class name ArrayStack<String>
// constructor: public ArrayStack() 
//          initialize an empty stack
// public void push(String name)
//          insert name to the peek of the Stack
// public String pop()
//          delete and return the peek element of the Stack
// public String peek()
//          return the peek element of the stack with deleting it
// publi boolean isEmpty()
//          return true if the Stack is empty, else if the stack is not empty



// Linked list
// "vat-ly" -> null
//   head
// "vat-ly" -> "ngu-van" -> null

// Stack - First In Last Out
// "vat-ly" -> null
//   head
// "ngu-van" -> "vat-ly" -> null
//   head
public class linkedListEx4{
    public static void main(String[]args){
        stack ex4List = new stack();
        ex4List.push("10");
        ex4List.push("20");
        ex4List.push("30");
        ex4List.push("40");
        ex4List.popString();
        System.out.println(ex4List.peek());
        System.out.println(ex4List.isEmpty());
        //ex4List.printLinkedList();
        //System.out.println(ex4List.head.dataString);
        
    }
}
class Node{
    String dataString;
    Node nextNode;

    public Node(String dataString){
        this.dataString = dataString;
        this.nextNode = null;
    }
}
class stack{
        Node head;

        public stack(){
            this.head = null;
        }

    public void push(String data){
            Node newNode = new Node(data);
            if(this.head ==  null){
                this.head = newNode;
                return;
            }

            
            Node aNode = this.head;
            newNode.nextNode = aNode;
            this.head = newNode;
            
    } 
    public String popString(){
            if(this.head == null){
                System.out.println("The stack is empty");
                return null;
            }
            String popString2 = this.head.dataString;
            this.head = this.head.nextNode;
            return popString2;
        }

    public String peek(){
        if(this.head == null){
            System.out.println("The stack is empty");
            return null;
        }
        return this.head.dataString;
    }
    
    public boolean isEmpty(){
        return this.head == null;
    }
       

    public  void printLinkedList(){
            Node curNode = this.head;
            while(curNode != null){
            System.out.println(curNode.dataString);
            curNode = curNode.nextNode;
        }
    }
}      





