package Model;

import javax.swing.*;
import java.sql.*;

public class EtudiantRepository {
    private PreparedStatement pStmt = null;
    private Statement stmt;
    private Connection connexion = null;
    private ResultSet result = null;

    public ResultSet getAllEtudiants(Connexion con) throws SQLException {

        String requete = "Select * from Candidat";

        try {
            connexion = Connexion.seConnecter();
            stmt = connexion.createStatement();
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
            pStmt = (PreparedStatement) connexion.prepareStatement(requete);
            pStmt.setInt(1, id);
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

        //Récupération des champs du formulaire
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
            pStmt = (PreparedStatement) connexion.prepareStatement(requete);
            pStmt.setString(1, nom);
            pStmt.setString(2, prenom);
            pStmt.setString(3, datenaiss);
            pStmt.setString(4, lieunaiss);
            pStmt.setString(5, rue);
            pStmt.setString(6, cp);
            pStmt.setString(7, ville);
            pStmt.setString(7, ville);
            pStmt.setString(8, courriel);
            pStmt.setString(9, loisirs);
            pStmt.setInt(10, idSpec);
            pStmt.setInt(11, idFil);
            pStmt.setInt(11, id);

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
            pStmt = (PreparedStatement) connexion.prepareStatement(req);
            pStmt.setString(1, nom);
            pStmt.setString(2, prenoms);
            pStmt.setString(3, datenaiss);
            pStmt.setString(4, lieunaiss);
            pStmt.setString(5, rue);
            pStmt.setString(6, cp);
            pStmt.setString(7, ville);
            pStmt.setString(7, ville);
            pStmt.setString(8, courriel);
            pStmt.setString(9, loisirs);
            pStmt.setInt(10, idSpec);
            pStmt.setInt(11, idFil);
            pStmt.executeUpdate(req);
            JOptionPane.showMessageDialog(null, "Insertion effectuée");

        } catch (SQLException e) {
            System.out.println("Connection error");

        }
    } //Fin de la méthode addCadidat()

    public void deleteCandidat(Connexion cnx, int id) {

        String requete = "Delete from Candidat Where idCand = ?";
        try {
            connexion = Connexion.seConnecter();
            pStmt = (PreparedStatement) connexion.prepareStatement(requete);
            pStmt.executeUpdate(requete);
            JOptionPane.showMessageDialog(null, "Suppression effectuée");

        } catch (SQLException e) {
            System.out.println("Connection error");
        }
    } //Fin de la méthode deleteCadidat()

}
