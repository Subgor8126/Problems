class Solution {
    public int[] sortedSquares(int[] arr) {
        for (int i = 0; i<=arr.length-1;i++){
            arr[i] = arr[i]*arr[i];
        }

        for (int i = 0; i < arr.length - 1; i++)  {  
            int min_num_index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[min_num_index]){  
                    min_num_index = j;  
                }  
            }  
            int min_num = arr[min_num_index];   
            arr[min_num_index] = arr[i];  
            arr[i] = min_num;  


        
    }
    return arr;
    }
}
