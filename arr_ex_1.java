// Given an integer array, find  and print all replicated elements in the array
// Example: arr = {1 ,2 ,3 ,4, 2, 5, 6, 3}
// Output: 2, 3
// Two ways:
// 1. Using nested loops
// 2. Using a HashSet

// Cach su dung git:
// git status
// git add -A
// git status
// git commit -m "[ADD] new exercises"
// git push

public class replicatedElement{
    public static void main(String[]args){
        int []arr = {1, 2, 3, 4, 2, 5, 6, 3};
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i] + " ");
                }
            }
        }
        
    }
}