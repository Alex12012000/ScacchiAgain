public class ChessManager {

    private static Casella[][] scacchiera = new Casella[8][8];    


    public static void displayBoard() {
        setScacchi(scacchiera, new Alfiere("a", "d5", true, scacchiera));



        System.out.println();
        int column = 8;
        int count = 0;
        System.out.print("     a   b   c   d   e   f   g   h");
        System.out.println("\n");
        for(int i = 0; i < 8; i++){
            count++;
            System.out.print(column + " -  ");
            column--;
            for(int j = 0; j < 8; j++) {
                count++;
                if(count % 2 != 0) {
                    if(scacchiera[i][j] == null) {
                        scacchiera[i][j] = new Casella(i, j, true, null, null);
                    }

                    if(scacchiera[i][j].getScacco() != null){
                        System.out.print(scacchiera[i][j].getScacco().getName() + "   ");
                    }else if(scacchiera[i][j].getDescrizione() != null && scacchiera[i][j].getScacco() == null) {
                        System.out.print(scacchiera[i][j].getDescrizione() + "   ");
                    } else if(scacchiera[i][j].getIsBlack()) {
                        System.out.print("X   ");
                    }
                } else {
                    if(scacchiera[i][j] == null) {
                        scacchiera[i][j] = new Casella(i, j, false, null, null);
                    }

                    if(scacchiera[i][j].getScacco() != null){
                        System.out.print(scacchiera[i][j].getScacco().getName() + "   ");
                    } else if(scacchiera[i][j].getDescrizione() != null) {
                        System.out.print(scacchiera[i][j].getDescrizione() + "   ");
                    } else if(!scacchiera[i][j].getIsBlack()) {
                        System.out.print("O   ");
                    }
                }
            }
            System.out.println("\n\n");
        }       
      
    }



    public static void setScacchi(Casella[][] scacchiera, Scacco scacco) {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                scacchiera[scacco.getRiga()][scacco.getColonna()] = new Casella(scacco.getRiga(), scacco.getColonna(), false, null, scacco);
                scacco.legalMoves(scacco, scacchiera);
            }
        }
    }

   
}
