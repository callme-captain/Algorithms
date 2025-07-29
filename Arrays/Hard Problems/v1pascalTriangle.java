//In this case, we are given the row number r and the column number c, and we need to find out the element at position (r,c). 
public class v1pascalTriangle{
    public static long nCr(int n, int r){
        long res =1;
        //calculating nCr:
        for(int i=0; i<r; i++){
            res*=(n-i);
            res/=(i+1);
        }
        return res;

    }
    public static int pascalTriangle(int r, int c){
        int element=(int)nCr(r-1, c-1);
        return element;
    }
    public static void main(String[] args) {
        int r=5;
        int c=3;
        int element = pascalTriangle(r, c);
        System.out.println("Element at position (" + r + "," + c + ") in Pascal's Triangle is: " + element);
    }
}