public class maxConsecutiveOnes {
    static int findMaxConsecutiveOnes(int nums[]){
        int cnt=0;
        int maxi=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                cnt++;

            }else{
                cnt=0;
            }
            maxi=Math.max(maxi,cnt);
        }
        return maxi;
    
    }
    public static void main(String[] args) {
        int nums[]={1,1,0,1,1,1};
        int result=findMaxConsecutiveOnes(nums);
        System.out.println("The maximum number of consecutive 1's is: " + result);
    }
}
