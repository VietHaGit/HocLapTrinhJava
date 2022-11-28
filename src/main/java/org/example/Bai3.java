package org.example;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        // tạo ra đối tượng Sc thuộc lớp Scanner để nhập dữ liệu
        Scanner Sc = new Scanner(System.in);

        String Name = Sc.nextLine();// Nhập dữ liệu kiểu chuỗi ký tự có khoảng trắng
        String Address = Sc.nextLine();
        int Age = Sc.nextInt();// Nhập dữ liệu kiểu số nguyên
        double GPA = Sc.nextDouble();// Nhập dữ liệu kiểu số thực
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        System.out.println("Hello " + Name);
        System.out.println("Age: " + Age);
        System.out.println("GPA: " + GPA);
        System.out.println("Address: " +Address);
        System.out.println("A + B = " + ( a + b));
        System.out.println("A % B = " + (a % b));// % là toán tử chia lấy dư
        System.out.println("A - B = " + (a - b));
        System.out.println("A * B = " + (a * b));
        System.out.println("A / B = " + (a / b));
        System.out.println("In 15 years , age of " + Name + "will be " + ( Age + 15));


        // Hoàn đổi 2 giá trị biến
        int c = Sc.nextInt();
        int d = Sc.nextInt();
        int e = c;// dùng biến trung gian để hoán đổi vị trí 2 biến
        c = d;
        d = e;
        System.out.println("after swapping, a = " + c + ", b = " + d );


        // Tính chu vi của hình tròn
        double r = Sc.nextDouble();
        double pi = 3.14;
        double Cv = 2 * pi * r;
        System.out.println("Circumference = " + Cv);
    }
}
