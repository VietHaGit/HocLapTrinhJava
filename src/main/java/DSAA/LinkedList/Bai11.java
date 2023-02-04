package DSAA.LinkedList;
import  java.util.*;
public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = n; i>=1; i--){
            list.add(i);
        }
        for (int i =2;i <=n; i++){
            list.add(i);
        }

        while (!list.isEmpty()){
            System.out.print(list.poll() + " ");
        }
    }
}
