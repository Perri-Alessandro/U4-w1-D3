package es_2.entities;

import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("INSERISCI UN NUMERO DI CELLULARE:");
        long numero = Long.parseLong(scan.nextLine());
        Sim uno = new Sim(numero);

        System.out.println("SIM CREATA: " + uno.toString());

        System.out.println("INSERISCI CREDITO");
        double credito = Double.parseDouble(scan.nextLine());
        uno.aggiungiCash(credito);

        Chiamata[] chiamate = new Chiamata[5];
        chiamate[0] = new Chiamata("+39 3494278805", 20);
        chiamate[1] = new Chiamata("+39 3494278805", 1);
        chiamate[2] = new Chiamata("+39 3494275405", 7);
        chiamate[3] = new Chiamata("+39 3494278876", 1);
        chiamate[4] = new Chiamata("+39 3494272358", 13);
        uno.setChiamate(chiamate);
        uno.stampaDati();



        scan.close();
    }
}
