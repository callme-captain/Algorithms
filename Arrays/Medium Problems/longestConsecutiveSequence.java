
import java.util.Arrays;

public class longestConsecutiveSequence{
    public static int longestSuccessiveElements(int []a){
        int n=a.length;
        if (n==0) return 0;
        //sort the array
        Arrays.sort(a);
        int lastSmaller=Integer.MIN_VALUE;
        int cnt=0;
        int longest =1;

        //find the longest sequence:
        for(int i=0; i<n; i++){
            if(a[i]-1==lastSmaller){
                //a[i] is the next element of thecurrent sequence
                cnt+=1;
                lastSmaller=a[i];

            }
            else if(a[i]!=lastSmaller){
                cnt=1;
                lastSmaller=a[i];
            }
            longest=Math.max(longest, cnt);
        }
        return longest;

    }
    public static void main(String[] args) {
        int[] a = {100,200,1,2,3,4};
        int result=longestSuccessiveElements(a);
        System.out.println("The length of the longest consecutive sequence is: " + result);
    }
}