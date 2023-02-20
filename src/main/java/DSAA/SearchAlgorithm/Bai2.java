package DSAA.SearchAlgorithm;
import java.util.*;
public class Bai2 {
    /*
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i =0;i<n;i++){
            list.add(Sc.nextInt());
        }

        int min = list.get(0);
        int max = list.get(0);
        int indexmax = 0;
        int indexmin = 0;

        for (int i = 1; i< n; i++){
            if (list.get(i) < min){
                min = list.get(i);
                indexmin = i;
            }
            if (list.get(i)>=max){
                max = list.get(i);
                indexmax = i;
            }
        }
        Collections.swap(list, indexmin,indexmax);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

    }
     */
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i< n;i++){
            list.add(Sc.nextInt());
        }

        int Min = list.get(0);
        int Max = list.get(0);
        int  indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < n;i++){
            if (list.get(i) < Min ){
                Min = list.get(i);
                indexMin = i;
            }
            if (list.get(i) >= Max){
                Max = list.get(i);
                indexMax = i;
            }
        }
        Collections.swap(list,indexMin,indexMax); // Hàm hoán đổi vị trí.
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
