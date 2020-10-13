package DAO;

import Entites.Categorie;
import Entites.Produit;

import java.util.List;

public interface IProduit{

    public List<Produit> findAll();
    public int add(Produit p);
    public Produit findById(int id);
    public List<Produit> findByCategorie(Categorie c);
    public void edit(Produit p);
    public void delete(Produit p);

}