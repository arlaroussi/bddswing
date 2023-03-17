package Model;

import javax.swing.*;
import java.sql.*;

public class EtudiantRepository {
    private PreparedStatement stmt = null;
    private Connection connexion = null;
    private ResultSet result = null;

    public ResultSet getAllEtudiants(Connexion con) throws SQLException {

        String requete = "Select * from Candidat";

        try {
            connexion = Connexion.seConnecter();
            stmt = (PreparedStatement) connexion.createStatement();
            result = stmt.executeQuery(requete);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    public ResultSet getCandidatById(Connexion cnx, int id) throws SQLException {

        String requete = "Select * from Candidat where idCand = ?)";
        try {
            connexion = Connexion.seConnecter();
            stmt = (PreparedStatement) connexion.prepareStatement(requete);
            stmt.setInt(1, id);
            result = stmt.executeQuery(requete);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    public void updateCandidat(Connexion cnx, int id) {

        String requete = "Update Candidat Set nom = ?, prenom = ?, datenaiss = ?, lieunaiss = ?, rue = ?, " +
                "cp = ?, ville = ?, tel = ?, courriel = ? , loisirs = ?, idSpec = ?, idFil = ?, " +
                "where idCand = ?";

        //Récupération des champs du frmulaire
        String nom = "";
        String prenom = "";
        String datenaiss = "";
        String lieunaiss = "";
        String rue = "";
        String cp = "";
        String ville = "";
        String tel = "";
        String courriel = "";
        String loisirs = "";
        int idSpec = 0;
        int idFil = 0;

        try {
            connexion = Connexion.seConnecter();
            stmt = (PreparedStatement) connexion.prepareStatement(requete);
            stmt.setString(1, nom);
            stmt.setString(2, prenom);
            stmt.setString(3, datenaiss);
            stmt.setString(4, lieunaiss);
            stmt.setString(5, rue);
            stmt.setString(6, cp);
            stmt.setString(7, ville);
            stmt.setString(7, ville);
            stmt.setString(8, courriel);
            stmt.setString(9, loisirs);
            stmt.setInt(10, idSpec);
            stmt.setInt(11, idFil);
            stmt.setInt(11, id);

            stmt.executeUpdate(requete);
            JOptionPane.showMessageDialog(null, "Mise à jour effectuée effectuée");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    } //Fin de la méthode updateCadidat()

    public void addCandidat(Connexion cnx) {
        String nom = "";
        String prenoms = "";
        String datenaiss = "";
        String lieunaiss = "";
        String rue = "";
        String cp = "";
        String ville = "";
        String tel = "";
        String courriel = "";
        String loisirs = "";
        int idSpec = 0;
        int idFil = 0;

        String req = "INSERT INTO candidat(nom, prenoms, datenaiss, lieunaiss, rue, cp, ville, tel, courriel, loisirs, idSpec, idFil) =" +
                " VALUES ('" + nom + "','" + prenoms + "','" + datenaiss + "','" + lieunaiss + "','" + rue + "','" + cp + "','" + ville +
                "','" + tel + "','" + courriel + "','" + loisirs + "','" + loisirs + "'," + idSpec + "," + idFil + ");";
        try {
            connexion = Connexion.seConnecter();
            stmt = (PreparedStatement) connexion.createStatement();
            stmt.setString(1, nom);
            stmt.setString(2, prenoms);
            stmt.setString(3, datenaiss);
            stmt.setString(4, lieunaiss);
            stmt.setString(5, rue);
            stmt.setString(6, cp);
            stmt.setString(7, ville);
            stmt.setString(7, ville);
            stmt.setString(8, courriel);
            stmt.setString(9, loisirs);
            stmt.setInt(10, idSpec);
            stmt.setInt(11, idFil);
            stmt.executeUpdate(req);
            JOptionPane.showMessageDialog(null, "Insertion effectuée");

        } catch (SQLException e) {
            System.out.println("Connection error");

        }
    } //Fin de la méthode addCadidat()

    public void deleteCandidat(Connexion cnx, int id) {

        String requete = "Delete from Candidat Where idCand = ?";
        try {
            connexion = Connexion.seConnecter();
            stmt = (PreparedStatement) connexion.createStatement();
            stmt.executeUpdate(requete);
            JOptionPane.showMessageDialog(null, "Suppression effectuée");

        } catch (SQLException e) {
            System.out.println("Connection error");
        }
    } //Fin de la méthode deleteCadidat()

}
