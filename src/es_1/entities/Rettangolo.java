package es_1.entities;

public class Rettangolo {
    private int altezza;
    private int larghezza;


    public Rettangolo(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }


    public int areaRettangolo() {
        return altezza * larghezza ;
    }
    public int perimetroRettangolo(){
        return 2*(altezza+larghezza);
    }

    public  static  void stampaRettangolo(Rettangolo rr) {
        System.out.println("stampo area rettangolo" + rr.areaRettangolo());
        System.out.println("stampo permitero rettangolo" + rr.perimetroRettangolo());
    }

    public static void stampaDueRett(Rettangolo r1, Rettangolo r2) {
        int areaTotale = r1.areaRettangolo() + r2.areaRettangolo();
        int perimetroTotale = r1.perimetroRettangolo() + r2.perimetroRettangolo();
        int pEa = areaTotale + perimetroTotale;

        System.out.println("AREA TOTALE ULTIMI 2 RETTANGOLI: " + areaTotale);
        System.out.println("PERIMETRO TOTALE ULTIMI 2 RETTANGOLI: " + perimetroTotale);
        System.out.println("PERIMETRO TOTALE + AREA TOTALE ULTIMI 2 RETTANGOLI: " + pEa);

    }




}
