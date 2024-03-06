package es_2.entities;

import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("INSERISCI UN NUMERO DI CELLULARE:");
        long numero = Long.parseLong(scan.nextLine());
        Sim uno = new Sim(numero);

        System.out.println("SIM CREATA: " + uno.toString());


        System.out.println("INSERISCI LA DURATA DELLA CHIAMATA:");
        int durata = Integer.parseInt(scan.nextLine());
        System.out.println("INSERISCI UN NUMERO CHIAMATO:");
        long numeroChiamato = Long.parseLong(scan.nextLine());
        Sim due = new Sim(numero);

        due.aggiungiChiamata(durata, (int) numeroChiamato);

        System.out.println("LISTA DI CHIAMATE: " + due);

        scan.close();
    }
}
