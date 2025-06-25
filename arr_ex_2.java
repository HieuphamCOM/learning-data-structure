// Given an integer array, write a function isSorted taking the integer array as input and returning true if the array is sorted in ascending order, otherwise return false.
// Example:
// arr = {1, 2, 3, 4, 5} -> output true
// arr = {1 , 3, 2, 4, 5} -> output false

// a[i] = 1 ; a[i+1] =3
// a[i] < a[i+1] -> continue to turn
// return true

// a[i] = 3 ; a[i+1] = 2
// a[i] > a[i+1]  -> return false
// Way to solve:
// 1. Using a Single Loop

public class isSorted{
    public static void main (String[]args){
        int []arr = {1, 3, 2, 4, 5};
        // for(int i = 0; i < arr.length - 1; i++ ){
        //     if(arr[i] > arr[i + 1]){
        //         return false;

        //     }
        // }
        // return true;
        System.out.println(return_0(arr));
    }
    // Shortcut to comment: ctrl + /
    // A function return boolean
    public static boolean return_0 (int[] arr){
         for(int i = 0; i < arr.length - 1; i++ ){
             if(arr[i] > arr[i + 1]){
                 return false;

            }
        }
        return true;
    }
}