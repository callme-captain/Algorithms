public class countSubarraySumEqualsK {
    public static int findAllSubarraysWithGivenSum(int arr[], int k){
        int n=arr.length;
        int cnt=0; //no. of subarrays
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<n; j++){
                sum+=arr[j];
                if(sum==k){
                    cnt++;

                }
            }
            
        }
        return cnt;

    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int k=6;
        int cnt=findAllSubarraysWithGivenSum(arr, k);
        System.out.println("The number of subarrays with sum equal to " + k + " is: " + cnt);

    }
}
