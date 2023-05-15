package vue;

/*import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;*/


import controleur.*;
import metier.*;

public class VueJetable {

    static Session laSession;

    public static void main(String[] args) {
        initialize();

        laSession = new Session();
        TraiterConnexionReponse reponse = laSession.traiterConnexion();
        if (reponse.typeEcran == EnumTypeEcran.ECRAN_ACCUEIL) {
            afficherEcranAccueil();
        }

    }

    private static void afficherEcranAccueil() {
        EcranAccueil ecranAccueil = new EcranAccueil(laSession);
        ecranAccueil.setVisible(true);
    }


    private static void initialize(){
        Client.initializeClients();
        Produit.initializeProduits();
        Commande.initializeCommandes();
    }
}
