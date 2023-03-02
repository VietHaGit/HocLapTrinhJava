package DSAA.SomeConceptsAboutAlgorithms;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Bai5 {

    public static int moneyChange(int[] arr, int n,int x){
        int[] l = new int[100001];
        for (int i = 0; i <=x;i++)
            l[i] =0;

        for (int i =0; i< n; i++)
            l[arr[i]] =1;
        for (int i =1; i<=x; i++)
            for (int j = 0; j<n; j++)
                if(i > arr[j]){
                if ((l[i]>l[i-arr[j]] +1 && l[i-arr[j]] !=0)||(l[i] ==0  && l[i-arr[j]] !=0)){
                    l[i] = l[i-arr[j] +1];
                }
            }
        return l[x];
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int[] arr = new int[100001];
        for (int i =0; i<n; i++){
            arr[i]=Sc.nextInt();
        }
        int x = Sc.nextInt();
        System.out.print(moneyChange(arr,n,x));
    }
}
