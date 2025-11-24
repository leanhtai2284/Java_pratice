package bai_03_vonglap1.lesson;

public class TernaryOperator {

//    Toán tử 3 ngôi cung cấp một cách ngắn gọn để viết một câu lệnh if-else

//    biến = <điều kiện> ? <biểu thức 1> : <biểu thức 2>  true thì trả về sau dấu ? fale trả sau dấu :

//    Tìm max của 2 số a ,b

    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int max =  a < b ?  b : a ;
//
//        if (a < b){
//            max = b;
//        } else {
//            max = a;
//        }
        System.out.println("Max :" + max);

    }
}
