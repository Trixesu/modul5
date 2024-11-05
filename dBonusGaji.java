package belajar.module5;

import java.util.Scanner;

public class dBonusGaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Gaji pokok : ");
        double gajiPokok = input.nextDouble();     
        
        System.out.print("Golongan (1, 2, 3, 4) : ");
        int golongan = input.nextInt();
        
        System.out.print("Masa kerja : ");
        int masaKerja = input.nextInt();
        
        double persenBonus = 0;
        
        switch (golongan) {
            case 1:
                if (masaKerja <= 10) {
                    persenBonus = 0.5;
                } else if (masaKerja <= 20) {
                    persenBonus = 0.6;
                } else if (masaKerja <= 30) {
                    persenBonus = 0.7;
                }   break;
            case 2:
                if (masaKerja <= 10) {
                    persenBonus = 0.6;
                } else if (masaKerja <= 20) {
                    persenBonus = 0.7;
                } else if (masaKerja <= 30) {
                    persenBonus = 0.8;
                }   break;
            case 3:
                if (masaKerja <= 10) {
                    persenBonus = 0.7;
                } else if (masaKerja <= 20) {
                    persenBonus = 0.8;
                } else if (masaKerja <= 30) {
                    persenBonus = 0.9;
                }   break;
            case 4:
                if (masaKerja <= 10) {
                    persenBonus = 0.8;
                } else if (masaKerja <= 20) {
                    persenBonus = 0.9;
                } else if (masaKerja <= 30) {
                    persenBonus = 1.00;
                }   break;
            default:
                System.out.println("Golongan tidak valid");
                break;
        }
        
        double bonus = gajiPokok * persenBonus;
        System.out.println("Besaran bonus akhir tahun : Rp "+bonus);
        input.close();
    }
}
