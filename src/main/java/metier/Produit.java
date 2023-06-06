package metier;

import java.util.ArrayList;
import java.util.List;

public class Produit {
	private String nom;
	private float prix;
	private int quantiteStock;
        private boolean estDuJour; 
	
	private static List<Produit> lesProduits;
	
	public Produit(String nom, float prix, int qteStock, boolean estDuJour){
            this.nom = nom;
            this.prix = prix;
            this.quantiteStock = qteStock;
            this.estDuJour = estDuJour;
	}
        
        public static Produit rechercherProduitDuJour(){
            Produit leProduit = lesProduits.get(0);
            if (leProduit.estDuJour) return leProduit;
            else return null;
	}
	
	public void retirerDuStock(int qte){
            this.quantiteStock = this.quantiteStock-qte;
        }
	
	public String getNom() {
            return nom;
	}

	public void setNom(String nom) {
            this.nom = nom;
	}

	public float getPrix() {
            return prix;
	}

	public void setPrix(float prix) {
            this.prix = prix;
	}

	public int getQuantiteStock() {
		return quantiteStock;
	}
        
        public boolean estDujour(){
            return this.estDuJour;
        }

 public static void initializeProduits() {
        lesProduits = new ArrayList<Produit>();
        Produit leProduit = new Produit("Pantalon zouk",50,10, true);
        lesProduits.add(leProduit);
        Produit leDeuxiemeProduit = new Produit("Sac LV Neverfull MM ",2160,4, false);
        lesProduits.add(leDeuxiemeProduit);

    }	
	
}
