package bai_07_mang1chieu.practice;

import java.util.Scanner;

public class Bai01TN {
    static Scanner sc = new Scanner(System.in);

    public static void inputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Nhap phan tu array[%d]: ", i);
            array[i] = sc.nextInt();
        }
    }

    public static void outputArray(int[] array) {
        for (int j : array) { // for truyen thong co the thay the = for-each: duyet qua tung phan tu trong mang
            System.out.print(j + " ");
        }
    }

    // 2a
    public static boolean isALLEven(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) return false;
        }
        return true;
    }

    //2b
    static boolean isPrimeNumberArr(int number) {
        if (number < 2) return false;
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        return count == 2;
    }

    public static boolean isPrimeNumberArr(int[] array) {
        for (int j : array) {
            if (!isPrimeNumberArr(j)) {
                return false;
            }
        }
        return true;
    }

    //2c
    public static boolean isAllUp(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //3a
    public static int countOddElements(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    //3b
    public static int sumPositiveOdd(int[] array) {
        int sum = 0;
        for (int j : array) {
            if (j % 2 != 0) {
                sum += j;
            }
        }
        return sum;
    }

    //3c
    public static int countDivisibleBy4NotBy5(int[] array) {
        int count = 0;
        for (int j : array) {
            if (j % 4 == 0 && j % 5 != 0) {
                count++;
            }
        }
        return count;
    }

    //3d
    public static int sumPrimes(int[] array) {
        int sum = 0;
        for (int j : array) {
            if (isPrimeNumberArr(j)) {
                sum += j;
            }
        }
        return sum;
    }

    //4a
    public static int lastIndex(int[] array, int x) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }

    //4b
    public static int firstPrimeIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isPrimeNumberArr(array[i])) {
                return i;
            }
        }
        return -1;
    }

    //4c
    public static int findMinPositive(int[] array) {
        int minPositive = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] < minPositive) {
                minPositive = array[i];
            }
        }
        return minPositive;
    }

    //4d
    public static String findK(int[] array, int k) {
        String ketQua = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k) {
                ketQua = ketQua + i + " ";
            }
        }
        return ketQua;
    }

    //4e
    public static int findMind(int[] array) {
        int min1 = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min1) {
                min1 = array[i];
            }
        }
        return min1;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhap so luong phan tu n cua mang: ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("Xin vui long nhhap lai");
            }
        } while (n < 1);
        int[] arr = new int[n];
        inputArray(arr);
        System.out.println("Mang da nhap: ");
        outputArray(arr);
        if (isALLEven(arr)) {
            System.out.println("\nMang toan chan");
        } else {
            System.out.println("\nMang khong toan chan");
        }

        //2b
        if (isPrimeNumberArr(arr)) {
            System.out.println("Mang toan so nguyen to");
        } else {
            System.out.println("Mang khong toan so nguyen to");
        }

        //2c
        if (isAllUp(arr)) {
            System.out.println("Mang tang dan");
        } else {
            System.out.println("Mang ko tang dan");
        }
        //3a
        System.out.println("Co bao nhieu phan tu le trong mang: " + countOddElements(arr));
        //3b
        int sumPositive = sumPositiveOdd(arr);
        System.out.println("Tong so duong le: " + sumPositive);
        //3c
        System.out.println("Co " + countDivisibleBy4NotBy5(arr) + " so chia het cho 4 nhung khong chia het cho 5");
        //3d
        int sumPrime = sumPrimes(arr);
        System.out.println("Tong so nguyen to: " + sumPrime);
        //4a
        int x;
        System.out.print("Nhap vao so can tim trong mang: ");
        x = sc.nextInt();
        int lastIndexx = lastIndex(arr, x);
        if (lastIndexx == -1) {
            System.out.println("\nKhong tim thay phan tu do trong mang!!");
        } else {
            System.out.printf("\nVi tri %d cuoi cung xuat hien tai array[%d]", x, lastIndexx);
        }
        //4b
        int findPrime = firstPrimeIndex(arr);
        if (findPrime == -1) {
            System.out.println("\nKhong tim thay so nguyen to trong mang!!");
        } else {
            System.out.printf("\nSo nguyen to dau tien la %d xuat hien tai vi tri array[%d]", arr[findPrime], findPrime);
        }
        //4c
        System.out.println("\nVi tri nho nhat trong mang: "+findMinPositive(arr));
        //4d
        int k;
        System.out.print("Nhap k: ");
        k = sc.nextInt();
        String index = findK(arr, k);
        if (index.length() == 0) {
            System.out.println("khong tim thay vi tri k xuat hien trong mang");
        } else {
            System.out.println("Vi tri " + k + " xuat hien tai vi tri " + index);
        }
        //4e
        int findMin = findMind(arr);
        int findMax = findMax(arr);
        System.out.println("Vi tri nho nhat la " + findMin + " va " + "vi tri lon nhat la " + findMax + " co trong mang");

    }

}

