package com.hesapmakinesi;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        System.out.println("Hesap Makinesi");
        int a , b  , select;

        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci Sayiyi Giriniz : ");
        a = sc.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz : ");
        b = sc.nextInt();
        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Lutfen islem yapmak icin Secim yapiniz : ");
        select = sc.nextInt();


      switch (select) {
          case 1 :
              System.out.println("Sonuc :" + (a+b) ) ;
              break;
          case 2 :
              System.out.println("Sonuc :" + (a-b) ) ;
             break;
          case 3 :
              System.out.println("Sonuc :" + (a*b) ) ;
              break;
          case 4:
              if (b == 0) {
                  System.out.println("Bir Sayi 0 a bolunmez");
              } else {
                  System.out.println("Sonuc " + (a / b));
              }
              break;
          default:
              System.out.println("Seçiminiz Hatalıdır");
      }




    }
}
