package es_1.entities;

import java.util.Scanner;
import es_1.entities.Rettangolo;
public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("INSERISCI L'ALTEZZA DEL RETTANGOLO:");
        int altezza = Integer.parseInt(scan.nextLine());
        System.out.println("INSERISCI LA LARGHEZZA DEL RETTANGOLO:");
        int larghezza = Integer.parseInt(scan.nextLine());
        Rettangolo uno = new Rettangolo(altezza, larghezza);

        System.out.println("L'ARE DEL RETTANGOLO è: " + uno.areaRettangolo());
        System.out.println("IL PERIMETRO DEL RETTANGOLO è: " + uno.perimetroRettangolo());


        System.out.println("INSERISCI L'ALTEZZA DEL PRIMO E SECONDO RETTANGOLO");
        int altezza1 = Integer.parseInt(scan.nextLine());
        int altezza2 = Integer.parseInt(scan.nextLine());
        System.out.println("INSERISCI LA LARGHEZZA DEL PRIMO E SECONDO RETTANGOL0");
        int larghezza1 = Integer.parseInt(scan.nextLine());
        int larghezza2 = Integer.parseInt(scan.nextLine());
        Rettangolo due = new Rettangolo(altezza1, larghezza1);
        Rettangolo tre = new Rettangolo(altezza2, larghezza2);

        System.out.println("L'AREA DEL PRIMO RETTANGOLO è: " + due.areaRettangolo());
        System.out.println("IL PERIMETRO DEL PRIMO RETTANGOLO è: " + due.perimetroRettangolo());
        System.out.println("L'AREA DEL SECONDO RETTANGOLO è: " + tre.areaRettangolo());
        System.out.println("IL PERIMETRO DEL SECONDO RETTANGOLO è: " + tre.perimetroRettangolo());

        System.out.println("STAMPO TUTTI I RETTANGOLI:");
        Rettangolo.stampaRettangolo(uno);
        Rettangolo.stampaRettangolo(due);
        Rettangolo.stampaRettangolo(tre);

        Rettangolo.stampaDueRett(due, tre);

        scan.close();
    }
}
