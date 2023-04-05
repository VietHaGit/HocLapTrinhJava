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
        ArrayList<Integer> list = new ArrayList<>();
        int n = Sc.nextInt();
        for (int i = 0;i < n; i++){
            list.add(Sc.nextInt());
        }

        int max = list.get(0);
        int min = list.get(0);
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < n; i++){
            if (min > list.get(i)){
                min = list.get(i);
                indexMin = i;
            }
            if (max <= list.get(i)){
                max = list.get(i);
                indexMax = i;
            }
        }
        Collections.swap(list, indexMin, indexMax);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+ " ");
        }
    }
}
