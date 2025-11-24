package bai_03_vonglap1.pratice3;

import java.util.Scanner;

public class Baitap_06Tinhnamnhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao thang :");
        int month = sc.nextInt();
        System.out.println("Nhap vao nam :");
        int year = sc.nextInt();
        int dayInMonth;

        switch (month){
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = 30;
                break;
            case 2 :
                if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 )){
                    dayInMonth = 29;
                } else {
                    dayInMonth = 28;
                }
                break;
            default:
                dayInMonth = 31;
                break;
        }
        System.out.printf("So ngay trong thang %d nam %d la %d ngay" , month , year , dayInMonth);
    }
}
