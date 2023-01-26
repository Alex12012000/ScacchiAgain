public class Alfiere extends Scacco {

    public Alfiere(String name, String posizione, boolean isWhite, Casella[][] scacchiera) {
        super(name, posizione, isWhite, scacchiera);
        // this.altoSinistra(this, scacchiera);
        this.bassoDestra(this, scacchiera);
    }

    @Override
    public void legalMoves(Scacco scacco, Casella[][] scacchiera) {
        
    }
    
}
