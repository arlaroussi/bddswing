package view;

import javax.swing.*;
import java.awt.*;

public class Authentification extends JFrame {
    private JButton BtnValider;
    private JButton BtnAnnuler;
    private JLabel JlblIcone;
    private JPanel PanTxt;
    private JTextField txtLogin;
    private JTextField txtPassword;
    private JPanel PanBtn;
    private JPanel mainPan;

    public Authentification() throws HeadlessException {
        setContentPane(mainPan);
        setSize(450,250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }
}
