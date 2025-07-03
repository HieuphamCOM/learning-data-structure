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
//  fastPointer or fastPointer.next reaches "null"