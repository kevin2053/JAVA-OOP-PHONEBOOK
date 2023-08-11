import java.util.List;
import java.util.ArrayList;

public class Rubrica {
    private List ListaContatti = new ArrayList();

    public Rubrica(){};

    // getter setter

    public List getListaContatti() {
        return ListaContatti;
    }

    public void setListaContatti(List listaContatti) {
        ListaContatti = listaContatti;
    }

    //metodi

    public void aggiungi(String nome, String cognome, String soprannome, long numero){
        var nuovoContatto = new Contatto(nome,cognome,soprannome,numero);
        ListaContatti.add(nuovoContatto);
    }

    public void rimozione(int numerazione){
        ListaContatti.remove(numerazione);
    }

    // metodi messaggi/chiamate

    //messaggio
    public void mandaMessaggio(long numeroDestinatario, String oggetto, String corpo){
        var messaggio = new Messaggio(numeroDestinatario, oggetto, corpo);
        ListaContatti.add(messaggio);
    }

    //chiamate

    public void chiama(long numeroTeefonico, boolean vivavoce){
        var chiamata = new Chiamata(numeroTeefonico,vivavoce);
        System.out.println(chiamata.toString());
    }




}
