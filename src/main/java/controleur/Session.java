package controleur;

import metier.Client;
import metier.Produit;

public class Session {

    public TraiterConnexionReponse traiterConnexion(){
        TraiterConnexionReponse retour = new TraiterConnexionReponse();
        retour.typeEcran = EnumTypeEcran.ECRAN_ACCUEIL;
        return retour;
    }
    
    public TraiterIdentificationReponse traiterIdentification(String pseudo, String mdp){
        Client leclient = Client.rechercherClientParPseudo(pseudo, mdp);
        Produit leProduit = Produit.rechercherProduitDuJour();
        TraiterIdentificationReponse retour = new TraiterIdentificationReponse();
        retour.typeEcran = EnumTypeEcran.ECRAN_ACCUEIL_PERSO;
        retour.leClient = leclient;
        retour.leProduit = leProduit;
        return retour;
    }
}
