package com.sinda.stocks.service;

import java.util.List;

import com.sinda.stocks.entities.Article;
import com.sinda.stocks.entities.Categorie;

public interface ArticleService {
	Article saveArticle(Article a);
	Categorie saveCategorie(Categorie C);
	Article updateArticle(Article a);
	Categorie updateCat(Categorie cat);

	void deleteArticle(Article a);
	

	void deleteArticleById(Long id);

	Article getArticle(Long id);
	Categorie getCategorie(Long id);

	List<Article> getAllArticles();

	List<Article> findByNomArticle(String nom);
	List<Categorie> findByNomCat(String nom);

	List<Article> findByNomArticleContains(String nom);

	List<Article> findByNomMarque(String nom, String marque);

	List<Article> findByCategorie(Categorie categorie);

	List<Article> findByCategorieIdCat(Long id);

	

	void deleteCategorieById(Long id);
}
