public class rearrangeArrayElementBySign {
    public static int[] rearrangeBySign(int[] arr){
        int n=arr.length;
        int[] result = new int[n];
        int posIndex=0, negIndex=1;
        for(int i=0; i<n; i++){
            if (arr[i]<0) {
                result[negIndex]=arr[i];
                negIndex+=2;
            }
            else{
                result[posIndex]=arr[i];
                posIndex+=2;
            }

        }
        return result;


    }
    public static void main(String[] args) {
        int[] arr={1,2,-4,-5};
        int[] rearrangedArray = rearrangeBySign(arr);
        for(int i=0; i<rearrangedArray.length; i++){
            System.out.print(rearrangedArray[i] + " ");
        }
    }


}
