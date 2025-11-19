package bai_02_bien;

public class KhaiBaoBien {
    public static void main(String[] args) {
        byte b; // 1 byte = 8 bit = 2^8 = 256 => miền giá trị [-128:127]

        int y;
        y = 2000000000;

        long l;
//       l = 20000000000000000l;
        long l2 = Long.MAX_VALUE;
        System.out.println("L2 : " + l2);

        String  name = "hello";
        System.out.println("lenth :" + name.length());

    }
}
