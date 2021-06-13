

public class Appartement extends Local{
    private int nbrePiece;
    //constructeur par défaut
    public Appartement(){}


    //constructeur personnalisé

    public Appartement(String reference, String localisation, int prix, double tauxLoc, int nbrePiece){
        super(reference,localisation,prix,tauxLoc);
        this.nbrePiece = nbrePiece;
    }

    //getter et setter


    public void setNbrePiece(int nbrePiece) {
        this.nbrePiece = nbrePiece;
    }

    public int getNbrePiece() {
        return nbrePiece;
    }


    @Override
    public String toString() {

        return  super.toString() + "\n nombre de pièces "+ this.nbrePiece;
    }

}
