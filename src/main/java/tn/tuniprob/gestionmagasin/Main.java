package tn.tuniprob.gestionmagasin;

import tn.tuniprob.gestionmagasin.models.Magasin;
import tn.tuniprob.gestionmagasin.models.Produit;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
       Magasin magasin1 = new Magasin(1, "Rue Habib Bourguiba, Tunis", 50);
       Magasin magasin2 = new Magasin(2, "Avenue de la République, Sfax", 50);
       Produit produit1 = new Produit();
       Produit produit2 = new Produit(1021, "Lait","Delice");
       Produit produit3 = new Produit(2510, "Yaourt","Vitalait");
       Produit produit4 = new Produit(3250, "Tomate","Sicam", 1200);

       System.out.println(produit1.afficher());
       System.out.println(produit2.afficher());
       System.out.println(produit3.afficher());
       System.out.println(produit4.afficher());

       produit2.setPrix(0.700);
       System.out.println(produit2.afficher());

       produit1.setId(5000);
       produit1.setLibelle("Beurre");
       produit1.setMarque("Président");
       produit1.setPrix(3.200);

       produit2.setPrix(0.500);
       produit3.setPrix(0.700);

       System.out.println(produit1.afficher());
       System.out.println(produit2.afficher());
       System.out.println(produit3.afficher());
       System.out.println(produit4.afficher());

       System.out.println(produit1.toString());
       System.out.println(produit2.toString());
       System.out.println(produit3.toString());
       System.out.println(produit4.toString());

       produit1.setDateExpiration(new Date());
       produit2.setDateExpiration(new Date());
       produit3.setDateExpiration(new Date());
       produit4.setDateExpiration(new Date());

       System.out.println("\nProduits avec date d’expiration:");

       System.out.println(produit1.afficher());
       System.out.println(produit2.afficher());
       System.out.println(produit3.afficher());
       System.out.println(produit4.afficher());

       magasin1.ajouterProduit(produit1);
       magasin1.ajouterProduit(produit2);

       magasin2.ajouterProduit(produit3);
       magasin2.ajouterProduit(produit4);

       magasin1.afficherMagasin();
       magasin2.afficherMagasin();
    }
}
