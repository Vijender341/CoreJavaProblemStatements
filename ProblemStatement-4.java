import java.util.*;
class Solution{
    static int n1=0,n2=1,n3=0;
    public static int maxArray(int n,int arr[]){
        if(n==1){
            return arr[0];
        }
        return Math.max(arr[n-1],maxArray(n-1, arr));
    }
    public static void Fibonacii(int num){
        if(num>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            Fibonacii(num-1);
            
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size :");
        int n = in.nextInt();
        System.out.println("Enter Array elemets ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int max = maxArray(n,arr);
        System.out.println("The max element of array is "+ max);
        System.out.println("Enter number for Fibonacii");
        int num = in.nextInt();
        
        System.out.print("0 1 ");
        Fibonacii(num-2);
    }
}
