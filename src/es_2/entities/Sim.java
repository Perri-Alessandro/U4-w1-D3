package es_2.entities;

import java.util.Arrays;

public class Sim {
    private long numero;
    private int credito;
    private Chiamata[] chiamate;

    private long numeroChiamato;

    public Sim(long numero) {
       this.numero = numero;
       this.credito = 0 ;
       this.chiamate = new Chiamata[0];
       this.numeroChiamato = 0;
    }
    public Sim () {
        this.numero = numero;
        this.credito = 22 ;
        this.chiamate = new Chiamata[5];
        this.numeroChiamato = 0;
    }

    public void aggiungiChiamata(int durata, int numeroChiamato){
      if(numeroChiamato < chiamate.length) {
      chiamate[numeroChiamato] = new Chiamata(durata, numeroChiamato);
      numeroChiamato ++;
      } else {
      System.out.println("IMPOSSIBILE AGGIUNGERE CHIAMATA,ARRAY PIENO");
      }
    }
    private class Chiamata {
        private int durata;
        private long numeroChiamato;

     public Chiamata (int durata, long numeroChiamato){
         this.durata = durata;
         this.numeroChiamato = numeroChiamato;
     }


        @Override
        public String toString() {
            return "Chiamata{" +
                    "Durata: " + durata +
                    ", Numero chiamato: " + numeroChiamato +
                    "}";
     };
        };
    @Override
    public String toString() {
        return "Numero: " + numero + ", Credito: " + credito + ", Chiamate: " + Arrays.toString(chiamate);
    }

}

