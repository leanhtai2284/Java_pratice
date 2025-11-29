package bai_05_methods_in_java.practice;

import java.util.Scanner;

public class BaiTap03 {
    /*
        # Bài tập 3: Bài tập chương câu lệnh lặp #2

> **Đề bài:**
> Bài tập chương Câu lệnh lặp. Phương thức nhận vào một số nguyên dương n và thực hiện: <br>
> a. `S = 1 + 2 + ... + n` <br>
> b. `S = 1^2 + 2^2 + ... + n^2` <br>
> c. `S = 1 + 1/2 + … + 1/n` <br>
> d. `S = 1 * 2 * … * n` <br>
> e. `S = 1! + 2! + … + n!` <br>

> **Yêu cầu**:
> * Đừng in ra kết quả ngay trong phương thức tính toán, mà nên trả về kết quả đó và sử dụng phương thức main để in ra kết quả. Điều này giúp tái sử dụng code một cách hiệu quả hơn

### Hướng dẫn các bước thực hiện

* a. `S = 1 + 2 + ... + n`
  * Viết phương thức nhận vào một số nguyên dương `n`, sau đó sử dụng một vòng lặp for từ 1 đến `n` để tính tổng
  * Phương thức này sẽ trả về tổng
* b. `S = 1^2 + 2^2 + ... + n^2`
  * Tương tự như trên, nhưng trước khi cộng mỗi giá trị vào tổng, hãy bình phương nó
  * Phương thức sẽ trả về tổng các số bình phương
* c. `S = 1 + 1/2 + ... + 1/n`
  * Viết phương thức nhận vào một số nguyên dương `n`, sau đó sử dụng một vòng lặp `for` từ 1 đến `n` để tính tổng nghịch đảo của các số từ 1 đến `n`
  * Phương thức này sẽ trả về tổng
* d. `S = 1 * 2 * ... * n`
  * Viết phương thức nhận vào một số nguyên dương `n`, sau đó sử dụng một vòng lặp `for` từ 1 đến n để tính tích của các số từ 1 đến `n`
  * Phương thức này sẽ trả về tích
* e. `S = 1! + 2! + ... + n!`
  * Viết phương thức khác nhận vào một số nguyên dương `n`, sử dụng một vòng lặp `for` từ 1 đến `n` để tính tổng giai thừa của các số từ 1 đến `n`
  * Phương thức này sẽ trả về tổng

     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int tongSND = tinhTongSoNguyenDuong(n);
        System.out.println("Tong so nguyen duong: " + tongSND);
        int tongBinhPhuong = tinhTongSoBinhPhuong(n);
        System.out.println("Tong so binh phuong: " + tongBinhPhuong);
        double tongTuMau = tinhTongTuMau(n);
        System.out.println("Tong phep tinh 1 + 1/2 +...1/n: " + tongTuMau);
        int tich = tinhTichSND(n);
        System.out.println("Tich so nguyen duong: " + tich);
        long ketQuaGiaiThua = tinhGiaiThua(n);
        System.out.println("Tong cua giai thua: " + ketQuaGiaiThua);
    }

    public static int tinhTongSoNguyenDuong(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int tinhTongSoBinhPhuong(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    public static double tinhTongTuMau(double n) {
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static int tinhTichSND(int n) {
        int sum = 1;

        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    public static long tinhGiaiThua(int n) {
        long sum = 0;
        long giaiThua = 1;

        for (int i = 1; i <= n; i++) {
            giaiThua = giaiThua * i;
            sum += giaiThua;
        }
        return sum;
    }
}
