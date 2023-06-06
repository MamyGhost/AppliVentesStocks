package controleur;
import metier.*;

public class Session {
    private EnumTypeEcran typeEcran;
    private Client leClientIdentifie;
    private Commande laCommande;

    public TraiterConnexionReponse traiterConnexion() {
        return new TraiterConnexionReponse(EnumTypeEcran.ECRAN_ACCUEIL);
    }

    public TraiterIdentificationReponse traiterIdentification(String ps, String mdp) {
        Client leClient = Client.rechercherClientParPseudo(ps, mdp);
        Produit leProduit = Produit.rechercherProduitDuJour();
        TraiterIdentificationReponse reponse = new TraiterIdentificationReponse(EnumTypeEcran.ECRAN_ACCUEIL_PERSO, leClient, leProduit);

        return reponse;

    }

    public TraiterAjoutPanierReponse traiterAjoutProduitPanier(Produit leProduit, int quantite) {
        Commande laCommande = new Commande();
        laCommande.ajouterProduit(leProduit, quantite);
        TraiterAjoutPanierReponse reponse = new TraiterAjoutPanierReponse(EnumTypeEcran.ECRAN_PANIER, laCommande);

        return reponse;
    }
    
    public TraiterAffichageCatalogueReponse traiterAffichageCatalogue(){
        Produit leProduit = Produit.afficherCatalogue();
        TraiterAffichageCatalogueReponse reponse = new TraiterAffichageCatalogueReponse(EnumTypeEcran.ECRAN_CATALOGUE, leProduit);
        return reponse;
    }
    
    public TraiterAjoutPanierReponse traiterAjoutProduitPanierExistant (Produit leProduit, int quantite){
        Commande laCommande = Commande.recupererPanier();
        System.out.println("********************************"+laCommande);
        laCommande.ajouterProduitPanier(leProduit, quantite, laCommande);
        TraiterAjoutPanierReponse reponse = new TraiterAjoutPanierReponse(EnumTypeEcran.ECRAN_PANIER, laCommande);
        return reponse;
    }

}
