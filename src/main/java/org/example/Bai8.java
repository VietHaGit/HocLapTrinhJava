package org.example;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        //Strings in java

        //prints the k'th character in s.
        /*
        String S = Sc.next();
        int k = Sc.nextInt();
        System.out.print(S.charAt(k - 1));
         */

        //To find the length of a string
        /*
        String S = Sc.next();
        System.out.print(S.length());
         */

        //use loop to iterate through characters in String
        /*
        String S = Sc.next();
        for (int i = 0; i < S.length(); i ++){
            System.out.println(S.charAt(i));
        }
         */

        //toCharArray
        /*
        String S = "codelern";
        for (char c: S.toCharArray()){
            System.out.println(c);
        }
         */


        //  Write a program that accepts these two variables from the user and prints the occurrences of character c in s
        /*
        String s = Sc.next();
        char c = Sc.next().charAt(0);
        int answer = 0;
        for (int i = 0 ; i < s.length(); i++){
            if (s.charAt(i) == c){
                answer++;
            }
        }
        System.out.print(answer);
         */

        //options 2
        /*
        String S= "codelearn";
        char c = Sc.next().charAt(0);
        int answer = 0;

        char[] chars = S.toCharArray();
        for (int i = 0; i< S.length(); i ++){
            if (chars[i] == c){
                answer++;
            }
        }
        System.out.print(answer);
         */

        //Write a program that accepts these two variables from the user and finds the position of the first occurrence of c in string s
        String S = Sc.next();
        char c = Sc.next().charAt(0);
        int answer1= -1;
        for (int i = 0 ; i< S.length(); i ++){
            if (S.charAt(i) == c){
                answer1 = i;
                break;
                /*
                 * Gọi lệnh break để dừng vòng lặp do đã tìm thấy vị trí đầu tiên mà ký tự c
                 * xuất hiện. Nếu không có lệnh break thì kết quả của chương trình sẽ là vị trí
                 * cuối cùng mà ký tự c xuất hiện.
                 */
            }
        }
        System.out.print(answer1);
    }
}
