//Moore's Voting Algorithm
public class majorityElement {
    public static int majorityElements(int []v){
        int n=v.length;
        int cnt=0;
        int el=0;
        for(int i=0; i<n;i++){
            if(cnt==0){
                cnt=1;
                el=v[i];

            }else if(el==v[i]) cnt++;
            else cnt--;

        }
        int cnt1=0;
        for(int i=0; i<n; i++){
            if(v[i]==el) cnt1++;
        }
        if(cnt1>(n/2)) return el;
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,2,1,1,1,2,2};
        int result=majorityElements(arr);
        System.out.println("The majority element is: " + result);
    }


    
}
