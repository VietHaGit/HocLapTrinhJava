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
        /*
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

            }
        }
        System.out.print(answer1);
         */

        // The replace method
        /*
        String S = "Code4earn";
        System.out.print(S.replace('4','l'));
         */

        // The toUpperCase/toLowerCase
        /*
        String S = "CoDeleaRn";
        System.out.println(S.toUpperCase());
        System.out.println(S.toLowerCase());
         */

        // The indexOf method
        /*
        String S = "Codelearn";
        System.out.println(S.indexOf("learn"));
        System.out.println(S.indexOf("Baclk"));
         */

        //The startsWith and endsWith
        /*
        String S = "codelearn";
        System.out.println(S.startsWith("code"));
        System.out.println(S.startsWith("ha"));
        System.out.println(S.endsWith("rn"));
        System.out.println(S.endsWith("z"));
         */

        // The split method
        /*
        String S = "Thanh Ha Nguyen";
        String [] words = S.split(" ");
        for (String word : words){
            System.out.println(word);
        }
         */

        // The substring method
        /*
        String S = "codelearn";
        System.out.println(S.substring(0,4));
        System.out.println(S.substring(2,6));
        System.out.println(S.substring(4));
         */

        //Write a program that prints the position of the first occurrence of s2 in s1
        /*
        String S = Sc.next();
        String S1 =Sc.next();
        S= S.toLowerCase();
        S1 = S1.toLowerCase();
        System.out.println(S.indexOf(S1));
         */

        //
        /*
        String S = Sc.next();
        for (char c ='0'; c <= '9';c++){
            System.out.print(c);
        }
        for (char c = 'a'; c <= 'z'; c++){
            System.out.print(c);
        }
         */

        //Write a program that accepts a string s from the user and displays non-numeric characters in s on the screen.
        /*
        String S = Sc.next();
        for (char c ='0'; c<='9';c++){
            S = S.replace(c + "","");
        }
        System.out.println(S);
         */

        //Given a string s, write a program that accepts s from the user and prints uppercase characters in s on the screen.
        /*
        String S = Sc.next();
        int dem = 0;
        for (int i = 0 ; i < S.length(); i++){
            for (char C  = 'A'; C <= 'Z';C++){
                if (S.charAt(i) == C){
                    dem ++;
                }
            }
        }
        System.out.println(dem);
         */

        // options 2
        /*
        String S = Sc.next();
        int dem =0;
        for (int i = 0; i < S.length();i++){
            if(S.charAt(i) >= 'A' && S.charAt(i) <= 'Z'){
                dem++;
            }
        }
        System.out.println(dem);
         */

        //Write a program that accepts s from the user and reverses s. Display the reversed string on the screen.
        /*
        String s = Sc.next();
        String answer = "";
        for (int i = s.length() - 1 ; i >= 0; i --){
            answer+=s.charAt(i);
        }
        System.out.println(answer);
         */

    }
}
