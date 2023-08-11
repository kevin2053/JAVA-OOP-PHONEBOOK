public class Contatto {
    private String nome;
    private String cognome;
    private String soprannome;
    private long numero;

    public Contatto(String nome, String cognome, String soprannome, long numero) {
        this.nome = nome;
        this.cognome = cognome;
        this.soprannome = soprannome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getSoprannome() {
        return soprannome;
    }

    public void setSoprannome(String soprannome) {
        this.soprannome = soprannome;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contatto{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", soprannome='" + soprannome + '\'' +
                ", numero=" + numero +
                '}';
    }
}