public interface IService{
    public void ajoutLocal(Local loc);
    public void listerLocauxType();
    public void listerReservationClient(int ncli);
    public void voirDetailLocaux(String reference);
    public void faireReservation(Reservation reservation);
    public void annulerReservation(int id);
    public void listerLocauxDisponible();
    public void quitter();
}
