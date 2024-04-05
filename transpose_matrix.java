import java.util.Scanner;

public class transpose_matrix {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();//row
        int m=sc.nextInt();//column
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) arr[i][j]=sc.nextInt();
        }
        transpose(arr);
        display(arr);
    }
    public static void transpose(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

    }
    public static void display(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++) System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
}
// INTUITION
// -->col ki loop row ki value +1 se chlegi kyuki wo waali columns phle hi transpose ho chuki hogi 