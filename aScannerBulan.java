package belajar.module5;

import java.util.Scanner;

public class aScannerBulan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Angka Bulan (1-12) : ");
        int month = input.nextInt();
        String monthString;
        
        switch (month) {
            case 1:  monthString = "Januari";
                     break;
            case 2:  monthString = "Februari";
                     break;
            case 3:  monthString = "Maret";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "Mei";
                     break;
            case 6:  monthString = "Juni";
                     break;
            case 7:  monthString = "Juli";
                     break;
            case 8:  monthString = "Agustus";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "Oktober";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "Desember";
                     break;
            default: monthString = "Bulan invalid";
                     break;
        }
        input.close();
        System.out.println(monthString);
    }
}
