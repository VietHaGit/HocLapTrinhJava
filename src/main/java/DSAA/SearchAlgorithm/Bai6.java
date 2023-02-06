package DSAA.SearchAlgorithm;
import java.util.*;

public class Bai6 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int a[] =new int[n];
        for (int i=0; i< n; i++){
            a[i] = Sc.nextInt();
        }
        int S = Sc.nextInt();
        Sc.close();
        int Sum =0;
        int Start = 0;
        for (int i = 0;i <n;i++){
            Sum += a[i];
            while (Sum >S){
                Sum-=a[Start];
                Start++;
            }
            if (Sum==S){
                for (int j = Start; j <=i;j++){
                    System.out.print(a[j] + " ");
                }
                return;
            }
        }
        System.out.print(-1);
    }
}
