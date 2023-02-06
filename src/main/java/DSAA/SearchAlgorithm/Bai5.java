package DSAA.SearchAlgorithm;
import java.util.*;
public class Bai5 {
    public static void main(String[] args) {
//        Tìm kiếm nhị phân;
        /*
        Scanner Sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = Sc.nextInt();
        for (int i = 0; i < n; i++){
            list.add(Sc.nextInt());
        }
        int result = -1;
        int x = Sc.nextInt();
        int l =0;
        int r= n-1;
        while ( l<r){
            int mid = (l+r)/2;
            if (list.get(mid) < x){
                l = mid +1;
            }
            else {
                r = mid;
            }
        }
        if (list.get(l) == x){
            result = l;
        }
        System.out.print(result);
         */
//      cách 2
        Scanner Sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = Sc.nextInt();
        for (int i = 0; i < n; i++){
            list.add(Sc.nextInt());
        }

        int result =-1;
        int x = Sc.nextInt();
        for (int i = 0; i<n;i++){
            if (list.get(i) == x){
                result =i;
                break;
            }
        }
        System.out.print(result+ " ");
    }

}
