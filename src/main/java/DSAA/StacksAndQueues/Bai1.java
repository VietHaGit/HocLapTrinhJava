package DSAA.StacksAndQueues;
import java.util.Scanner;
import java.util.Stack;
public class Bai1 {
    //Stack
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String S = Sc.nextLine(); // Nhập vào chuỗi
        Stack<String> St = new Stack<>(); // khởi tạo Stack

        //Input vào Stack
        for (int i = 0; i < S.length(); i++){
            St.push(S.charAt(i) + "");
        }

        for (int i =0 ; i < S.length(); i++){
            System.out.print(St.pop());// suất ra thứ tự đảo ngược chuỗi
        }
    }
}
