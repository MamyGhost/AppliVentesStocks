package metier;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private String numero; //identifiant
    private String nom;
    private String prenom;
    private String pseudo;
    private String motDePasse;

    private static List<Client> lesClients;

    public Client(String nom, String prenom, String pseudo, String mdp) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setPseudo(pseudo);
        this.setMotDePasse(mdp);
    }

    public static Client rechercherClientParPseudo(String pseudo, String motDePasse) {
        Client leClient = lesClients.get(0);
        if (leClient.getPseudo().equals(pseudo) && leClient.getMotDePasse().equals(motDePasse))
            return leClient;
        else return leClient;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPseudo() {
        return this.pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public static void initializeClients() {
        lesClients = new ArrayList<Client>();
        Client leClient = new Client("Dupond", "Marie", "Marie", "Marie");
        lesClients.add(leClient);
    }

}
