package org.example;

public class Bai2 {
    public static void main(String[] args) {
        int a = 254;// khai báo kiểu dữ liệu số nguyên a = 254: 4 byte
        int b = 343;
        int dob = 2019;
        int d = 7;
        long a1 = 384847522; // 8 byte
        long a2 = 988347273;
        String Name = "Codelearn";// khai báo kiểu dữ liệu chuỗi hoặc mảng ký tự.
        Double c = 10.5; // Khai báo kiểu dữ liệu số thực: 8 byte
        Double Length = 7.5;
        Double Width = 3.8;
        char e = 'x'; // kiểu dữ liệu chỉ lưu trữ được 1  ký tự: 2 byte
        char f = 'a' + 3;
        boolean b1 = true; // kiểu dữ liệu luận lý
        boolean b2 = a > b;
        System.out.println("a + b =" +(a + b));
        System.out.println("a - b =" +(a - b));
        System.out.println("a * b =" +(a * b));
        System.out.println("a / b =" +(a / b));
        System.out.println("Hello " + Name);
        System.out.println("Name: " + Name);
        System.out.println("Data of birth: " + dob);
        System.out.println("c / d = " + (c / d));
        System.out.println("Area = " + ( Length * Width));
        System.out.println(e);
        System.out.println(f);
        System.out.println(a1 * a2);
        System.out.println(b1);
        System.out.println(b2);
    }
}

