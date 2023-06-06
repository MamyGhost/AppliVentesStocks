package controleur;
import metier.*;

public class TraiterIdentificationReponse {
	public EnumTypeEcran typeEcran;	
        public Client leClient;
        public Produit leProduit;
        public TraiterIdentificationReponse(EnumTypeEcran typeEcran, Client leClient, Produit leProduit){
        this.typeEcran = typeEcran;
        this.leClient = leClient; 
        this.leProduit = leProduit;
    }
}
