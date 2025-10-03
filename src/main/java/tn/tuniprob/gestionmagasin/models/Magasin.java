package tn.tuniprob.gestionmagasin.models;

public class Magasin {
    private int id;
    private String address;
    private int capacite;
    private Produit[] produits;
    private int totalProduitsMagazin = 0;
    private static int totalProduits = 0;

    public Magasin() {
        this.capacite = 50;
        this.produits = new Produit[capacite];
    }

    public Magasin(int id, String address, int capacite) {
        this.id = id;
        this.address = address;
        this.capacite = Math.min(capacite, 50);
        this.produits = new Produit[this.capacite];
    }

    public void ajouterProduit(Produit produit) {
        if (totalProduitsMagazin < capacite) {
            produits[totalProduitsMagazin++] = produit;
            totalProduits++;
        }else{
            System.out.println("Le magasin est plein ! Impossible d'ajouter plus de produits.");
        }
    }

    public void afficherMagasin() {
        System.out.println("Magasin");
        System.out.println("ID : " + id);
        System.out.println("Adresse : " + address);
        System.out.println("Capacité : " + capacite);
        System.out.println("Produits :");
        for (int i = 0; i < totalProduitsMagazin; i++) {
            System.out.println(produits[i].afficher());
        }
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacite() {
        return capacite;
    }

    public Produit[] getProduits() {
        return produits;
    }

    public int getTotalProduitsMagazin() {
        return totalProduitsMagazin;
    }

    public static int getTotalProductCount() {
        return totalProduits;
    }
}
