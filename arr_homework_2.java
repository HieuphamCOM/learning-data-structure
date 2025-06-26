// Given an integer array. Write a function to calculate the sum of all odd numbers in the array

// Example arr = {1, 2, 3, 4, 5, 6}

public class arr_homework_2{
    public static void main(String[]args){
        int []arr = {1, 2, 3, 4, 5, 6};
        System.out.println("sum of odd number: " + sumOfOdd(arr));
    }
        public static int sumOfOdd(int[]arr){
            int sum = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] % 2 != 0){
                    sum = sum + arr[i];
                }
            }
            return sum;
        }
    
}