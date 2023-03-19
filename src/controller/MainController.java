package controller;

import Model.FiliereRepository;
import Model.UserRepository;
import view.Authentification;
import view.FEtudiant;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainController{

    public void gererAuthentification( Authentification auth) {

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
                        fen.setVisible(true);
                    }
                }
                catch (SQLException event) {
                    System.out.println(event.getMessage());
                }
            }
        });

        auth.getBtnAnnuler().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public void populateComboFiliere() {
        FEtudiant fen1 = new FEtudiant();

        fen1.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                fen1.getTxtNom().setText("BONJOUR");
                try {
                    FiliereRepository frepo = new FiliereRepository();
                    ResultSet rst = frepo.getAllFilieres();
                    while (rst.next()) {
                        String item = rst.getString(1);
                        //System.out.println(item);
                        fen1.getComboFiliere().addItem(item);
                    }
                }
                catch (Exception ev) {
                    System.out.println(ev.getMessage());
                    ev.printStackTrace();
                }
            }

            @Override
            public void windowClosing(WindowEvent e) {}

            @Override
            public void windowClosed(WindowEvent e) {}

            @Override
            public void windowIconified(WindowEvent e) {}

            @Override
            public void windowDeiconified(WindowEvent e) {}

            @Override
            public void windowActivated(WindowEvent e) {}

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });


    }


}
