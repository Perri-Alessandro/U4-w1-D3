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
        Rettangolo due = new Rettangolo(altezza1, altezza2, larghezza1, larghezza2);

        System.out.println("L'AREA DEL PRIMO RETTANGOLO è: " + due.areaRettangolo1());
        System.out.println("IL PERIMETRO DEL PRIMO RETTANGOLO è: " + due.perimetroRettangolo1());
        System.out.println("L'AREA DEL SECONDO RETTANGOLO è: " + due.areaRettangolo2());
        System.out.println("IL PERIMETRO DEL SECONDO RETTANGOLO è: " + due.perimetroRettangolo2());

        System.out.println("SOMMA DI AREE E PERIMETRI DI ULTIMI DUE RETTANGOLI: " + due.sommaAreaEperimSecEterzTriang());

        scan.close();
    }
}
