package org.example;

import java.util.Scanner;

public class StringEx {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);

        //The length method
        /*
        String S = Sc.next();
        System.out.print(S.length());
         */

        //The CharAt method
        /*
        String S = Sc.next();
        int k = Sc.nextInt();
        System.out.print(S.charAt(k-1));
        */

        // loop
        /*
        String S = Sc.next();
        for (int i = 0; i < S.length(); i++){
            System.out.println(S.charAt(i));
        }
         */

        // The replace method
        /*
        String S = "Codel3arn";
        String S1 = "Baclr";
        System.out.println(S.replace('3','e'));
        System.out.println(S1.replace('r','k'));
         */

        //The toUpperCase/toLowerCase
        /*
        String S = "CodeLeaRN";
        System.out.println(S.toUpperCase());
        System.out.println(S.toLowerCase());
         */

        //The indexOf method
        /*
        String S = "ThanhHa";
        System.out.println(S.indexOf("Ha"));
        System.out.println(S.indexOf("la"));
         */

        // The startsWith and endsWith
        /*
        String S = "ThanhHaDepTrai";
        System.out.println(S.startsWith("th"));
        System.out.println(S.startsWith("da"));
        System.out.println(S.endsWith("ai"));
        System.out.println(S.endsWith("az"));
         */

        // The split method
        /*
        String S = "Thanh Ha Dep Trai";
        String[] Ha = S.split(" ");
        for (String ha: Ha){
            System.out.println(ha);
        }
         */

        // The substring method
        /*
        String S = " ThanhHaNguyen";
        System.out.println(S.substring(0,4));
        System.out.println(S.substring(1 ,6));
        System.out.println(S.substring(3));
         */
    }
}
