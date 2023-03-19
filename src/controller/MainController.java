package controller;

import Model.*;
import view.Authentification;
import view.FEtudiant;
import view.ListeEtudiants;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainController {

    FEtudiant fen = new FEtudiant();
    //ListeEtudiants listeEtud = new ListeEtudiants();

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
                        //FEtudiant fen = new FEtudiant();
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
                                    while (rst2.next()) {
                                        String item = rst2.getString(1);
                                        fen.getComboBac().addItem(item);
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

    public void afficherListeEtudiants(ListeEtudiants listeEtud) {
        fen.getBtnAfficher().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String columns[] = {"ID", "Nom", "Prénoms"};

                String data[][] = new String[13][3];

                try {
                    int i = 0;
                    EtudiantRepository rEtud = new EtudiantRepository();
                    ResultSet liste = rEtud.getAllEtudiants();

                    while (liste.next()) {
                        int id = liste.getInt("idCand");
                        String nom = liste.getString("nom");
                        String prenoms = liste.getString("prenoms");
                        data[i][0] = id + "";
                        data[i][1] = nom;
                        data[i][2] = prenoms;
                        i++;
                    }

                    DefaultTableModel model = new DefaultTableModel(data, columns);
                    JTable table = listeEtud.getListeEtud();
                    table.setModel(model);
                    listeEtud.setSize(500, 350);
                    table.setShowGrid(true);
                    table.setShowVerticalLines(true);
                    listeEtud.setVisible(true);
                    System.out.println("Bonjour");

                } catch (SQLException event) {
                    event.printStackTrace();
                }
            }
        });

    }
}

