import java.util.ArrayList;
import java.util.List;

public class Service implements IService{
    public List<Local> listLocaux = new ArrayList<>();
    public List<Chambre> listChambres = new ArrayList<>();
    public List<Appartement> listAppartements = new ArrayList<>();
    public List<Reservation> listReservations = new ArrayList<>();
    public List<Client> listClients = new ArrayList<>();

    public List<Client> getListClient(){
        return this.listClients;
    }
    public List<Local> getListLocaux(){
        return this.listLocaux;
    }
    public List<Reservation> getListReservation(){
        return this.listReservations;
    }

    //construteur par défaut
    public Service(){}

    //créer un local
    @Override
    public void ajoutLocal(Local local){
        listLocaux.add(local);
    }


    // lister les locaux par type
    @Override
    public void listerLocauxType(){
        //classification des locaux par types
        for (Local local: listLocaux){
            if(local instanceof Chambre){
                listChambres.add((Chambre) local);
            }
            else {
                listAppartements.add((Appartement) local);
            }
        }
        //afficahge des chambres
        System.out.println("===== Liste des chambres =====");
        for (Chambre chambre: listChambres){
            System.out.println(chambre.toString());
        }

        //affichage des appartement
        System.out.println("====== Liste des appartements =====");
        for (Appartement appartement: listAppartements){
            System.out.println(appartement.toString());
        }
    }
    @Override
    //lister les lcaux réserver par un client
    public void listerReservationClient(int nCli){
        System.out.println("Voici la réservation du client d'id "+nCli);
        for(Reservation reservation:listReservations){
            if(reservation.getClient().getNumeroCi() == nCli){
                System.out.println(reservation.affiche());
            }
        }
    }

    //voir les détails d'un local
    @Override
    public void voirDetailLocaux(String reference){
        String reponse = "";
        for (Local local : listLocaux){
            if(local.getReference().equals(reference)){
                System.out.println("===== Voici les détails du local demandé");
                reponse = local.toString();
            }
        }
        System.out.println(reponse);
    }


    //faire une réservation
    @Override
    public void faireReservation (Reservation reservation){
        reservation.getLocal().estDisponible = false;
        listReservations.add(reservation);
    }

    //annuler une réservation
    @Override
    public void annulerReservation(int id){
        for (Reservation reservation : listReservations){
            if(reservation.getId() == id){
                listReservations.remove(reservation);
                System.out.println("Annulation de la réservation effectuée avec succès");
            }
        }
    }

    //afficher les locaux disponible
    @Override
    public void listerLocauxDisponible(){
        for (Local local: listLocaux){
            if(local.estDisponible){
                System.out.println(local.toString());
            }
        }
    }
    @Override
    public void quitter(){
        System.out.println("quitter");
    }


}


