public class singleElementInTheSortedarray {
    public static int singleNonDuplicate(int[] arr){
        int n=arr.length;
        //edge cases
        if(n==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];

        int low=1, high=n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]) {
                return arr[mid];
            }
            if((mid % 2 == 0 && arr[mid] == arr[mid + 1]) || (mid % 2 == 1 && arr[mid] == arr[mid - 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,5,5,6,6};
        int ans=singleNonDuplicate(arr);
        System.out.println("The single element in the sorted array is: " + ans);
    }
}
