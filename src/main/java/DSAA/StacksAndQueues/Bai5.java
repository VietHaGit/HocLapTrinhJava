package DSAA.StacksAndQueues;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i< n; i++){
            queue.add(Sc.nextInt());
        }
        queue.remove();
        while (!queue.isEmpty()){
            System.out.print(queue.poll() +" ");
        }
    }
}
