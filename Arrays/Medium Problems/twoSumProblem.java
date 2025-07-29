//Basic implementation of the Two Sum problem in Java
public class twoSumProblem {
    public static int[] twoSum(int n, int []arr, int target){
        int[] ans=new int[2];
        ans[0]=ans[1]=-1;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        int[] arr={2,6,5,8,11};
        int target=14;
        int[] result=twoSum(n,arr,target);
        System.out.println("Indices of the two numbers that add up to " + target + ":["+result[0]+","+result[1]+"]");
    }
    
}
// Optimized implementation of the Two Sum problem in Java using sorting and two pointers
// public class Main {
//     public static String twoSum(int n, int []arr, int target) {
//         Arrays.sort(arr);
//         int left = 0, right = n - 1;
//         while (left < right) {
//             int sum = arr[left] + arr[right];
//             if (sum == target) {
//                 return "YES";
//             } else if (sum < target) left++;
//             else right--;
//         }
//         return "NO";
//     }

//     public static void main(String args[]) {
//         int n = 5;
//         int[] arr = {2, 6, 5, 8, 11};
//         int target = 14;
//         String ans = twoSum(n, arr, target);
//         System.out.println("This is the answer for variant 1: " + ans);

//     }

// } 