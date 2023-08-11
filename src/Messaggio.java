public class Messaggio {
    private long destinatario;
    private String oggetto;
    private String corpo;

    public Messaggio(long destinatario, String oggetto, String corpo) {
        this.destinatario = destinatario;
        this.oggetto = oggetto;
        this.corpo = corpo;
    }

    public long getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(int destinatario) {
        this.destinatario = destinatario;
    }

    public String getOggetto() {
        return oggetto;
    }

    public void setOggetto(String oggetto) {
        this.oggetto = oggetto;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    @Override
    public String toString() {
        return "Messaggio{" +
                "destinatario=" + destinatario +
                ", oggetto='" + oggetto + '\'' +
                ", corpo='" + corpo + '\'' +
                '}';
    }
}
