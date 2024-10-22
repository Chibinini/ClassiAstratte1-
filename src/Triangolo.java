public class Triangolo extends Forma {

    //variabili che appartingono a Triangolo
    private double larghezza;
    private double altezza;

    // Costruttore per inizializzare larghezza e altezza
    public Triangolo(double larghezza, double altezza) {
        this.larghezza = larghezza;
        this.altezza = altezza;
    }

    // Sovrascrittura del metodo astratto calcolaArea
    @Override
    public void calcolaArea(){
        double area = altezza * larghezza / 2;
        System.out.println("L'area è : " + area);

    }


}
