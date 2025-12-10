package bai_06_debug_string.practice;

public class Bai02 {
    public static void main(String[] args) {
//        > Thực hiện các việc chuyển đổi sau:
//                > a. Chuyển đổi `String` thành `int`
        String s = "19";
        int Tong = Integer.parseInt(s);
        System.out.println("Tong: " + (Tong + 10));
//                > b. Chuyển đổi `int` thành `String`
        int a = 10;
        String chuoi = String.valueOf(a);
        System.out.println("5 + 5 = " + chuoi);
//                > c. Chuyển đổi `String` thành `long`
        long b = 20;
        long l = Long.parseLong(s);
        System.out.println("Long: " + (l + 20));
//                > d. Chuyển đổi `long` thành `String`
        String chuoil = String.valueOf(b);
        System.out.println("Chuoi " + chuoil);
//                > e. Chuyển đổi `String` thành `float`
        float f = Float.parseFloat(s);
        System.out.println("Float: " + (f + 2.0f));
//                > f. Chuyển đổi `float` thành `String`
        float myFloat = 12.5f;
        String chuoiFloat = String.valueOf(myFloat);
        System.out.println("Chuoi tu float: " + chuoiFloat);
//                > g. Chuyển đổi `String` thành `double`
        double d = Double.parseDouble(s);
        System.out.println("Double: " + (d + 1.1));
//                > h. Chuyển đổi `double` thành `String`
        double myDouble = 3.14159; // Khai báo một số double mẫu
        String chuoiDouble = String.valueOf(myDouble);
        System.out.println("Chuoi tu double: " + chuoiDouble);
//                > i. Chuyển đổi `String` thành `short`
        short sh = Short.parseShort(s);
        System.out.println("Short : " + (sh + 1));
//                > k. Chuyển đổi `short` thành `String`
        short myShort = 100;
        String chuoiShort = String.valueOf(myShort);
        System.out.println("Chuoi tu short: " + chuoiShort);
    }
}
