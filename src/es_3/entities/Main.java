package es_3.entities;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("LISTA DEGLI ARTICOLI");
        Articolo primo = new Articolo("223D", "Ledger Nano S , hardware wallet", 91.99 , 253);
        System.out.println("1) " + primo);
        Articolo secondo = new Articolo("741H", "Trezor One, hardware wallet", 76.45 , 398);
        System.out.println("2) " + secondo);

        System.out.println("REGISTRATI");
        System.out.println("INSERISCI IL NOME ED IL COGNOME");
        String name = scan.nextLine();
        System.out.println("INSERISCI LA MAIL");
        String email = scan.nextLine();
        Cliente neww = new Cliente( name, email);
        System.out.println("REGISTRAZIONE AVVENUTA CON SUCCESSO: " + neww);

//        System.out.println("LISTA DEGLI ARTICOLI");
//        Articolo primo = new Articolo("223D", "Ledger Nano S , hardware wallet", 91.99 , 253);
//        System.out.println("1) " + primo);
//        Articolo secondo = new Articolo("741H", "Trezor One, hardware wallet", 76.45 , 398);
//        System.out.println("2) " + secondo);


//        Chiamata[] chiamate = new Chiamata[5];
//        chiamate[0] = new Chiamata("+39 3494278805", 20);
//        chiamate[1] = new Chiamata("+39 3494278805", 1);
//        chiamate[2] = new Chiamata("+39 3494275405", 7);
//        chiamate[3] = new Chiamata("+39 3494278876", 1);
//        chiamate[4] = new Chiamata("+39 3494272358", 13);
//        uno.setChiamate(chiamate);
//        uno.stampaDati();



        scan.close();
    }
}
