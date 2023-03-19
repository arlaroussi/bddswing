package Model;

import java.sql.*;

public class FiliereRepository {
    private PreparedStatement pStmt = null;
    private Statement stmt;
    private Connection connexion = null;
    private ResultSet result = null;
    public ResultSet getAllFilieres() throws SQLException {

        String requete = "Select nomFil from filiere";

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

}
