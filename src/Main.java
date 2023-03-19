import controller.MainController;
import view.Authentification;
import view.FEtudiant;
import view.ListeEtudiants;

public class Main {

    public static void main(String[] args) {
        Authentification cadre = new Authentification();
        cadre.setVisible(true);
        MainController mc1 = new MainController();
        mc1.gererAuthentification(cadre);
        ListeEtudiants listeEtuds = new ListeEtudiants();
        mc1.afficherListeEtudiants(listeEtuds);
    }
}