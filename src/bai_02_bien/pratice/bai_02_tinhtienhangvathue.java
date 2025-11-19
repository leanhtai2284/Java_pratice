package bai_02_bien.pratice;

import java.util.Scanner;

public class bai_02_tinhtienhangvathue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ten san pham :");
        String nameSp = sc.nextLine();
        System.out.println("Nhap so luong :");
        int quantity = sc.nextInt();
        System.out.println("Nhap gia san pham :");
        float price = sc.nextFloat();

//        1. Tiền hàng (chưa bao gồm thuế)
        float  moneyProduct =  quantity * price;
//        2. Thuế giá trị gia tăng (VAT)
        double vat = price * 0.1;
//        3. Tổng tiền phải thanh toán
        double sum = price * vat;

        System.out.println("Tien hang = " + moneyProduct);
        System.out.println("Tien thue = " + vat);
        System.out.println("Tong tien thanh toan = " + sum);


    }
}
