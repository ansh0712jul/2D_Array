public class search_2dmatrix {
    public static void main(String[] args) {
       int arr[][]= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
       System.out.println(search(arr, 13));
    }
    public static boolean search(int arr[][],int target){
        int r=0;
        int col=arr[0].length-1;
        while(r<arr.length && col>0){
            if(arr[r][col]==target) return true;
            else if(arr[r][col]>target) col--;
            else r++;
        }
        return false;
    }
}
