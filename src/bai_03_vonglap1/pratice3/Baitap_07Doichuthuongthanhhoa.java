package bai_03_vonglap1.pratice3;

import java.util.Scanner;

public class Baitap_07Doichuthuongthanhhoa {
    public static void main(String[] args) {
      Scanner  sc = new Scanner(System.in);

        System.out.println("Nhap 1 ky tu chu cai: ");
        char character = sc.next().charAt(0);


        if((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')){
            if(character >= 'A' ){
                character += 32;
            }else {
                character -= 32;
            }
            System.out.println("ky tu sau khi da doi: " + character);
        }else {
            System.out.println("Ban da nhap sai ki tu");

        }
    }
}
