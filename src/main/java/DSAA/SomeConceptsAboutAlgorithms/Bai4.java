package DSAA.SomeConceptsAboutAlgorithms;

import java.util.Scanner;

public class Bai4 {
    public static void display(int[] arr, int l, int r){
        for (int i = l; i <=r; i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int[] arr = new int[100001];
        int[] l = new int[100001];
        for (int i = 0; i < n; i++){
            arr[i] = Sc.nextInt();
        }
        l[0] = 1;
        for (int i = 1 ; i< n; i++){
            if (arr[i] >= arr[i-1]){
                l[i] = l[i-1] +1;
            }
            else {
                l[i] =1;
            }
        }
        int csMax = 0;
        for (int i = 0; i < n; i++){
            if (l[csMax] < l[i]){
                csMax = l[i];
            }
        }
        display(arr,csMax - l[csMax] +1,csMax);
    }
}
