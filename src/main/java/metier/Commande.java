package metier;

import controleur.EnumStatutCode;

public class Commande {
    float commande;
    EnumStatutCode status;

    Commande[] lesCommandes;

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

    public Commande[] getLesCommandes() {
        return lesCommandes;
    }

    public void setLesCommandes(Commande[] lesCommandes) {
        this.lesCommandes = lesCommandes;
    }


    void ajouterProduit(Produit produit,int quantite){

    }

    Commande creerPanier(){
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }
}
