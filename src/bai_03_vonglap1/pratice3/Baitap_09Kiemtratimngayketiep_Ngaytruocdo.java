package bai_03_vonglap1.pratice3;

import java.util.Scanner;

public class Baitap_09Kiemtratimngayketiep_Ngaytruocdo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ngay : ");
        int day = sc.nextInt();
        System.out.print("Nhap thang : ");
        int month = sc.nextInt();
        System.out.print("Nhap nam : ");
        int year = sc.nextInt();

        int dayInMonth = 0;
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dayInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                dayInMonth = 30;
                break;
            case 2:
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    dayInMonth = 29;
                } else {
                    dayInMonth = 28;
                }
                break;
            default:
                dayInMonth = 0;
        }

        if (day < 1 || day > dayInMonth || month < 1 || month > 12 || year < 1 ){
            System.out.println("Ngay thang nam khong hop le");
        } else {
            System.out.println("Ngay thang nam hop le");
        }

        int nextD = day;
        int nextM = month;
        int nextY = year;

        nextD++;
        if(day > dayInMonth){
            nextD = 1;
            nextM++;
            if (nextM > 12) {
                nextM = 1;
                nextY++;
            }
        }
        System.out.println("Ngay ke tiep : " + nextD + " / " + nextM + " / " + nextY );


        int preD = day;
        int preM = month;
        int preY = year;

        preD--;
        if(preD < 1){
            preM--;
            if(preM < 1){
                preM = 12;
                preY--;
            }
        }

        int daypre = 0;
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daypre = 31;
                break;
            case 4: case 6: case 9: case 11:
                daypre = 30;
                break;
            case 2:
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    daypre = 29;
                } else {
                    daypre = 28;
                }
                break;
        }
        preD = daypre;
        System.out.println("Ngay truoc do : " + preD + " / " + preM + " / " + preY);

    }

}

