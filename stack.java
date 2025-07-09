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

class Stack{
    int top, cap;
    int[]a;

    public Stack(int cap){
        this.cap = cap;
        top = -1;
        a  = new int[cap];
    }

    public void push(String name){
        if(top >= cap - 1){
            System.out.println("Stack overflow");
        }
        a[++top] = String name;

    }
    public String pop(){
        if(top < 0){
            System.out.println("Stack overflow");
        }
        return a[top--];
    }
    public String peek(){
        if(top < 0){
            System.out.println("Stack is Empty");
        }
        return a[top];
    }
    public boolean isEmpty(){
        return top < 0;
    }
}