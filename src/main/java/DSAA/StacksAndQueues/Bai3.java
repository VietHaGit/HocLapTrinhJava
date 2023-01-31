package DSAA.StacksAndQueues;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Bai3 {
    //Queue
    public static void main(String[] args) {
        /*
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i< n; i++){
            queue.add(Sc.nextInt());
        }
        int k = Sc.nextInt();
       for (int i = 0; i < k ; i++){
         queue.add(queue.element());
         queue.remove();
       }
       for (int i = 0 ; i < n; i++){
           System.out.print(queue.element() + " ");
           queue.remove();
       }

         */

        /*
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.print("Queue" + queue);

        int a = queue.element();
        System.out.print("Truy cập phần tử đầu tiên" + a);

        int b = queue.poll();
        System.out.print("Loại bỏ phần tử đầu tiên: " + b);

        System.out.print("Cập nhật  Queue:" + queue);
         */

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(9);
        queue.add(3);
        queue.add(7);
        System.out.print("Danh sách ban đầu: ");
        for (Integer i: queue){
            System.out.print(i + "\t");
        }
}
}
