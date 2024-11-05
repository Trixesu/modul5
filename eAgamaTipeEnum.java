package belajar.module5;

import java.util.Scanner;

public class eAgamaTipeEnum {
    enum Agama {
        HINDU, BUDDHA, YAHUDI, KATOLIK, KRISTEN, ISLAM
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Agama \t\t: ");
        String inputAgama = input.nextLine().toUpperCase();
        
        String kitabSuci = "";
        String nabi = "";
        
        try {
            Agama agama = Agama.valueOf(inputAgama);
        
            switch (agama) {
                case HINDU:
                    kitabSuci = "Veda";
                    break;
                case BUDDHA:
                    kitabSuci = "Tripitaka";
                    nabi = "Sidharta Gautama";
                    break;
                case YAHUDI:
                    kitabSuci = "Taurat";
                    nabi = "Musa";
                    break;
                case KATOLIK:
                    kitabSuci = "Injil";
                    nabi = "Yesus";
                    break;
                case KRISTEN:
                    kitabSuci = "Injil";
                    nabi = "Yesus";
                    break;
                case ISLAM:
                    kitabSuci = "Alquran";
                    nabi = "Muhammad";
                    break;
            }
        } catch (IllegalArgumentException e){
                System.out.println("Agama tidak valid");
                input.close();
                    return;
        }
        System.out.println("Kitab Suci \t: "+kitabSuci);
        System.out.println("Nabi \t\t: "+nabi);
        input.close();
    }
}
