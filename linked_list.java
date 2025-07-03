// A Linked List is a list containing multiple nodes
// A node contain two data:
//  + Value: int, double, str, boolean, ....
//  + Reference/Pointer: Node

// Pros:
//  + Dynamic size: Easily increase or decrease the size. Can easily insert a node anywhere without worrying about it memory.
//  + Efficient Insertion & Deletion: Can easily insert or delete a Node after finding it. Comparing to array , you need to modify alot
//  [1, 2, 3, 4, 6, 7, 8] 
//   0  1  2  3  4  5  6
// Array: 
//  [1, 2, 3, 4, 5 , 6, 7, 8]
//   0  1  2  3  4   5  6  7
// Linked List:
//   1 -> 2 -> 3 -> 4 -> 6 -> 7 -> 8
//   temp = 4.nextNode()
//   4.nextNode() = 5
//   5.nextNode() = temp
//   1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8