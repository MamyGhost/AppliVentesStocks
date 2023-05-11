/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

public class Client {


    String nom;
    String prenom;
    String pseudo;

    public String getPseudo() {
        return pseudo;
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
    String motDePasse;
    
    public Client(String nom, String prenom, String pseudo, String motDePasse) {
        this.nom = nom;
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
    }

    public Client() {
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public static Client[] initializeClients(){
        Client[] clients = new Client[3];
        clients[0]=new Client("Dupond","Marie","Dupont","dupont01");
        clients[1]=new Client("Durant","Jean","Durant","durant02");
        clients[2]=new Client("Dupuis","Charles","Dupuis","dupuis03");
        return clients;
    }
    
    public Client rechercherClientParPseudo(String pseudo, String motDePasse){
        Client[] clients = Client.initializeClients();
        for(int i=0; i<clients.length; i++){
            if (clients[i].getPseudo().compareTo(pseudo)== 0
                    && clients[i].getMotDePasse().compareTo(motDePasse)==0){
                return clients[i];
            }
        }
        return null;
    }
    
}
