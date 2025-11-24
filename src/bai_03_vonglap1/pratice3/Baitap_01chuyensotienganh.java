package bai_03_vonglap1.pratice3;

import java.util.Scanner;

public class Baitap_01chuyensotienganh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so: ");
        int so = sc.nextInt();


//      Cach 1:
//        if(so == 1){
//            System.out.println("Chu A");
//        } else if (so == 2) {
//            System.out.println("Chu B");
//        }else if (so == 3) {
//            System.out.println("Chu C");
//        }else if (so == 4) {
//            System.out.println("Chu D");
//        }else if (so == 5) {
//            System.out.println("Chu F");
//        }else if (so == 6) {
//            System.out.println("Chu E");
//        }else if (so == 7) {
//            System.out.println("Chu H");
//        }else if (so == 8) {
//            System.out.println("Chu M");
//        }else if (so == 9) {
//            System.out.println("Chu N");
//        }else if (so == 10){
//            System.out.println("Chu hello");
//        } else {
//            System.out.println("Nhap sai so");
//        }

//      Cach 2 : switch case
        switch (so) {
            case 1 :
                System.out.println("Chu A");
                break;
            case 2 :
                System.out.println("Chu B");
                break;
            case 3 :
                System.out.println("Chu C");
                break;
            case 4 :
                System.out.println("Chu D");
                break;
            case 5 :
                System.out.println("Chu F");
                break;
            case 6 :
                System.out.println("Chu E");
                break;
            case 7 :
                System.out.println("Chu H");
                break;
            case 8 :
                System.out.println("Chu M");
                break;
            case 9 :
                System.out.println("Chu N");
                break;
            case 10 :
                System.out.println("Chu hello");
                break;
            default:
        }

    }


}
