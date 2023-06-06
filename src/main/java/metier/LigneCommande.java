package metier;

public class LigneCommande {
	
	private int quantite;
        private float montant;
        private Produit leProduit;
	
	public LigneCommande(Produit leProduit,int quantite){
		this.leProduit = leProduit;
		this.quantite = quantite;
                this.montant = quantite * leProduit.getPrix();
	}
	
	public float getMontant(){
		return this.montant;
	}
	
	public Produit getProduit() {
		return leProduit;
	}

	public int getQuantite() {
		return quantite;
	}

}
