public class Casella {
    private int riga = 0;
    private int colonna = 0;
    private boolean isBlack = false;
    private String descrizione = " ";
    private Scacco scacco;


    public Casella(int riga, int colonna, boolean isBlack, String descrizione, Scacco scacco) {
        this.riga = riga;
        this.colonna = colonna;
        this.isBlack = isBlack;
        this.descrizione = descrizione;
        this.scacco = scacco;
       
    }

    public Casella(int riga, int colonna, String descrizione) {
        this.riga = riga;
        this.colonna = colonna;
        this.descrizione = descrizione;
    }


    public int getRiga() {
        return this.riga;
    }

    public void setRiga(int riga) {
        this.riga = riga;
    }

    public int getColonna() {
        return this.colonna;
    }

    public void setColonna(int colonna) {
        this.colonna = colonna;
    }

    public boolean getIsBlack() {
        return this.isBlack;
    }

    public void setIsBlack(boolean isBlack) {
        this.isBlack = isBlack;
    }

    public String getDescrizione() {
        return this.descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Scacco getScacco() {
        return this.scacco;
    }

    public void setScacco(Scacco scacco) {
        this.scacco = scacco;
        this.riga = scacco.getRiga();
        this.colonna = scacco.getColonna();
        this.descrizione = scacco.getName();
    }


}