package Model;

import java.sql.*;

public class UserRepository {

    public int verifLogin(String login, String pass) throws SQLException {
       Statement stmt=null;
        Connection connexion=null;
        ResultSet result=null;

        int nombre=0;


            try {
                connexion = Connexion.seConnecter();
                String requete = "Select count(*) As nombre from utilisateur where login = '" + login + "' and passwd = '" + pass +"'";
                stmt = connexion.createStatement();
                result = stmt.executeQuery(requete);

                while (result.next()){
                    nombre = result.getInt(1);
                }
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
        return nombre;
    }
}
