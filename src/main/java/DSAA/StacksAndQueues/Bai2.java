package DSAA.StacksAndQueues;
import java.util.Stack;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        Stack<Integer> St = new Stack<>();
        while (n >0){
            St.push(n % 2);// trả về phần dư
            n = n/2; // tiếp tục chia tới n = 0
        }

        while (!St.empty()){
            System.out.print(St.pop());
        }
    }
}
