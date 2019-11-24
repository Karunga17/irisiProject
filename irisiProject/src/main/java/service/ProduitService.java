package service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Produit;

public class ProduitService {
	public List<Produit> findAll(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("db_produits");
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        String sql = "SELECT p from Produit p";
        Query query = entityManager.createQuery(sql);
        ArrayList<Produit> produits =  (ArrayList<Produit>) query.getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        factory.close();
        return produits;
	}
}
