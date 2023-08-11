
public class Main {
    public static void main(String[] args) {
        /*
        -Rubrica telefonica con contatti telefonici //

        -Possibilita di aggiungere e rimuovere contatti //

        _Possibilita di inviarli messaggi o telefonarli
         */

        var rubrica = new Rubrica();

        //esempi nel utilizzo dei metodi

        rubrica.aggiungi("gianmarco","rossi","giggi",33978956432l);
        System.out.println(rubrica.getListaContatti());

        rubrica.aggiungi("luca","gialli","giallino",3397788287532l);
        System.out.println(rubrica.getListaContatti());
        rubrica.rimozione(0);
        System.out.println(rubrica.getListaContatti());

        // esempio di messaggio a un contatto

        rubrica.aggiungi("chiara","marrone","bho",3391345678l);
        System.out.println(rubrica.getListaContatti());
        //metodo messaggio

        rubrica.mandaMessaggio(33923456789l, "ciao","come va?");
        System.out.println(rubrica.getListaContatti());

        //metodo chiamata
        rubrica.chiama(3394567890l,true);


    }
}