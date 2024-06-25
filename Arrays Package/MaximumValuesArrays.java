// Question : - Find the maximum values out of all the element in the Arrays . 

public class MaximumValuesArrays {
    public static void main(String[] args) {
        int arr [] = {1 , 2 , 10 , 20 , 50 };
        int mx = arr[0];
        int n = arr.length;
        for(int i = 1; i <n ;i++){
            if(arr[i]> mx){
                mx = arr[i];
                
            }
            System.out.print(mx);
            
        }

    }
}
