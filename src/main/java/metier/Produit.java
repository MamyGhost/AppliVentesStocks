/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

public class Produit {

    public Produit() {
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
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

    public boolean isEstDuJour() {
        return estDuJour;
    }

    public void setEstDuJour(boolean estDuJour) {
        this.estDuJour = estDuJour;
    }

    public int getQuantiteEnStock() {
        return quantiteEnStock;
    }

    public void setQuantiteEnStock(int quantiteEnStock) {
        this.quantiteEnStock = quantiteEnStock;
    }

    public Produit(String reference, String libelle, float prix) {
        this.reference = reference;
        this.nom = libelle;
        this.prix = prix;
    }
    String reference;
    String nom;
    float prix;
    boolean estDuJour;
    int quantiteEnStock;
    
    public static Produit[] initializeProduits(){
        Produit[] produits = new Produit[3];
        produits[0] = new Produit("01","Pantalon cargo",50);
        produits[0].setEstDuJour(true);
        produits[0].setQuantiteEnStock(34);
        
        produits[1] = new Produit("02","Sac Lvt OpéraSM",40);
        produits[1].setQuantiteEnStock(10);
        
        produits[2] = new Produit("03","Cartable Easpak Zippl'R Camo",30);
        produits[2].setQuantiteEnStock(20);
        return produits;
    }
    
    public Produit rechercherProduitDuJour(){
        Produit[] produits = Produit.initializeProduits();
        for (int i=0; i<produits.length; i++){
            if (produits[i].isEstDuJour()){
                return produits[i];
            }
        }
        return null;
    }
    
    
}
