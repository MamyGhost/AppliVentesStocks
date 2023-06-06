package metier;

import java.util.ArrayList;
import java.util.List;

public class Commande {

    private String numero; //identifiant
    private List<LigneCommande> lesLignesCommande;
    private Client client;
    
    private static List<Commande> lesCommandes;

    public Commande() {
        this.lesLignesCommande = new ArrayList<LigneCommande>();
        lesCommandes.add(this);
    }

    public void ajouterProduit(Produit leProduit, int quantiteCommandee) {
        // tester qu'il n'existe pas déjà une ligne de commande avec ce produit
        this.lesLignesCommande.add(new LigneCommande(leProduit, quantiteCommandee));
        leProduit.retirerDuStock(quantiteCommandee);
    }

    public float getMontant() {
        float montant = 0;
        for (LigneCommande lc : this.lesLignesCommande) {
            montant += lc.getMontant();
        }
        return montant;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<LigneCommande> getLesLignesCommande() {
        return lesLignesCommande;
    }
    
    public static void initializeCommandes() {
        lesCommandes = new ArrayList<Commande>();
    }

}
