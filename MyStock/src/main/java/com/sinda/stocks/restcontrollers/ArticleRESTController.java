package com.sinda.stocks.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sinda.stocks.entities.Article;
import com.sinda.stocks.entities.Categorie;
import com.sinda.stocks.service.ArticleService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ArticleRESTController {
	@Autowired
	ArticleService articleService;
	
	@RequestMapping(path = "all",method = RequestMethod.GET)
	public List<Article> getAllArticles() {
	return articleService.getAllArticles();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Article getArticleById(@PathVariable("id") Long id) {
	return articleService.getArticle(id);
	 }
	@RequestMapping(value="/cat/{id}",method = RequestMethod.GET)
	public Categorie getCatById(@PathVariable("id") Long id) {
	return articleService.getCategorie(id);
	 }
	@RequestMapping(method = RequestMethod.POST)
	public Article createArticle(@RequestBody Article article) {
	return articleService.saveArticle(article);
	}
	
	@RequestMapping(value="/categorie",method = RequestMethod.POST)
	public Categorie createCategorie(@RequestBody Categorie cat) {
	return articleService.saveCategorie(cat);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Article updateArticle(@RequestBody Article article) {
	return articleService.updateArticle(article);
	}
	
	@RequestMapping(value="/categorie",method = RequestMethod.PUT)
	public Categorie updateCategorie(@RequestBody Categorie cat) {
	return articleService.updateCat(cat);
	}

	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteArticle(@PathVariable("id") Long id)
	{
		articleService.deleteArticleById(id);
	}
	
	@RequestMapping(value="/categories/{id}",method = RequestMethod.DELETE)
	public void deleteCategorie(@PathVariable("id") Long id)
	{
		articleService.deleteCategorieById(id);
	}
	
	@RequestMapping(value="/prodscat/{idCat}",method = RequestMethod.GET)
	public List<Article> getArticlesByCatId(@PathVariable("idCat") Long idCat) {
	   return articleService.findByCategorieIdCat(idCat);
	}

	@RequestMapping(value = "/nom/{nomArticle}", method = RequestMethod.GET)
	public List<Article> getArticleByNomArt(@PathVariable("nomArticle") String nom) {
		return articleService.findByNomArticle(nom);
	}
    
	@RequestMapping(value = "/nomCat/{nomCat}", method = RequestMethod.GET)
	public List<Categorie> getCategorieByNomCat(@PathVariable("nomCat") String nom) {
		return articleService.findByNomCat(nom);
	}

}
