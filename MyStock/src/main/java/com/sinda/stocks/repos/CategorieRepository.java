package com.sinda.stocks.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinda.stocks.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long>{
	List<Categorie> findByNomCat(String nom);
}