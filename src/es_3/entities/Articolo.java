package es_3.entities;

public class Articolo {
   public String codice;
   public String descrizioneArticolo;
    public double price;
    public int availablePieces;

    public Articolo(String codice, String descrizioneArticolo, double price, int availablePieces) {
        this.codice = codice;
        this.descrizioneArticolo = descrizioneArticolo;
        this.price = price ;
        this.availablePieces = availablePieces;
    }

    @Override
    public String toString() {
        return
                "codice='" + codice + '\'' +
                ", descrizioneArticolo='" + descrizioneArticolo + '\'' +
                ", price=" + price +
                ", availablePieces=" + availablePieces
                ;
    }
}
