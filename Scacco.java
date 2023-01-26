public abstract class Scacco {
    private String name;
    private String posizione;
    private boolean isWhite;
    private Casella[][] scacchiera;
    private int riga;
    private int colonna;


    public Scacco(String name, String posizione, boolean isWhite, Casella[][] scacchiera) {
        this.posizione = posizione;
        this.isWhite = isWhite;
        this.scacchiera = scacchiera;
        mappaCoordinate(posizione);
        if(isWhite) {
            this.name = name.toUpperCase();
        } else {
            this.name = name.toLowerCase();
        }

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


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPosizione() {
        return this.posizione;
    }

    public void setPosizione(String posizione) {
        this.posizione = posizione;
    }

    public Casella[][] getScacchiera() {
        return this.scacchiera;
    }

    public void setScacchiera(Casella[][] scacchiera) {
        this.scacchiera = scacchiera;
    }
   

    public boolean isIsWhite() {
        return this.isWhite;
    }

    public boolean getIsWhite() {
        return this.isWhite;
    }

    public void setIsWhite(boolean isWhite) {
        this.isWhite = isWhite;
    }


    public void mappaCoordinate(String coordinata) {
        String[] coordinate = coordinata.split("");
        String colonna = coordinate[0].toLowerCase();
        String riga = coordinate[1];
        mappaRiga(riga);
        mappaColonna(colonna);
    }

    private void mappaColonna(String colonna) {
        switch (colonna) {
            case "a":
                this.colonna = 0;
                break;
            case "b":
                this.colonna = 1;
                break;
            case "c":
                this.colonna = 2;
                break;
            case "d":
                this.colonna = 3;
                break;
            case "e":
                this.colonna = 4;
                break;
            case "f":
                this.colonna = 5;
                break;
            case "g":
                this.colonna = 6;
                break;
            case "h":
                this.colonna = 7;
                break;           
        
            default:
                break;
        }
    }   



    public void mappaRiga(String r) {
        this.riga = 8 - Integer.parseInt(r);
    }


    public abstract void legalMoves(Scacco scacco, Casella[][] scacchiera); 

    public void bassoDestra(Scacco scacco, Casella[][] scacchiera) {
        int[] possibleRigaMoves = new int[scacchiera[1].length - scacco.getRiga()];
        int[] possibleColonnaMoves = new int[scacchiera[1].length - scacco.getColonna()];
        for(int i = 0; i < scacchiera[i].length - scacco.getColonna(); i++) {
            if(scacchiera[(scacco.getRiga() + i)][(scacco.getColonna() + i)] == null) {
                int possRiga = scacco.getRiga() + i;
                int possCol = scacco.getColonna() + i;
                possibleRigaMoves[i] = possRiga;
                possibleColonnaMoves[i] = possCol;
                scacchiera[possibleRigaMoves[i]][possibleColonnaMoves[i]] = new Casella(possibleRigaMoves[i], possibleColonnaMoves[i], "*");
            }
        }
    }

    // public void altoSinistra(Scacco scacco, Casella[][] scacchiera) {
    //     int[] possibleRigaMoves = new int[scacchiera[1].length - scacco.getRiga()];
    //     int[] possibleColonnaMoves = new int[scacchiera[1].length - scacco.getColonna()];
        
    // }
}


