package DSAA.SearchAlgorithm;
import java.util.*;
public class Bai4 {
    /*
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = Sc.nextInt();
        for (int i =0; i<n;i++){
            list.add(Sc.nextInt());
        }

        boolean KT = true;
        for (int i = 0; i<n;i++){
            if (i %2==0 && list.get(i)%2 !=0){
                System.out.print(list.get(i)+ " ");
                KT = false;
            }
        }
        if (KT == true){
            System.out.print("NULL");
        }
    }
     */
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = Sc.nextInt();
        for (int i = 0 ; i<n; i++){
            list.add(Sc.nextInt());
        }
        boolean check = true;
        for (int i = 0; i< n; i++){
            if (i%2==0 && list.get(i) %2 !=0){
                System.out.print(list.get(i)+" ");
                check = false;
            }
        }
        if (check==true){
            System.out.print("NULL");
        }
    }
}
