package es_1.entities;

public class Rettangolo {
    private int altezza;
    private int larghezza;

    private int altezza1;
    private int altezza2;

    private int larghezza1;
    private int larghezza2;

    public Rettangolo(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public Rettangolo( int altezza1,int larghezza1, int larghezza2, int altezza2) {
        this.altezza1 = altezza1;
        this.larghezza1 = larghezza1;
        this.altezza2 = altezza2;
        this.larghezza2 = larghezza2;
    }

    public int areaRettangolo() {
        return altezza * larghezza ;
    }
    public int perimetroRettangolo(){
        return 2*(altezza+larghezza);
    }


    public int areaRettangolo1() {
        return altezza1 * larghezza1 ;
    }

    public int areaRettangolo2() {
        return altezza2 * larghezza2 ;
    }

    public int perimetroRettangolo1() {
        return 2*(altezza1+larghezza1);
    }

    public int perimetroRettangolo2() {
        return 2*(altezza2+larghezza2);
    }
    public int sommaAreaEperimSecEterzTriang () {
        return (areaRettangolo1() + areaRettangolo2()) + (perimetroRettangolo1() + perimetroRettangolo2());
    }
}
