/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.easyconference.domain.service;

import com.easyconference.domain.entities.Article;
import java.util.List;

/**
 *
 * @author Ashlee Campaz
 */
public class ArticleService {
    private IArticleService IarticleService; 
    
    public ArticleService(IArticleService IarticleService ){
    
        this.IarticleService = IarticleService;
    }
    
    public boolean subirArticulo(Article objArticle){
        return IarticleService.almacenarArticulos(objArticle);
    }
    
    public List<Article> listarArticle(){
        return IarticleService.listarArticulos();
    }
}
