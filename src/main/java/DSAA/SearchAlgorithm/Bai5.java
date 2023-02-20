package DSAA.SearchAlgorithm;
import javax.sound.midi.MidiChannel;
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
         Scanner Sc = new Scanner(System.in);
         int n = Sc.nextInt();
         ArrayList<Integer> list = new ArrayList<>();
         for (int i=0;i<n;i++){
             list.add(Sc.nextInt());
         }
         int l = 0;
         int r = n -1;
         int x = Sc.nextInt();
         int result = -1;
         while (l<r){
             int Mid = (l + r)/2;
             if (list.get(Mid) < x){
                 l = Mid +1;
             }
             else {
                 r = Mid;
             }
         }
         if (list.get(l) == x){
             result = l;
         }
         System.out.print(result + " ");
    }

}
