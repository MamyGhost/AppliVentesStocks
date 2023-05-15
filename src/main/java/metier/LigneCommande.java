package metier;

public class LigneCommande {

    int quantite;
    float montant;

    Produit produit;

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public LigneCommande(int quantite, float montant, Produit produit) {
        this.quantite = quantite;
        this.montant = montant;
        this.produit = produit;
    }
    
}
