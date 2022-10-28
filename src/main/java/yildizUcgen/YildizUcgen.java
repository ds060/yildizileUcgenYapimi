package yildizUcgen;

import java.util.Scanner;

public class YildizUcgen {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Piramitin yüksekliği kaç birim olsun?");
        int yukseklik=girdi.nextInt();

        int bosluk = 1;

        for (int i = 1; i <= yukseklik; i++) {
            for (int j = i; j <10; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= bosluk; k++) {
                if (k % 2 == 0)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
            bosluk = bosluk + 2;
        }
        }
    }

