package Exam;

public class Bai3 {
    public static void main(String[] args) {
//        int n = 6;
//        int m = 5;
//        for (int i = 1; i <= m ; i++){
//            for (int j = 1; j <= n; j++){
//                if (i == 1 || i == 5 || j == 1 || j == 6){
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
        int n = 4;
        int m = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 2 || j == 6 || j == 3 || j == 5 || j == 4 ){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                    System.out.print("* ");
//            }
            System.out.println();
        }
    }

}
