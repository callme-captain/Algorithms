import java.util.*;

public class rotatedSortedArrayI {
    public static int search(ArrayList<Integer> arr, int n, int k){
        int low=0, high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr.get(mid)==k) return mid;
            if(arr.get(low)<=arr.get(mid)){
                if(arr.get(low)<=k && k<arr.get(mid)){
                    high=mid-1; // search in left half
                } else {
                    low=mid+1; // search in right half
                }
            } else {
                if(arr.get(mid)<k && k<=arr.get(high)){
                    low=mid+1; // search in right half
                } else {
                    high=mid-1; // search in left half
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7,8,9,1,2,3,4,5,6));
        int n=9, k=1;
        int index = search(arr, n, k);
        if (index != -1) {
            System.out.println("Element " + k + " found at index: " + index);
        } else {
            System.out.println("Element " + k + " not found in the array.");
        }
    }
}
