package belajar.module5;

import java.util.Scanner;

public class bJumlahHari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Bulan (1-12) : ");
        int bulan = input.nextInt();
        int jumlahHari = 0;
        String namaBulan = "";
        
        switch (bulan) {
            case 1:
                jumlahHari = 31;
                namaBulan = "Januari";
                break;
            case 2:
                jumlahHari = 28;
                namaBulan = "Februari";
                break;
            case 3:
                jumlahHari = 31;
                namaBulan = "Maret";
                break;
            case 4:
                jumlahHari = 30;
                namaBulan = "April";
                break;
            case 5:
                jumlahHari = 31;
                namaBulan = "Mei";
                break;
            case 6:
                jumlahHari = 30;
                namaBulan = "Juni";
                break;
            case 7:
                jumlahHari = 31;
                namaBulan = "Juli";
                break;
            case 8:
                jumlahHari = 31;
                namaBulan = "Agustus";
                break;
            case 9:
                jumlahHari = 30;
                namaBulan = "September";
                break;
            case 10:
                jumlahHari = 31;
                namaBulan = "Oktober";
                break;
            case 11:
                jumlahHari = 30;
                namaBulan = "November";
                break;
            case 12:
                jumlahHari = 31;
                namaBulan = "Desember";
                break;
            default:
                System.out.println("Bulan tidak valid");
                break;
        }
        System.out.println("Bulan "+namaBulan+" ada "+jumlahHari+" hari");
        input.close();
    }
}
