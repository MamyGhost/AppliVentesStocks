/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

public class Produit {

    String reference;
    String nom;
    float prix;
    boolean estDuJour = false ;
    int quantiteEnStock;

    public Produit() {
    }

    public Produit(String reference, String libelle, float prix, int quantiteEnStock) {
        this.reference = reference;
        this.nom = libelle;
        this.prix = prix;
        this.quantiteEnStock = quantiteEnStock;
    }
    public String getReference() {
        return reference;
    }

    public String getNom() {
        return nom;
    }
    public float getPrix() {
        return prix;
    }

    public int getQuantiteEnStock() {
        return quantiteEnStock;
    }
    
    public static Produit[] initializeProduits(){
        Produit[] produits = new Produit[3];
        produits[0] = new Produit("01","Pantalon cargo",50,34);
        produits[0].estDuJour = true;
        produits[1] = new Produit("02","Sac Lvt OpéraSM",40,10);
        produits[2] = new Produit("03","Cartable Easpak Zippl'R Camo",30,20);
        return produits;
    }
    
    public static Produit rechercherProduitDuJour(){
        Produit[] produits = Produit.initializeProduits();
        for (Produit produit : produits) {
            if (produit.estDuJour) {
                return produit;
            }
        }
        return null;
    }
    
    
}
