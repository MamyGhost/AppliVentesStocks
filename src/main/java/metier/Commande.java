package metier;


import java.util.ArrayList;

public class Commande {
    float montant;
    EnumStatutCode statut;
    ArrayList<LigneCommande> lesLignesCommande;
    static ArrayList<Commande> lesCommandes;

    public Commande() {
        this.lesLignesCommande=new ArrayList<>();
        this.montant = 0;
    }
    public float getMontant() {
        return montant;
    }

    public void setMontant(float commande) {
        this.montant = commande;
    }

    public EnumStatutCode getStatut() {
        return statut;
    }

    public void setStatut(EnumStatutCode statut) {
        this.statut = statut;
    }

    public ArrayList<LigneCommande> getLesLignesCommande() {
        return lesLignesCommande;
    }

    public void ajouterProduit(Produit produit,int quantite){
        LigneCommande ligneCommande=new LigneCommande(quantite,(produit.prix*quantite),produit);
        this.lesLignesCommande.add(ligneCommande);
        produit.retirerDuStock(quantite);
        this.montant = this.montant + (produit.prix*quantite);
    }

    public Commande creerPanier(){
        Commande panier =  new Commande();
        lesCommandes.add(panier);
        return panier;
    }

    
    public static void initializeCommandes(){
        lesCommandes=new ArrayList<>();
    }
    
    
}
