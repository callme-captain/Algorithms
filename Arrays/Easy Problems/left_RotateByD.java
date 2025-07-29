public class left_RotateByD {
    public static void reverse(int arr[], int start,int end ){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotateLeftByD(int arr[], int n, int k) {
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n=7;
        int k=3;
        rotateLeftByD(arr, n, k);
        System.out.println("Array after left rotation by " + k + " positions:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
       
    }
}
