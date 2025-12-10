package Exam;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        String str = "TeChzen AcaDemy ";
        chuanHoa(str);

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.print("Nhap m: ");
        int m = sc.nextInt();
        trichXuatIndex(str,n,m);
    }
    public static void chuanHoa (String str){
        String trim = str.trim();
        System.out.println(trim.toLowerCase());
    }
    public static void trichXuatIndex (String str, int n, int m){
        String index = str.substring(n,m);
        System.out.println(index);
    }

}
