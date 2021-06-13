public class Chambre extends Local {
    private double dimension;

    //constucteur par défaut
    public Chambre(){}

    //constructeur personnalisé

    public Chambre(String reference, String localisaon, int prix, double tauxLoc, double dimension){
        super(reference,localisaon,prix,tauxLoc);
        this.dimension = dimension;
    }

    //getter et setter
    public double getDimension() {
        return dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return super.toString() + "\n dimension " + this.dimension;
    }
}
