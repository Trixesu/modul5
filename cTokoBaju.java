package modulv;

import java.util.Scanner;

public class cTokoBaju {
    public static void main(String[] args) {   
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ukuran baju (S, M, L, XL, XXL) : ");
        String ukuranBaju = input.nextLine();
        
        System.out.print("Jumlah baju : ");
        int jumlahBaju = input.nextInt();
        int harga = 0;
        
        switch (ukuranBaju) {
            case "S":
                harga = 30000;
                break;
            case "M":
                harga = 38000;
                break;
            case "L":
                harga = 45000;
                break;
            case "XL":
                harga = 50000;
                break;
            case "XXL":
                harga = 60000;
                break;
            default:
                System.out.println("Ukuran tidak valid");
                break;
        }
        
        int totalHarga = jumlahBaju * harga;
        System.out.println("Harga baju ukuran "+ukuranBaju+" : Rp "+harga);
        System.out.println("Total harga : Rp "+totalHarga);
        input.close();
    }
}