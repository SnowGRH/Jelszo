package com.mycompany.jelszomentes;

import java.util.Scanner;

public class Kezeles {

    Scanner sc = new Scanner(System.in);
    public Kezeles() {
        Ellenrőzés();
    }


    private int Bekeres() {
        System.out.print("\nKód megadása: ");
        int Ujkod = sc.nextInt();
        while (Integer.toString(Ujkod).length() < 4 || Integer.toString(Ujkod).length() > 6) {
            System.out.println("Kód 4 és 6 karakter között kell lenni : ");
            Ujkod = sc.nextInt();
        }
        System.out.println("Jelszó elmnetve");
        return Ujkod;

    }
    private void Ellenrőzés() {
        int kod = Bekeres();
        int i = 1;
        String txt = "Hibás pin kód!";
        System.out.printf("Kérem a belépési kódot(%s/3)", i);
        int Ekod = sc.nextInt();
        System.out.println(txt);
        while (Integer.toString(kod).length() != Integer.toString(Ekod).length() && 3 > i) {
            i++;
            System.out.printf("Kérem a belépési kódot(%s/3)", i);
            Ekod = sc.nextInt();
            if (Integer.toString(kod).length() != Integer.toString(Ekod).length()) {
                System.out.println(txt);
            }
            
        }
        if (i == 3) {
            System.out.println("Belépés megtagadva!");
        } else {
            System.out.println("Rendben, sikeres belépés!");
        }
    }
}
