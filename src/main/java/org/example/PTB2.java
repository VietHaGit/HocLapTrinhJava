package org.example;

import java.util.Scanner;

public class PTB2 {
    /*
    public  void giaiPTBac2(float a, float b, float c) {
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
        // tính delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
class Test1 {
    public static void main(String[] args) {
        PTB2 ptb2 = new PTB2();
        Scanner Sc = new Scanner(System.in);
        System.out.print("Nhập hệ số bậc 2, a = ");
        float a = Sc.nextFloat();
        System.out.print("Nhập hệ số bậc 2, b = ");
        float b = Sc.nextFloat();
        System.out.print("Nhập hệ số bậc 2, c = ");
        float c = Sc.nextFloat();
       ptb2.giaiPTBac2(a,b,c);

    }

     */

    private float a;
    private float b;
    private float c;

    public PTB2(float a , float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public  void giaiPTBac2(float a, float b, float c) {
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
        // tính delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}

   class  Test1 {
public static void main(String[] args) {
    PTB2 ptb2 = new PTB2(2,1,-1);
    ptb2.giaiPTBac2(2,1,-1);

}
   }



