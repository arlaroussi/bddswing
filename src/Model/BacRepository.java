package Model;

import java.sql.*;

public class BacRepository {

    private PreparedStatement pStmt = null;
    private Statement stmt;
    private Connection connexion = null;
    private ResultSet result = null;
    public ResultSet getAllBacs() throws SQLException {

        String requete = "Select libelle from bac";

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

