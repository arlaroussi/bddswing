package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Authentification extends JFrame {
    private JButton BtnValider;
    private JButton BtnAnnuler;
    private JLabel JlblIcone;
    private JPanel PanTxt;
    private JTextField txtLogin;
    private JPasswordField txtPassword;
    private JPanel PanBtn;
    private JPanel mainPan;

    public Authentification() throws HeadlessException {
        setContentPane(mainPan);
        setSize(450,250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public JButton getBtnValider() {
        return BtnValider;
    }

    public JButton getBtnAnnuler() {
        return BtnAnnuler;
    }

    public JLabel getJlblIcone() {
        return JlblIcone;
    }

    public JPanel getPanTxt() {
        return PanTxt;
    }

    public JTextField getTxtLogin() {
        return txtLogin;
    }

    public JTextField getTxtPassword() {
        return txtPassword;
    }

    public JPanel getPanBtn() {
        return PanBtn;
    }

    public JPanel getMainPan() {
        return mainPan;
    }
}
