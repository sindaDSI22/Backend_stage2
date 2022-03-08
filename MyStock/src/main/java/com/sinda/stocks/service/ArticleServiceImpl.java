package com.sinda.stocks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinda.stocks.entities.Article;
import com.sinda.stocks.entities.Categorie;
import com.sinda.stocks.repos.ArticleRepository;
import com.sinda.stocks.repos.CategorieRepository;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	ArticleRepository articleRepository;
	@Autowired
	CategorieRepository categorieRepository;

	@Override
	public Article saveArticle(Article a) {
		return articleRepository.save(a);
	}

	@Override
	public Article updateArticle(Article a) {
		return articleRepository.save(a);
	}

	@Override
	public void deleteArticle(Article a) {
		articleRepository.delete(a);
		
	}

	@Override
	public void deleteArticleById(Long id) {
		articleRepository.deleteById(id);
		
	}

	@Override
	public Article getArticle(Long id) {
		
		return articleRepository.findById(id).get();
	}

	@Override
	public List<Article> getAllArticles() {
		return articleRepository.findAll();
	}

	@Override
	public List<Article> findByNomArticle(String nom) {
		return articleRepository.findByNomArticle(nom);
	}
	

	@Override
	public List<Article> findByNomArticleContains(String nom) {
		return articleRepository.findByNomArticleContains(nom);
	}

	@Override
	public List<Article> findByNomMarque(String nom, String marque) {
		return articleRepository.findByNomMarque(nom, marque);
	}

	@Override
	public List<Article> findByCategorie(Categorie categorie) {
		return articleRepository.findByCategorie(categorie);
	}

	@Override
	public List<Article> findByCategorieIdCat(Long id) {
		return articleRepository.findByCategorieIdCat(id);
	}

	
	@Override
	public void deleteCategorieById(Long id) {
		categorieRepository.deleteById(id);
		
	}

	@Override
	public Categorie saveCategorie(Categorie C) {
		return categorieRepository.save(C);
	}

	@Override
	public Categorie updateCat(Categorie cat) {
		return categorieRepository.save(cat);
	}

	@Override
	public Categorie getCategorie(Long id) {
		return categorieRepository.findById(id).get();
	}

	@Override
	public List<Categorie> findByNomCat(String nom) {
		return  categorieRepository.findByNomCat(nom);
	}

}
