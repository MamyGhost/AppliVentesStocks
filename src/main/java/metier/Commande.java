package metier;

import controleur.EnumStatutCode;

import java.util.ArrayList;
import java.util.List;

public class Commande {
    float montant;
    EnumStatutCode status;

    List<LigneCommande> lesCommandes;

    public float getMontant() {
        return montant;
    }

    public void setMontant(float commande) {
        this.montant = commande;
    }

    public EnumStatutCode getStatus() {
        return status;
    }

    public void setStatus(EnumStatutCode status) {
        this.status = status;
    }

    public List<LigneCommande> getLesCommandes() {
        return lesCommandes;
    }

    public void setLesCommandes(List<LigneCommande> lesCommandes) {
        this.lesCommandes = lesCommandes;
    }


    public void ajouterProduit(Produit produit,int quantite){
        LigneCommande ligneCommande=new LigneCommande(quantite,(produit.prix*quantite),produit);
        lesCommandes.add(ligneCommande);
        this.montant = this.montant + (produit.prix*quantite);

    }

   public static Commande creerPanier(){
        return new Commande();
    }

    public Commande() {
        lesCommandes=new ArrayList<LigneCommande>();
    }
}
