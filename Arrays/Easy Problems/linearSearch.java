public class linearSearch {
    public static int LinearSearch(int arr[],int num,int n){
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int num=7;
        int n=arr.length;
        int value=LinearSearch(arr,num,n);
        System.out.println(value);
       
    }
    
}
