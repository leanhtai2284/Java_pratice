package bai_06_debug_string.practice;

import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi a: ");
        String a = sc.next();
        System.out.println("Nhap chuoi b: ");
        String b = sc.next();

        if (a.compareTo(b)==0){
            System.out.println("a = b");
        } else if (a.compareTo(b) < 0) {
            System.out.println("a < b");
        } else {
            System.out.println("a > b");
        }

    }
}
