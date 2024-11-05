package belajar.module5;

import java.util.Scanner;

public class aScannerBulan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Angka Bulan (1-12) : ");
        int bulan = input.nextInt();
        String bulanString;
        
        switch (bulan) {
            case 1:  bulanString = "Januari";
                     break;
            case 2:  bulanString = "Februari";
                     break;
            case 3:  bulanString = "Maret";
                     break;
            case 4:  bulanString = "April";
                     break;
            case 5:  bulanString = "Mei";
                     break;
            case 6:  bulanString = "Juni";
                     break;
            case 7:  bulanString = "Juli";
                     break;
            case 8:  bulanString = "Agustus";
                     break;
            case 9:  bulanString = "September";
                     break;
            case 10: bulanString = "Oktober";
                     break;
            case 11: bulanString = "November";
                     break;
            case 12: bulanString = "Desember";
                     break;
            default: bulanString = "Invalid month";
                     break;
        }
        System.out.println(bulanString);
    }
}
