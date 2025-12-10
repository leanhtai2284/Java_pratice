package bai_06_debug_string.practice;

public class Bai04 {
    public static void main(String[] args) {
//         **Đề bài:**
//  a. Cho chuỗi "Hello World"
//                   Lấy ra chữ World bằng cách dùng `StringBuffer` và `StringBuilder`
        String s = "Hello World";
        StringBuffer sb = new StringBuffer(s);
        String ketQuaCat = sb.substring(6, 11);
        System.out.println(ketQuaCat);
//  b. Cho chuỗi "Hello World"
//                   Thay o thành f bằng cách dùng `StringBuffer` và `StringBuilder`
        StringBuffer sb1 = new StringBuffer(s);
        for (int i = 0; i < sb1.length(); i++) {
            if (sb1.charAt(i) == 'o'){
                sb1.setCharAt(i,'f');
            }
        }
        System.out.println("StringBuilder ket qua: " + sb1);
//  c. Cho chuỗi "Hello" và chuỗi “World”
//                    Nối 2 chuỗi này bằng cách dùng `String`, `StringBuffer` và `StringBuilder`
        String s1 = " ";
        StringBuffer sb2 = new StringBuffer();
        sb2.append("Hello");
        System.out.println(sb2 + s1.concat("World2"));
    }
}
