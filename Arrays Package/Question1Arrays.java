import java.util.*;

public class Question1Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you wants to store :  ");
        int n = sc.nextInt();
        int [] arr = new int[10];
        // int[] arr = {10 , 20 , 36 , 7100};
        for (int i=0; i<(n-1); i++){
            if(arr[i]<35){
                System.out.println(arr[i]);
            }
            else{
                System.out.println("No one got marks less than 35");
            }
        }
    }
    
}
