package tn.tuniprob.gestionmagasin.services;

import tn.tuniprob.gestionmagasin.models.Produit;
import java.util.*;

public class ProduitService {
    List<Produit> produits = new ArrayList<>();

    public void addProduit(Produit produit){
        produits.add(produit);
    }

    public void afficher(){
        for(Produit produit : produits){
            System.out.println(produit.toString());
        }
    }
}