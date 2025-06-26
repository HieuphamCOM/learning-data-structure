// Given an integer array, find  and print all replicated elements in the array
// Example: arr = {1 ,2 ,3 ,4, 2, 5, 6, 3}
// Output: 2, 3
// 1. Using a HashSet

// a/  Loop over the array, add the element of the array into the HashSet
// b/ If the element is already in the HashSet, print it as a replicated element

import java.util.HashSet;
public class findReplicate{
    public static void main(String[]args){
        int []arr = {1, 2, 3, 4, 2, 5, 6, 3};
        HashSet<Integer> arr1 = new HashSet<>();

        for(int element : arr){
            if(!arr1.add(element)){
                System.out.println(element);
            }
        }
    }
 } 