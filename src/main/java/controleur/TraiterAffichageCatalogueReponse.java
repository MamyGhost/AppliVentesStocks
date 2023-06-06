/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controleur;

import metier.Produit;

/**
 *
 * @author Rotsy
 */
public class TraiterAffichageCatalogueReponse {
    public EnumTypeEcran typeEcran;
    public Produit leProduit;
    public TraiterAffichageCatalogueReponse(EnumTypeEcran typeEcran, Produit leProduit){
        this.typeEcran = typeEcran;
        this.leProduit = leProduit;
    }
}
