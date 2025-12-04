package bai_05_methods_in_java.practice;

import java.util.Scanner;

public class BaiTap01 {
    /*
            # Bài tập 1: Câu lệnh điều kiện và rẽ nhánh
            > **Đề bài:**
            > Bài tập chương câu lệnh điều kiện và rẽ nhánh: <br>
            > a. Viết phương thức đổi một ký tự hoa sang ký tự thường <br>
            > b. Viết phương thức giải phương trình bậc nhất <br>
            > c. Viết phương thức giải phương trình bậc hai <br>
            > d. Viết phương thức trả về giá trị nhỏ nhất của 4 số nguyên
            ### Hướng dẫn các bước thực hiện

* a. Viết phương thức đổi một ký tự hoa sang ký tự thường
  * Tên phương thức: `toLowerCase`
  * Kiểu trả về: `char` (Trả về ký tự đã chuyển thành ký tự thường)
  * Tham số: Một tham số kiểu `char` (Nhận vào ký tự muốn chuyển thành chữ thường)
* b. Viết phương thức giải phương trình bậc nhất
  * Tên phương thức: `levelOne`
  * Kiểu trả về: `void` (in trực tiếp ở trong phương thức nên không cần trả về dữ liệu)
  * Tham số: Hai tham số kiểu `double` tương ứng với hai hệ số của phương trình bậc nhất
* c. Viết phương thức giải phương trình bậc hai
  * Tên phương thức: `levelTwo`
  * Kiểu trả về: `void` (in trực tiếp ở trong phương thức nên không cần trả về dữ liệu)
  * Tham số: Ba tham số kiểu `double` tương ứng với ba hệ số của phương trình bậc hai
* d. Viết phương thức trả về giá trị nhỏ nhất của 4 số nguyên
  * Tên phương thức: `min`
  * Kiểu trả về: `int` (Trả về giá trị nhỏ nhất của 4 số nguyên)
  * Tham số: Bốn tham số kiểu `int` để nhận vào bốn số kiểu `int`

     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.print("Nhap vao ky tu: ");
//        char kiTu = sc.next().charAt(0);
//        toLowerCase(kiTu);

//        System.out.println("Nhap x: ");
//        double x = sc.nextDouble();
//        System.out.println("Nhap y: ");
//        double y = sc.nextDouble();
//        System.out.println("Nhap z: ");
//        double z = sc.nextDouble();
//        levelOne(x,y);
//        levelTwo(x,y,z);

        System.out.println("Nhap day so co 4 so nguyen: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int e = sc.nextInt();

        int findMin1 = min(x,y);
        int findMin2 = min(findMin1,z);
        findMin2 = min(findMin2, e);


        System.out.println("Ket qua so nho nhat trong 4 so: " + findMin2);



    }

    public static char toLowerCase(char kt) {
        if ((kt >= 'A' && kt <= 'Z') || (kt >= 'a' && kt <= 'z')) {
            if (kt < 'a'){
                kt += 32;
            } else {
                kt -= 32;
            }
            System.out.println("Ky tu sau khi chuyen doi: " + kt);
        }else {
            System.out.println("Ban nhap sai ki tu!");
        }
        return kt;
    }

    public static void levelOne(double a, double b){
        if (a == 0){
            if( b == 0 ){
                System.out.println("Phuong trinh vo so nghiem");
            }else{
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = - b / a;
            System.out.println("Nghiem cua phuong trinh khi a != b : " + x);
        }
    }

    public static void levelTwo(double a, double b, double c){
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            }else {
                double x =  - c / b;
                System.out.println("Nghiem cua phuong trinh bac mot : " + x);
            }
        } else {
            double delta = Math.pow(b,2) - 4 * a * c;
            System.out.println("Delta = " + delta);
            if(delta < 0){
                System.out.println("Pt vo nghiem");
            } else if (delta == 0) {
                double x = -b / (2*a);
                System.out.println("Pt co nghiem kep la x1 = x2 = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta) / (2*a));
                double x2 = (-b - Math.sqrt(delta) / (2*a));

                System.out.println("Nghiem cua x1 = " + x1);
                System.out.println("Nghiem cua x2 = " + x2);
            }
        }
    }

    public static int min(int a, int b){
        if (a > b){
            return b;
        } else {
            return a;
        }
    }






}
