public class upperBound {
   public static int upperBond(int[] nums, int n, int x){
    int low=0, high=n-1;
    int ans=n;
    while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]>x){
            ans=mid;
            high=mid-1;

        }
        else{
            low=mid+1;
        }

    }
    return ans;
   } 
   public static void main(String[] args) {
       int[] nums={3,5,8,25,19};
       int n=5, x=9;
       int ind=upperBond(nums, n, x);
       System.out.println("The upper bound of " + x + " is at index: " + ind);

   }
}
