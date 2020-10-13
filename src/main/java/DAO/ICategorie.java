package DAO;

import Entites.Categorie;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ICategorie{
    public List<Categorie> findAll();
    public int add(Categorie c);
    public Categorie findByIdCategorie();
    public void edit(Categorie c);
    public void delete(Categorie c);
}