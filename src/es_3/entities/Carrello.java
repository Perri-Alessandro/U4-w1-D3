package es_3.entities;

public class Carrello {
    private Cliente cliente;
    private Articolo articoli;
    private double totCarrello;

    public Carrello(Cliente cliente, Articolo articoli, double totCarrello) {
        this.cliente = cliente;
        this.articoli = articoli;
        this.totCarrello = totCarrello;
    }

    @Override
    public String toString() {
        return
                "cliente=" + cliente +
                ", articoli=" + articoli +
                ", totCarrello=" + totCarrello
               ;
    }
}
