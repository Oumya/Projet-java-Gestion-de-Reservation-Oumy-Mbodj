public class Local {
    protected String reference;
    protected String localisation;
    protected int prix;
    protected double tauxLoc;

    //booléen permettant de savir si le local est disponible
    protected boolean estDisponible;

    //Constructeur par défaut
    public Local(){
        this.estDisponible = true;
    }


    //construteur personnalisé
    public Local(String reference, String localisation, int prix, double taux){
        this.reference = reference;
        this.localisation = localisation;
        this.prix = prix;
        this.tauxLoc = taux;
        this.estDisponible = true;

    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public double getTauxLoc() {
        return tauxLoc;
    }

    public void setTauxLoc(double tauxLoc) {
        this.tauxLoc = tauxLoc;
    }

    public boolean isEstDisponible() {
        return estDisponible;
    }

    public double cout(){
        return this.prix + (this.prix * this.tauxLoc);
    }

    @Override
    public String toString() {
        return  "référence : "+ this.reference + "\n lieu " + this.localisation + "\n prix : " + this.prix + "\n Taux de location " + this.tauxLoc;
    }
}
