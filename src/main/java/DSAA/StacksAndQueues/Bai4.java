package DSAA.StacksAndQueues;
import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bai4 {
    // hàm check số nguyên tố
    public static boolean isPrime(int n){
        if (n<0){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i ==0){
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int n = Sc.nextInt();
// Thêm các số nguyên tố từ 2->9 vào cho queue
        for (int i =2; i < 10; i++){
            if (isPrime(i)){
                queue.add(i);
            }
        }
        while (!queue.isEmpty()){
            for (int i =1;i <=9; i ++){
                int a = queue.peek()*10+i;// thêm các số tử 1 đến 9 vào cuối x*10 + i (x lan luot la cac phan tu cua queue)
                if (a <=n && isPrime(a)){// neu a <= n va a la so nguyen to thi them vao queue
                    queue.add(a);
                }
            }
            System.out.print(queue.poll() + " ");//output
//queue.remove();
        }
    }
}
