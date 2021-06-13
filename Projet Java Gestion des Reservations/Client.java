import java.util.ArrayList;
import java.util.List;

public class Client {
    private int numeroCi;
    private String nomComplet;
    private String tel;
    private String addresse;
    private String email;
    List<Local> listLocauxClient = new ArrayList<>();

    public int getNumeroCi() {
        return this.numeroCi;
    }

    public void setNumeroCi(int numeroCi) {
        this.numeroCi = numeroCi;
    }

    public String getNomComplet() {
        return this.nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddresse() {
        return this.addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setListLocauxClient(List<Local> listLocauxClient) {
        this.listLocauxClient = listLocauxClient;
    }

    public List<Local> getListLocauxClient() {
        return listLocauxClient;
    }

    public Client() {
    }

    public Client(int numeroCi, String nomComplet, String tel, String addresse, String email) {
        this.numeroCi = numeroCi;
        this.nomComplet = nomComplet;
        this.tel = tel;
        this.addresse = addresse;
        this.email = email;

    }

    public String affiche(){
        return "nom Client: "+this.nomComplet + "\n numéro client: "+ this.numeroCi + "\n numéro téléphone: "+this.tel + "\n adresse: "+this.addresse + "\n email:" +this.email;
    }
}
