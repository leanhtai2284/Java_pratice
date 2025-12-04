package bai_06_debug_string.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Bai05 {
    public static void main(String[] args) {
        //    # Bài tập 5: Chuyển đổi và thao tác với kiểu dữ liệu ngày tháng

//
//> **Đề bài:**
//> * a. Chuyển chuỗi "02/28/2025" sang kiểu `LocalDate`
        String s = "02/28/2025";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.parse(s,formatter);
        System.out.println(localDate);
//> * b. Chuyển ngày hiện tại (của hệ thống) đang ở kiểu `LocalDate` sang kiểu `String` theo định dạng `dd/MM/yyyy` và hiển thị ra màn hình
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String strDate = LocalDate.now().format(formatter1);
        System.out.println(strDate);
//> * c. Lấy ngày, tháng, năm, giờ, phút, giây hiện tại của hệ thống
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
//> * d. Hãy cho biết cách đây 1000 ngày (tính từ ngày hiện tại) là ngày tháng năm nào?
        LocalDate localDate1 = LocalDate.now().minusDays(1000);
        System.out.println(localDate1);
//> * e. Hãy nhập vào 1 `String` có định dạng là `dd/MM/yyyy`. Sau đó, nhập vào số tự nhiên `n`. Hãy in ra ngày đứng sau ngày đã nhập `n` ngày
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        String str = sc.next();
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate2 = LocalDate.parse(str,formatter2).plusDays(n);
        System.out.println(localDate2);
    }


}
