package com.sinda.stocks.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sinda.stocks.entities.Categorie;
import com.sinda.stocks.repos.CategorieRepository;
import com.sinda.stocks.service.ArticleService;


@RestController
@RequestMapping("/api/categories")
@CrossOrigin
public class CategorieRESTController {
	@Autowired CategorieRepository catRep;
	@Autowired ArticleService articleService;
	@RequestMapping(path = "all",method = RequestMethod.GET)
	public List<Categorie> getAllCategories() {
		return catRep.findAll();
	}
	
	@RequestMapping(value="/categories/{id}",method = RequestMethod.DELETE)
	public void deleteCategorie(@PathVariable("id") Long id)
	{
		articleService.deleteCategorieById(id);
	}
}
