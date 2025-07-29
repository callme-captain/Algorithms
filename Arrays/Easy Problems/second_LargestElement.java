public class second_LargestElement {
    public static void main(String[] args) {
         int arr1[]={2,5,1,3,0};
        System.out.println("The second largest element in the array is:"+findSecLargest(arr1));
        System.out.println("The second smallest element in the array is:"+findSecSmallest(arr1));


        
    }
     static int findSecLargest(int arr[]){
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
       
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
          
        }
        return smax;
    }
     static int findSecSmallest(int arr[]){
        int min=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]<min){
                smin=min;
                min=arr[i];
            }
            else if(arr[i]<smin && arr[i]!=min){
                smin=arr[i];
            }
           
        }
        return smin;
    }
    
}
