// given an integer array [10, 20, 30, 40, 50]
// find the maximum and minimum, find the average
// print out
public class array{
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};

        // Find max
        int varMax = -99999; // set một số rất nhỏ
        for (int i = 0; i < arr.length; i++){
            int curNum = arr[i]; // gọi giá trị hiện tại trong array
            if (varMax < curNum){ // so sánh giá trị varMax với giá trị curNum
                varMax = curNum; // nếu varMax nhỏ hơn thì set varMax bằn curNum
            }
        }
        // in ra varMax
        System.out.println(varMax);

        // Find min
        int varMin = 99999;
        for(int i = 0; i < arr.length; i++){
            int curNum = arr[i];
        if(varMin > curNum){
            varMin = curNum;
        }
        
    }
            System.out.println(varMin);

            //  Find average
            double average  = Average(arr);
            System.out.println("Average" + average);
        
    
    }
    public static double Average(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum +=arr[i];
        }
        return sum / arr.length;
    }
}