package bai_02_bien;

public class Oprerator {
    public static void main(String[] args) {
            int a = 5;
            int b = 3;

            int sum = a + b;

        System.out.println("Tong: " + sum);
        System.out.println("Hieu :" + (a-b));
        System.out.println("Tich :" + (a*b));
        System.out.println("Thuong :" + ((double) a / b));
        System.out.println("Chia lay du : " + (a % b));

        // ====Toan tu gan ====
        int c = 100;

        // tang c len 10 don vi
//        c = c + 10;
        // hoac
        c += 10;
        System.out.println("C = " + c);

        // === Toán tử tăng / giảm ===
        // toán tử ++ : tăng 1 đơn vị
        // toán tử -- : trừ 1 đơn vị

        // Cách sử dụng toán tử ++ và -- được chia thành 2 loại
        // 1. Hậu tố : Được kí hiệu là "++" hoặc "--" đặt sau biến
            //Ý nghĩa : Thực hiện biểu thức gán trước
//                => giá trị biến thay đổi
//        2. Tiền tố : Được kí hiệu là "++" hoặc "--" đặt trước biến
            //Ý nghĩa : Gía trị thay đổi trước
//                => thực hiện biểu thức gán


        int k = 2; // k = 3
        int l = ++k + k++
                ; // l =  k++ = 2 + ++k =3 => l =5


        System.out.println("k=" + k);
        System.out.println("l=" + l);

        int p = 2; // p = 2  p = 2
        int q = p++ + p--; // q =3   p-- = 2, p ++ = 1


        System.out.println("q=" + q);
        System.out.println("p=" + p);
    }
}
