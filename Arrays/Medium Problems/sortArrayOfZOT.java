public class sortArrayOfZOT {
    public static void sortArray(int[] arr){
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0 -> {
                    // swap arr[low] and arr[mid]
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                }

                case 1 -> mid++;

                case 2 -> {
                    // swap arr[mid] and arr[high]
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0, 1};
        sortArray(arr);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
