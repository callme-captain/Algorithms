import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public static List<Integer> printSpiral(int[][] mat){
        //define ans list to store the result.
        List<Integer> ans = new ArrayList<>();
        int n=mat.length;
        int m=mat[0].length;

        //Initialize the pointers required for traversal.
        int top=0, left=0, bottom=n-1, right=m-1;

        //Loop until all elements are not traversed.
        while(top<=bottom && left<=right){
            //for moving left to right
            for(int i=left; i<=right; i++)
                ans.add(mat[top][i]);
            top++;

            
            //for moving top to bottom
            for(int i=top; i<=bottom; i++)
                ans.add(mat[i][right]);

            right--;

            //for moving right to left.
            if(top<=bottom){
                for(int i=right; i>=left; i--)
                    ans.add(mat[bottom][i]);
                bottom--;
            }
            //for moving bottom to top.
            if(left<=right){
                for(int i=bottom; i>=top; i--)
                    ans.add(mat[i][left]);
                left++;
            }
           
        }
        return ans;

    }
    public static void main(String[] args) {
        int[][] mat={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
        List<Integer> result = printSpiral(mat);
        for(int i=0; i<result.size(); i++){
            System.out.print(result.get(i) + " ");
        }            
               
    }
    
}
