public class Chiamata {
    private long numeroTelefonico;
    private boolean vivavoce;

    public Chiamata(long numeroTelefonico, boolean vivavoce) {
        this.numeroTelefonico = numeroTelefonico;
        this.vivavoce = vivavoce;
    }

    public long getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(long numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public boolean isVivavoce() {
        return vivavoce;
    }

    public void setVivavoce(boolean vivavoce) {
        this.vivavoce = vivavoce;
    }

    @Override
    public String toString() {
        return "Chiamata{" +
                "numeroTelefonico=" + numeroTelefonico +
                ", vivavoce=" + vivavoce +
                '}';
    }
}
