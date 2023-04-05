package DSAA.SearchAlgorithm;
import java.util.*;
public class Bai3 {
//    đếm số lần phần tử xuất hiện
    /*
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        int n = Sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i =0; i <n;i++){
            arrayList.add(Sc.nextInt());
        }
        int x = Sc.nextInt();
        int count = 0;
        for (int i =0;i<n;i++){
            if (arrayList.get(i)==x ){
                count ++;
            }
        }
        System.out.print(count + " ");
    }
     */
public static void main(String[] args) {
   Scanner Sc = new Scanner(System.in);
   ArrayList<Integer> list = new ArrayList<>();
   int n = Sc.nextInt();
   for (int i = 0; i< n; i++){
       list.add(Sc.nextInt());
   }
   int x = Sc.nextInt();
   int count = 0;
   for (int i = 0; i < n; i++){
       if (list.get(i) == x){
           count ++;
       }
   }
   System.out.print(count);
}
}

