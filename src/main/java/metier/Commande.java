package metier;


import java.util.ArrayList;
import java.util.List;

class EnumStatutCode {
    
}

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

    public List<LigneCommande> getLesLignesCommande() {
        return lesCommandes;
    }

    public void setLesLignesCommande(List<LigneCommande> lesCommandes) {
        this.lesCommandes = lesCommandes;
    }


    public void ajouterProduit(Produit produit,int quantite){
        LigneCommande ligneCommande=new LigneCommande(quantite,(produit.prix*quantite),produit);
        lesCommandes.add(ligneCommande);
        produit.setQuantiteEnStock(produit.getQuantiteEnStock()-quantite);
        this.montant = this.montant + (produit.prix*quantite);

    }
/*
   public static Commande creerPanier(){
        return new Commande();
    }*/

    public Commande() {
        this.lesCommandes=new ArrayList<LigneCommande>();
        this.montant = 0;
    }
    
    public static List<Commande> initializeCommandes(){
        List<Commande> init =new ArrayList<Commande>();
        Commande laCommande = new Commande();
        laCommande.ajouterProduit(Produit.initializeProduits()[1],2);
        init.add(laCommande);
        return init;
    }
}
