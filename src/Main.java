public class Main {
    public static void main(String[] args) {

        Triangolo triangolo = new Triangolo(10,15);//// Crea un'istanza della classe Triangolo
        // Chiamare il metodo calcolaArea
        triangolo.calcolaArea();


        Rettangolo rettangolo = new Rettangolo(20,50);// // Crea un'istanza della classe Rettangolo
        // Chiama il metodo calcolaArea
        rettangolo.calcolaArea();
    }
}


//Scrivere un programma che contenga una classe astratta chiamata Forma ed un metodo astratto chiamato calcolaArea().
//Crea poi due sottoclassi Rettangolo e Triangolo che estendono Forma ed implementano il metodo per il calcolo dell'area in maniera specifica.