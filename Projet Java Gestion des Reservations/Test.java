import java.time.LocalDate;
import java.util.Scanner;

public class Test {
    public static Scanner scanner = new Scanner(System.in);
    public static int menu()
    {
        int choix;
        System.out.println
                ("Menu"
                        + "\n 1-Ajouter un local"
                        + "\n 2-Lister les locaux par type"
                        + "\n 3-Lister les locaux réservés par un client"
                        + "\n 4-Voir les détail d'un local "
                        + "\n 5-Faire une réservation"
                        + "\n 6-Annuler unne réservation"
                        + "\n 7-Lister les locaux disponibles"
                        + "\n 8-Quitter");
        System.out.print("Faites votre choix : ");
        choix = scanner.nextInt();
        return choix;

    }

    public static void main(String[] args) {
  
        int choix;
        do {
            Service service = new Service();
            Local local1 = new Chambre("ref1", "Dakar", 234, 12, 234);
            Local local2 = new Appartement("ref2", "Pikine", 345, 0.89, 3);
            Local local3 = new Chambre("ref3", "Dakar", 857, 45, 58);
            Local local4 = new Chambre("ref4", "Rufisque", 459, 32, 13);
            Local local5 = new Appartement("ref5", "Pikine", 231, 14, 24);
            Local local6 = new Chambre("ref6", "Point-E", 254, 0.22, 2);
            Local local7 = new Appartement("ref7", "Dakar", 26, 0.2, 224);
            Local local8 = new Chambre("ref8", "Dakar", 325, 0.12, 26);
            service.listLocaux.add(local3);
            Client client4 = new Client(4, "Client4", "773456789", "Mbao", "client3@exemple.com");
            if(Validator.isValidMail(client4.getEmail()) && Validator.estVide(client4.getNomComplet()) && Validator.isValidTel(client4.getTel())&& Validator.estVide(client4.getAddresse())){
                service.getListClient().add(client4);
            }
            LocalDate now =  LocalDate.now();
            Reservation reservation = new Reservation(now, 23, 1,"bien",client4, local1);
            System.out.println()
            service.getListLocaux().add(local1);
            service.getListLocaux().add(local2);
            service.getListLocaux().add(local3);
            service.getListLocaux().add(local4);
            service.getListLocaux().add(local5);
            service.getListLocaux().add(local6);
            service.getListLocaux().add(local7);
            service.getListLocaux().add(local8);
            service.getListReservation().add(reservation);
            choix = menu();
            switch (choix){
                case 1:
                    System.out.println("Vous devez renseigner les informations du local à ajouter");
                    System.out.println("Veuillez renseigner la référence");
                    String reference = scanner.next();
                    System.out.println("Veuillez renseigner la localisation");
                    String localisation = scanner.next();
                    System.out.println("Veuiller renseigner le prix");
                    int prix = scanner.nextInt();
                    System.out.println("Veuiller rensiegner le taux de la location");
                    double taux = scanner.nextDouble();

                    Local local = new Local(reference,localisation,prix,taux);
                    service.ajoutLocal(local);

                    System.out.println("Local ajouté avec succés");

                

                    break;


                case 2:
                    service.listerLocauxType();
                    break;
                case 3:
                    System.out.println("Entrer le numéro du client");
                    int noCli = scanner.nextInt();
                    service.listerReservationClient(noCli);
                    break;
                case 4:
                    service.voirDetailLocaux("ref1");
                    break;

                case 5:
                    System.out.println("Veuillez rensiegner les données du client");
                    System.out.println("Entrer le nom du client");
                    String nom = scanner.next();
                    System.out.println("Entrer le numéro du client du client");
                    int nCli = scanner.nextInt();
                    System.out.println("Entrer l'adresse du client");
                    String adresse = scanner.next();
                    System.out.println("Entrer le téléphone  du client");
                    String tel = scanner.next();
                    System.out.println("Entrer l'adresse mail du client");
                    String email = scanner.next();
                    Client client = new Client(nCli,nom,tel,adresse,email);

                    System.out.println("Veuillez renseigner les données du local à reserver");

                    String ref = scanner.next();
                    System.out.println("Veuillez renseigner la localisation");
                    String loc = scanner.next();
                    System.out.println("Veuiller renseigner le prix");
                    int prix1 = scanner.nextInt();
                    System.out.println("Veuiller renseigner le taux de la location");
                    double taux1 = scanner.nextDouble();
                    Local loca = new Local(ref,loc,prix1,taux1);
                    System.out.println("Veuillez renseigner les donnees de la reservation");
                    System.out.println("l'id");
                    int id = scanner.nextInt();
                    System.out.println("l\'état");
                    String etat = scanner.next();
                    System.out.println("la durée");
                    int duree = scanner.nextInt();
                    LocalDate date = LocalDate.now();
                    Reservation reservation2 = new Reservation(date,duree,id,etat,client,loca);
                    service.faireReservation(reservation2);
                    System.out.println(reservation2.affiche());
                    System.out.println("Reservation enregistree");
           
                    break;
                case 6:
                    System.out.println("Entrer l'id de la réservation à annuler");
                    int id1 = scanner.nextInt();
                    service.annulerReservation(id1);
                    System.out.println("la reservation à été annulée");
                    break;
                

                case 7:
                    service.listerLocauxDisponible();
                    break;
                
                case 8:
                    
                   
                    System.out.println("Merci et au revoir");
                    break;
            }

        }while (choix >=1 && choix <=8);
    }
}
