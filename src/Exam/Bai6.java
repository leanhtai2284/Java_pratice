package Exam;

import java.util.Arrays;

public class Bai6 {
    public static void main(String[] args) {
        int[] arr = {12, 2, 8, 5, 1, 6, 4, 15};
        interchangeSortDesc(arr);
        System.out.println("Ket qua sau khi in: " + Arrays.toString(arr));

    }

    public static void interchangeSortDesc(int[] a){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                if (a[i] < a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
    }
}