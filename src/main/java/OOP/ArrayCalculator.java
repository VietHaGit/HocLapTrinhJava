package OOP;

public class ArrayCalculator {
/*
    public static int sumOfArray(int[] arr ){
        int Sum = 0;
        for (int i = 0 ; i < arr.length; i ++){
            Sum += arr[i];
        }
        return Sum;
    }

    public static double sumOfArray(double[] arr ){
        double sum = 0;
        for (int i = 0 ; i < arr.length; i ++) {
            sum += arr[i];
        }
        return sum;
    }
}
class Run2{
    public static void main(String[] args) {
        int[] arr1 = new int[]{3, 4, 2};
        double[] arr2 = new double[]{1.3, 4.2, 6.7};
        System.out.println(ArrayCalculator.sumOfArray(arr1));
        System.out.println(ArrayCalculator.sumOfArray(arr2));
    }
 */
    public static int maxOfArray(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i ++){
            if (arr[i]> max ){
                max = arr[i];
            }
        }
        return max;
    }

    public static double maxOfArray(double[] arr){
        double max = arr[0];
        for (int i = 1; i < arr.length; i ++){
            if (arr[i]> max ){
                max = arr[i];
            }
        }
        return max;
    }

    public static int minOfArray(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i ++){
            if (arr[i]< max ){
                max = arr[i];
            }
        }
        return max;
    }

    public static double minOfArray(double[] arr){
        double max = arr[0];
        for (int i = 1; i < arr.length; i ++){
            if (arr[i] < max ){
                max = arr[i];
            }
        }
        return max;
    }
}

class Run2{
    public static void main(String[] args){
        int[] arr1 = new int[]{3 ,4, 2};
        double[] arr2 = new double[] {1.3,4.2,6.7};
        System.out.println(ArrayCalculator.maxOfArray(arr1));
        System.out.println(ArrayCalculator.maxOfArray(arr2));
        System.out.println(ArrayCalculator.minOfArray(arr1));
        System.out.println(ArrayCalculator.minOfArray(arr2));

    }
}
