package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FEtudiant extends JFrame{
    private JPanel mainPan;
    private JPanel panIdent;
    private JPanel panAdresse;
    private JPanel panAutre;
    private JTextField txtNom;
    private JTextField txtPrenoms;
    private JTextField txtDNaiss;
    private JTextField txtLieuNaiss;
    private JTextField txtNat;
    private JTextField txtRue;
    private JTextField txtCP;
    private JTextField txtVille;
    private JTextField txtTel;
    private JTextField txtMail;
    private JRadioButton radioHomme;
    private JRadioButton radioFemme;
    private JCheckBox chkBoxSport;
    private JCheckBox chkBoxLecture;
    private JCheckBox chkBoxMusique;
    private JCheckBox chkBoxVoyage;
    private JPanel panDiplome;
    private JComboBox comboFiliere;
    private JComboBox comboNiveau;
    private JTextArea textArea1;
    private JPanel panBtn;
    private JComboBox comboBac;
    private JButton BtnValider;
    private JButton btnAfficher;
    private JButton btnAnnuler;
    private JPanel panButton;

    public JPanel getMainPan() {
        return mainPan;
    }

    public JPanel getPanIdent() {
        return panIdent;
    }

    public JPanel getPanAdresse() {
        return panAdresse;
    }

    public JPanel getPanAutre() {
        return panAutre;
    }

    public JTextField getTxtNom() {
        return txtNom;
    }

    public JTextField getTxtPrenoms() {
        return txtPrenoms;
    }

    public JTextField getTxtDNaiss() {
        return txtDNaiss;
    }

    public JTextField getTxtLieuNaiss() {
        return txtLieuNaiss;
    }

    public JTextField getTxtNat() {
        return txtNat;
    }

    public JTextField getTxtRue() {
        return txtRue;
    }

    public JTextField getTxtCP() {
        return txtCP;
    }

    public JTextField getTxtVille() {
        return txtVille;
    }

    public JTextField getTxtTel() {
        return txtTel;
    }

    public JTextField getTxtMail() {
        return txtMail;
    }

    public JRadioButton getRadioHomme() {
        return radioHomme;
    }

    public JRadioButton getRadioFemme() {
        return radioFemme;
    }

    public JCheckBox getChkBoxSport() {
        return chkBoxSport;
    }

    public JCheckBox getChkBoxLecture() {
        return chkBoxLecture;
    }

    public JCheckBox getChkBoxMusique() {
        return chkBoxMusique;
    }

    public JCheckBox getChkBoxVoyage() {
        return chkBoxVoyage;
    }

    public JPanel getPanDiplome() {
        return panDiplome;
    }

    public JComboBox getComboFiliere() {
        return comboFiliere;
    }

    public JComboBox getComboNiveau() {
        return comboNiveau;
    }

    public JTextArea getTextArea1() {
        return textArea1;
    }

    public JPanel getPanBtn() {
        return panBtn;
    }

    public JComboBox getComboBac() {
        return comboBac;
    }

    public JButton getBtnValider() {
        return BtnValider;
    }

    public JButton getBtnAfficher() {
        return btnAfficher;
    }

    public JButton getBtnAnnuler() {
        return btnAnnuler;
    }

    public JPanel getPanButton() {
        return panButton;
    }

    public FEtudiant() {
        setContentPane(mainPan);
        setSize(950,700);
        setTitle("Formumaire inscription");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }
}
