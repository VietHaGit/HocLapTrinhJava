package DSAA.SearchAlgorithm;
import java.util.*;
public class Bai1 {
    /*
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int n = Sc.nextInt();
        for (int i = 0; i < n;i++){
            arrayList.add(Sc.nextInt());
        }
        int k = Sc.nextInt();
        int result = -1;
        for (int i = 0; i<n;i++){
            if (arrayList.get(i)==k){
                result = i;
               break;
            }
        }
        System.out.print(result);
    }
     */
//    Tìm kiếm tuyến tính
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = Sc.nextInt();
        for (int i = 0; i < n; i++){
            list.add(Sc.nextInt());
        }
        int result = -1;
        int x = Sc.nextInt();
        for (int i =0; i< n; i++){
            if (list.get(i)==x){
                result = i;
                break;
            }
        }
        System.out.print(result);
    }
}