package controller;

import Model.FiliereRepository;
import Model.BacRepository;
import Model.UserRepository;
import view.Authentification;
import view.FEtudiant;

import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainController {

    public void gererAuthentification(Authentification auth) {

        auth.getBtnValider().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserRepository user = new UserRepository();
                String login = auth.getTxtLogin().getText();
                String pass = auth.getTxtPassword().getText();
                try {
                    if (user.verifLogin(login, pass) == 1) {
                        auth.setVisible(false);
                        FEtudiant fen = new FEtudiant();
                        fen.addWindowListener(new WindowAdapter() {
                            @Override
                            public void windowOpened(WindowEvent e) {
                                try {
                                    FiliereRepository frepo = new FiliereRepository();
                                    BacRepository brepo = new BacRepository();

                                    ResultSet rst1 = frepo.getAllFilieres();

                                    while (rst1.next()) {
                                        String item = rst1.getString(1);
                                        fen.getComboFiliere().addItem(item);
                                    }
                                    ResultSet rst2 = brepo.getAllBacs();
                                    while(rst2.next()) {
                                        String item = rst2.getString(1);
                                        fen.getComboFiliere().addItem(item);
                                    }
                                } catch (Exception ev) {
                                    System.out.println(ev.getMessage());
                                    ev.printStackTrace();
                                }
                            }
                        });
                        fen.setVisible(true);
                    }
                } catch (SQLException event) {
                    System.out.println(event.getMessage());
                }

                auth.getBtnAnnuler().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });
            }
        });

}
}
