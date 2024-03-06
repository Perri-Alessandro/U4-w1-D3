package es_2.entities;

import java.util.Arrays;

public class Sim {
    private long numero;
    private double credito;
    private Chiamata[] chiamate;


    public Sim(long numero) {
        this.numero = numero;
        this.credito = 0;
        this.chiamate = new Chiamata[5];
    }

    public void aggiungiCash(double nuovoCredito) {
        this.credito += nuovoCredito;
    }

    public void setChiamate(Chiamata[] chiamate) {
        this.chiamate = chiamate;
    }

    public void stampaDati() {
        System.out.println("Sim: " + this.numero);
        System.out.println("Credito disponibile: " + this.credito);
//		System.out.println("Lista chiamate Sim: " + Arrays.toString(listaChiamate));
        if (chiamate[0] != null) {
            System.out.println("- Chiamata 1: " + chiamate[0].getNumeroChiamato() + " - Durata minuti: "
                    + chiamate[0].getDurata());
        }
        if (chiamate[1] != null) {
            System.out.println("- Chiamata 2: " + chiamate[1].getNumeroChiamato() + " - Durata minuti: "
                    + chiamate[1].getDurata());
        }
        if (chiamate[2] != null) {
            System.out.println("- Chiamata 3: " + chiamate[2].getNumeroChiamato() + " - Durata minuti: "
                    + chiamate[2].getDurata());
        }
        if (chiamate[3] != null) {
            System.out.println("- Chiamata 4: " + chiamate[3].getNumeroChiamato() + " - Durata minuti: "
                    + chiamate[3].getDurata());
        }
        if (chiamate[4] != null) {
            System.out.println("- Chiamata 5: " + chiamate[4].getNumeroChiamato() + " - Durata minuti: "
                    + chiamate[4].getDurata());
        }
    }

    @Override
    public String toString() {
        return "Sim{" +
                "numero=" + numero +
                ", credito='" + credito + '\'' +
                ", chiamate='" + Arrays.toString(chiamate) + '\'' +
                '}';
    }
}

