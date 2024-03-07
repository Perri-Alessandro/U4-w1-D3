package es_3.entities;

public class Carrello {
    private Cliente cliente;
    private Articolo[] articoli;


    public Carrello(Cliente cliente, Articolo[] articoli) {
        this.cliente = cliente;
        this.articoli = articoli;

    }

    @Override
    public String toString() {
        return
                "cliente=" + this.cliente +
                ", articoli=" + this.articoli +
                ", totCarrello=" + this.totCarrello()
               ;
    }
    public double totCarrello() {
        double totale = 0;
        for (int i = 0; i < this.articoli.length; i++) {
            totale += this.articoli[i].getPrice();
        }
        return totale;
    }
}
