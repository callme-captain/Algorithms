public class nextPermutation {
    public static int[] nextGreaterPermutation(int[] arr){
        int n=arr.length;

        //Step 1: Find the break point
        int ind=-1;
        for(int i=n-2; i>=0; i--){
            if (arr[i] < arr[i+1]){
                ind=i;
                break;
            }
        }
        // If break point does not exist:
        if(ind == -1){
            // reverse the whole array:
            reverse(arr, 0, n-1);
           
            return arr;

        }
        //Step 2: Find the next greater element and swap it with arr[ind]:
        for(int i=n-1; i>ind; i--){
            if (arr[i] > arr[ind]){
                int temp=arr[i];
                arr[i]=arr[ind];
                arr[ind]=temp;
                break;
            }
        }
        //Step 3:reverse the right half:
        reverse(arr,ind+1,n-1);
        return arr;
    }
    static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr={2,1,5,4,3,0,0};
        int[] result=nextGreaterPermutation(arr);
        System.out.print("Next greater permutation is: [");
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
        System.out.println("]");
    }
}
