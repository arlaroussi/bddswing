package view;

import javax.swing.*;

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
    private JComboBox comboBox1;
    private JButton BtnValider;
    private JButton btnAfficher;
    private JButton btnAnnuler;
    private JPanel panButton;

    public FEtudiant() {
        setContentPane(mainPan);
        setSize(950,700);
        setTitle("Formumaire inscription");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }
}
