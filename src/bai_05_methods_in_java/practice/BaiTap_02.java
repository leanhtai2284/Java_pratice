package bai_05_methods_in_java.practice;

import java.util.Scanner;


/*
        # Bài tập 2: Bài tập chương câu lệnh lặp #1

> **Đề bài:**
> Bài tập chương Câu lệnh lặp. Phương thức nhận vào một số nguyên dương n và thực hiện: <br>
> a. Trả về số đảo của số đó <br>
> b. Có phải là số đối xứng (Trả về `True`/`False`) <br>
> c. Có phải là số chính phương <br>
> d. Có phải là số nguyên tố <br>
> e. Tổng các chữ số lẻ <br>
> f. Tổng các chữ số nguyên tố <br>
> g. Tổng các chữ số chính phương

### Hướng dẫn các bước thực hiện

* a. Trả về số đảo của số đó
  * Tên phương thức: `reversedNumber`
  * Kiểu trả về: `int` (Trả về số đảo)
  * Tham số: Một tham số kiểu `int` (Nhận vào số muốn đảo)
* b. Có phải là số đối xứng (Trả về `True`/`False`)
  * Tên phương thức: `isSymmetricalNumber`
  * Kiểu trả về: `boolean` (`true` là số đối xứng, `false` là số không đối xứng)
  * Tham số: Một tham số kiểu `int` (Nhận vào số muốn kiểm tra đối xứng)
* c. Có phải là số chính phương
  * Tên phương thức: `isSquareNumber`
  * Kiểu trả về: `boolean` (`true` là số chính phương, `false` là số không chính phương)
  * Tham số: Một tham số kiểu `int` (Nhận vào số muốn kiểm tra đối xứng)
* d. Có phải là số nguyên tố
  * Tên phương thức: `isPrimeNumber`
  * Kiểu trả về: `boolean`
  * Tham số: Một tham số kiểu `int`
* e. Tổng các chữ số lẻ
  * Tên phương thức: `calculateTotalOddDigits`
  * Kiểu trả về: `int` (Tổng các chữ số lẻ)
  * Tham số: Một tham số kiểu `int` (Số muốn tính tổng các chữ số lẻ)
* f. Tổng các chữ số nguyên tố
  * Tên phương thức: `calculateTotalPrimeDigits`
  * Kiểu trả về: `int` (Tổng các chữ số nguyên tố)
  * Tham số: Một tham số kiểu `int` (Số muốn tính tổng các chữ số nguyên tố)
* g. Tổng các chữ số chính phương
  * Tên phương thức: `calculateTotalSquareDigits`
  * Kiểu trả về: `int` (Tổng các chữ số chính phương)
  * Tham số: Một tham số kiểu `int` (Số muốn tính tổng các chữ số chính phương)

 */
public class BaiTap_02 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap vao day so: ");
        int n = sc.nextInt();
        System.out.println("Ket qua sau khi dao: " + reversedNumber(n));
        System.out.println(isSymmetricalNumber(n) ? "Day la so doi xung" : "Day khong phai so doi xung");
        System.out.println(isSquareNumber(n) ? "Day la so chinh phuong" : "Day khong phai so chinh phuong");
        System.out.println(isPrimeNumber(n) ? "Day la so nguyen so" : "Day khong phai so nguyen to");
        int tongLe = calculateTotalOddDigits(n);
        System.out.println("Tong cua cac so le: " + tongLe);
        int tongSNT = calculateTotalPrimeDigits(n);
        System.out.println("Tong cua cac so NT: "+ tongSNT);
        int tongCP= calculateTotalSquareDigits(n);
        System.out.println("Tong cua cac so NT: "+ tongCP);
    }

    public static int reversedNumber(int number) {
        int ketQua = 0;
        while (number != 0) {
            int kyTuCuoi = number % 10;
            ketQua = ketQua * 10 + kyTuCuoi;
            number /= 10;
        }
        return ketQua;
    }

    public static boolean isSymmetricalNumber(int n) {
        int kq = reversedNumber(n);
        return n == kq;
    }

    public static boolean isSquareNumber(int n) {
        double squareRoot = Math.sqrt(n);
        return squareRoot % 1 == 0;
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int calculateTotalOddDigits(int n) {
        int sum = 0;
        n = Math.abs(n);
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            n /= 10;
        }
        return sum;
    }

    public static  int calculateTotalPrimeDigits(int n){
        int sum = 0;
        n = Math.abs(n);

       while (n > 0){
           int SNT = n % 10;
           if (isPrimeNumber(SNT)){
               sum += SNT;
           }
           n /= 10;
       }
       return sum;
    }

    public static int calculateTotalSquareDigits(int n){
        int sum = 0;
        n = Math.abs(n);

        while (n > 0){
            int digit = n % 10;
            if (isSquareNumber(digit)){
                sum += digit;
            }
            n /= 10;
        }
        return sum  ;

    }


}
