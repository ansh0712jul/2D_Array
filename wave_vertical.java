import java.util.Scanner;

public class wave_vertical {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();//row
        int m=sc.nextInt();//column
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) arr[i][j]=sc.nextInt();
        }
        for(int col=0;col<arr[0].length;col++){
            if(col%2==0){
                for(int row=0;row<arr.length;row++) System.out.print(arr[row][col]+" ");

            }
            else {
                for(int row=arr.length-1;row>=0;row--) System.out.print(arr[row][col]+" ");
            }
        }
    }
}
// INTUITION
// COL FIX H ISLIYE USKI LOOP BHAR LGEGI OR ROW KI B=VLAUE CHANGE HO RHI H ISLIYE WO ANDAR 
// -->jb col ki value divisible by 2 h toh row ki loop seedhi chlege 
// --> jb col ki vlaue not divisible by 2 h toh row ki loop ulti chlegi