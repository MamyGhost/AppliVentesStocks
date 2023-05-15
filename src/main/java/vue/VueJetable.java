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

import java.text.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controleur.*;
import metier.*;

public class VueJetable {

    static Session laSession;
    static JFrame frame;

    public static void main(String[] args) {
        initialize();

        laSession = new Session();
        TraiterConnexionReponse reponse = laSession.traiterConnexion();
        if (reponse.typeEcran == EnumTypeEcran.ECRAN_ACCUEIL) {
            afficherEcranAccueil();
        }

    }

    private static void afficherEcranAccueil() {
        frame = new JFrame();
        frame.setTitle("French Chic - Accueil");
        frame.setSize(650, 500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        JPanel accueilPanel = new JPanel();
        accueilPanel.setBackground(Color.WHITE);
        frame.setContentPane(accueilPanel);
        frame.setLayout(null);
        //initialiserPanel(); 
        
        JLabel title = new JLabel();
        JPasswordField mdpField = new JPasswordField();
        JLabel pseudoLabel = new JLabel();
        JLabel mdpLabel = new JLabel();
        JTextField pseudoField = new JTextField();
        JButton login = new JButton();


        title.setFont(new java.awt.Font("Brush Script MT", 0, 48)); // NOI18N
        title.setForeground(new java.awt.Color(246, 43, 233));
        title.setText("French Chic");

        pseudoLabel.setText("Pseudo");

        mdpLabel.setText("Mot de passe");

        login.setForeground(new java.awt.Color(255, 0, 255));
        login.setText("S'identifier");
        login.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 43, 233), 1, true));
        login.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                TraiterIdentificationReponse reponse = laSession.traiterIdentification(pseudoField.getText(), mdpField.getText());
                frame.setVisible(false);
                if (reponse.typeEcran == EnumTypeEcran.ECRAN_ACCUEIL_PERSO) {
                    afficherEcranAccueilPerso(reponse.leClient, reponse.leProduit);
                    
                }
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(200, 200, 200))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mdpField, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mdpLabel)
                                .addGap(219, 219, 219))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pseudoLabel)
                                .addComponent(pseudoField, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(title)
                .addGap(33, 33, 33)
                .addComponent(pseudoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pseudoField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mdpLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mdpField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );


        frame.add(title);
        frame.add(pseudoLabel);
        frame.add(mdpLabel);
        frame.add(pseudoField);
        frame.add(mdpField);
        frame.add(login);
        frame.setVisible(true);

    }

    private static void afficherEcranAccueilPerso(final Client client, final Produit produit) {
        EcranAccueilPerso ecranAccueil = new EcranAccueilPerso(client, produit);
        ecranAccueil.setVisible(true);
    }

    
    
    private static void initialize(){
        Client.initializeClients();
        Produit.initializeProduits();
    }
}
