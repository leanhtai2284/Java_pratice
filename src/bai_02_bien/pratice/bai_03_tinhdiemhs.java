package bai_02_bien.pratice;

import java.util.Scanner;

public class bai_03_tinhdiemhs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Nhập điểm
        System.out.println("Nhap diem toan :");
        int toan = sc.nextInt();
        System.out.println("Nhap diem ly :");
        int ly = sc.nextInt();
        System.out.println("Nhap diem hoa :");
        int hoa = sc.nextInt();

//        Nhập hệ số
        System.out.println("Nhap he so toan :");
        int hsToan = sc.nextInt();
        System.out.println("Nhap he so ly :");
        int hsLy = sc.nextInt();
        System.out.println("Nhap he so hoa :");
        int hsHoa = sc.nextInt();

//        tính điểm trung bình của học sinh + hệ số
        int trb = ((toan * hsToan + ly * hsLy + hoa * hsHoa) / 3);

        System.out.println("Diem mon toan :" + toan + " he so toan (" + hsToan + ")");
        System.out.println("Diem mon ly :" + ly + " he so ly (" + hsLy + ")");
        System.out.println("Diem mon hoa :" + hoa + " he so hoa (" + hsHoa + ")");
        System.out.println("Trung binh cong cua hoc sinh do :" + (double)trb);

    }
}
