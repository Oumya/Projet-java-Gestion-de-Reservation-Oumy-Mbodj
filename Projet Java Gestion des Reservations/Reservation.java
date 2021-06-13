import java.time.LocalDate;
public class Reservation {
    private LocalDate date;
    private int duree;
    private int id;
    private String etat;
    private Client client;
    private Local local;

    //construteur par défaut
    public Reservation() {}

    //constructeur personnalisé
    public Reservation(LocalDate date, int duree, int id, String etat, Client client, Local local) {
        this.date = date;
        this.duree = duree;
        this.id = id;
        this.etat = etat;
        this.client = client;
        this.local = local;
        client.getListLocauxClient().add(local);
    }


    //getters et setters
    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getDuree() {
        return this.duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEtat() {
        return this.etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
    public Client getClient(){
        return this.client;
    }


    public String affiche(){
        return "Client :" +this.client.affiche() + "\n Local :"+this.local.toString() +"\n id: " +this.id+ "\n état: "+this.etat+ "\n date :"+this.date+ "\n durée "+this.duree;
    }

    public Local getLocal(){
        return this.local;
    }



}
