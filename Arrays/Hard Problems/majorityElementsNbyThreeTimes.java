import java.util.*;

public class majorityElementsNbyThreeTimes {
    public static List<Integer> majorityElement(int []v) {
        int n = v.length; //size of the array

        int cnt1 = 0, cnt2 = 0; // counts
        int el1 = Integer.MIN_VALUE; // element 1
        int el2 = Integer.MIN_VALUE; // element 2

        // applying the Extended Boyer Moore's Voting Algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && el2 != v[i]) {
                cnt1 = 1;
                el1 = v[i];
            } else if (cnt2 == 0 && el1 != v[i]) {
                cnt2 = 1;
                el2 = v[i];
            } else if (v[i] == el1) cnt1++;
            else if (v[i] == el2) cnt2++;
            else {
                cnt1--; cnt2--;
            }
        }

        List<Integer> ls = new ArrayList<>(); // list of answers

        // Manually check if the stored elements in
        // el1 and el2 are the majority elements:
        cnt1 = 0; cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el1) cnt1++;
            if (v[i] == el2) cnt2++;
        }

        int mini = (int)(n / 3) + 1;
        if (cnt1 >= mini) ls.add(el1);
        if (cnt2 >= mini) ls.add(el2);

        

        return ls;
    }

    public static void main(String args[]) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = majorityElement(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }

   
    
}
//Brute force approach
// public class tUf {
//     public static List<Integer> majorityElement(int []v) {
//         int n = v.length; //size of the array
//         List<Integer> ls = new ArrayList<>(); // list of answers

//         for (int i = 0; i < n; i++) {
//             //selected element is v[i]:
//             // Checking if v[i] is not already
//             // a part of the answer:
//             if (ls.size() == 0 || ls.get(0) != v[i]) {
//                 int cnt = 0;
//                 for (int j = 0; j < n; j++) {
//                     // counting the frequency of v[i]
//                     if (v[j] == v[i]) {
//                         cnt++;
//                     }
//                 }

//                 // check if frquency is greater than n/3:
//                 if (cnt > (n / 3))
//                     ls.add(v[i]);
//             }

//             if (ls.size() == 2) break;
//         }

//         return ls;
//     }

//     public static void main(String args[]) {
//         int[] arr = {11, 33, 33, 11, 33, 11};
//         List<Integer> ans = majorityElement(arr);
//         System.out.print("The majority elements are: ");
//         for (int i = 0; i < ans.size(); i++) {
//             System.out.print(ans.get(i) + " ");
//         }
//         System.out.println();
//     }
// }
