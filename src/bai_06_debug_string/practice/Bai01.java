package bai_06_debug_string.practice;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        String str = " Hello World ";
        // Lấy ra chữ World
        System.out.println("lay ra chu " + str.substring(6, 12));
        // Thay o thành f
        System.out.println("thay the 0 thanh f: " + str.replace('o', 'f'));
        //  Đếm xem có bao nhiêu chữ l
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'l') {
                count++;
            }
        }
        System.out.println("Chu l xuat hien trong chuoi " + count + " lan");
        // Cho biết vị trí xuất hiện đầu tiên và cuối cùng của chữ l
        System.out.println("Vi tri xuat hien dau tien cua chu l la " + str.indexOf('l') + " va vi tri xuat hien cuoi la " + str.lastIndexOf('l'));
        // Xóa hết space giữa chừng, đầu tiên và cuối cùng
        System.out.println("Xoa het space giua chung, dau tien va cuoi cung:" + str.replaceAll((" "), ("")));
        // Xóa hết space đầu tiên và cuối cùng (không được xóa space giữa chừng)
        System.out.println("Xoa het space dau tien va cuoi cung: " + str.trim());
        // Đảo chuỗi thành dlroW olleH
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        sb.reverse();
        str = sb.toString();
        System.out.println("Chuoi Hello World sau khi dao: " + str);
        // Cho chuỗi "SQC". Hãy tạo thành chuỗi "SQC Hello World"
        String s = "SQC";
        System.out.println("Chuoi moi: " + s.concat(" Hello World"));
        // Đổi toàn bộ kí tự của S sang chữ Hoa
        String s1 = "sssOOssHeslo";
        System.out.println("Đổi toàn bộ kí tự của S sang chữ Hoa: " + s1.toUpperCase());
        //  Đổi toàn bộ kí tự của S sang chữ thường
        String s2 = "SSSOSSSYSTEM";
        System.out.println("Đổi toàn bộ kí tự của S sang chữ Hoa: " + s2.toLowerCase());
        //  Trích ra chuỗi con của S từ kí tự thứ n đến thứ m của S (n, m nhập từ bàn phím)
        String s3 = "Sosmnhello";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        System.out.println("Nhap m: ");
        int m = sc.nextInt();
        System.out.println("chuỗi con của S từ kí tự thứ " + n + " đến thứ " + m + " của S: " + s3.substring(n, m));

    }
}
