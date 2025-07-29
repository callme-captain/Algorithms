public class missingNumber {
    public static int missingNum(int []a, int n){
        int sum=(n*(n+1))/2;
        int arrSum=0;
        for(int i=0;i<n-1;i++){
            arrSum+=a[i];
        }
        int missingN=sum-arrSum;
        return missingN;

    }
    public static void main(String[] args) {
        int n=7;
        int a[]={1,2,4,5,6,7};
        int result=missingNum(a,n);
        System.out.println("The missing number is: " + result);
    }
    
}
