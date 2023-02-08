package DSAA.SortAlgorithm;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

//Bubble Sort
public class Bai1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int[] arr = new int[n];
//        Cach1: su dung phuong thuc sort trong LinkedList
        /*
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0;i<n; i++){
            list.add(Sc.nextInt());
        }
        Collections.sort(list);
        System.out.print(list+ " ");
         */
//        cach2: su dung thuat toan sap xep noi bot: so sanh giua 2 phan tu gan nhat sau do doi cho 2 phan tu cho nhau
        for (int i =0; i< n; i++){
            arr[i] = Sc.nextInt();
        }

        for (int i =0; i<n;i++){
            for (int j = i+1;j<n;j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        for (int i =0; i <n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
