package metier;

import controleur.EnumStatutCode;

import java.util.ArrayList;
import java.util.List;

public class Commande {
    float commande;
    EnumStatutCode status;

    List<LigneCommande> lesCommandes;

    public float getCommande() {
        return commande;
    }

    public void setCommande(float commande) {
        this.commande = commande;
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


    void ajouterProduit(Produit produit,int quantite){
        LigneCommande ligneCommande=new LigneCommande(quantite,(produit.prix*quantite),produit);
        lesCommandes.add(ligneCommande);

    }

   public static Commande creerPanier(){
        return new Commande();
    }

    public Commande() {
        List<LigneCommande> list=new ArrayList<LigneCommande>();
    }
}
