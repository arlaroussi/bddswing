package view;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Accueil extends JFrame {
    private JMenuBar MenuBar;

    public Accueil(JMenuBar menuBar, JFormattedTextField JFtxt) throws  ParseException{
        MenuBar = menuBar;
        this.JFtxt = JFtxt;
        MaskFormatter mask = new MaskFormatter("###-##-###");
        mask.install(JFtxt);
    }

        private JFormattedTextField JFtxt;


    private void createUIComponents() throws ParseException {
            MaskFormatter mf1 = new MaskFormatter("##-##-##-##");
            //this.JFtxt.setFormatterFactory;
    }


}
