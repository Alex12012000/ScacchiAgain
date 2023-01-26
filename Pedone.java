public class Pedone extends Scacco {

    private boolean isFirstMove;
    
    public Pedone(String name, String posizione, boolean isWhite, Casella[][] scacchiera, boolean isFirstMove) {
        super(name, posizione, isWhite, scacchiera);
        this.isFirstMove = isFirstMove;
    }

    @Override
    public void legalMoves(Scacco scacco, Casella[][] scacchiera) {

       if(scacco.getIsWhite() && isFirstMove) {
            int possibleMove1 = getRiga() - 1;
            int possibleMove2 = getRiga() - 2;
            scacchiera[possibleMove1][scacco.getColonna()] = new Casella(possibleMove1, scacco.getColonna(), "*");
            scacchiera[possibleMove2][scacco.getColonna()] = new Casella(possibleMove2, scacco.getColonna(), "*");
            isFirstMove = false;
        }

       if(!scacco.getIsWhite() && isFirstMove) {
            int possibleMove1 = getRiga() + 1;
            int possibleMove2 = getRiga() + 2;
            scacchiera[possibleMove1][scacco.getColonna()] = new Casella(possibleMove1, scacco.getColonna(), "*");
            scacchiera[possibleMove2][scacco.getColonna()] = new Casella(possibleMove2, scacco.getColonna(), "*");
            isFirstMove = false;
        }

        if(scacco.getIsWhite() && !isFirstMove) {
            int possibleMove1 = getRiga() - 1;
            scacchiera[possibleMove1][scacco.getColonna()] = new Casella(possibleMove1, scacco.getColonna(), "*");
        }

        if(!scacco.getIsWhite() && !isFirstMove) {
            int possibleMove1 = getRiga() + 1;
            scacchiera[possibleMove1][scacco.getColonna()] = new Casella(possibleMove1, scacco.getColonna(), "*");
        }
        
    }
    
}
