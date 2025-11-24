package bai_02_bien;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        System.out.println("Nhap tuoi cua ban :");
        int age = sc.nextInt();
        System.out.println("Nhap ten cua ban :");
        String name = sc.next();

        System.out.println("Tuoi cua ban :" + age);
        System.out.println("Ten cua ban :" + name);

    }
}
