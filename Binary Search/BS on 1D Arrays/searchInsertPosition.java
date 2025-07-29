

public class searchInsertPosition {
   public static int searchInsert(int[] nums, int x){
    int n=nums.length;
    int low=0, high=n-1;
    int ans=n;
    while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]>=x){
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
       int[] nums={1,2,4,7};
       int x=6;
       int ind=searchInsert(nums, x);
       System.out.println("The index is: " + ind);

   }
}
