package view;

import Model.EtudiantRepository;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class ListeEtudiants extends JFrame {
    private JTable listeEtud;

    public JTable getListeEtud() {
        return listeEtud;
    }

    private JPanel mainPan;

    public ListeEtudiants()  throws HeadlessException {
        setContentPane(mainPan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
