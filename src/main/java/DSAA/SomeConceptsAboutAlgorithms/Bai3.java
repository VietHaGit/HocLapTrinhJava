package DSAA.SomeConceptsAboutAlgorithms;
import java.util.*;
public class Bai3 {
//    thuật toán chia để trị
    public static int count(int[] arr, int l, int r,int x){
        if (l ==r){
            if (arr[l]==x){
                return 1;
            }
            else {
                return 0;
            }
        }
        else {
            int m = (l+r)/2;
            return count(arr,l,m,x) + count(arr, m+1,r,x);
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int[] arr = new int[100001];
        for (int i = 0; i < n; i++){
            arr[i] = Sc.nextInt();
        }
        int x = Sc.nextInt();
        System.out.print(count(arr,0,n-1,x));
    }
}
