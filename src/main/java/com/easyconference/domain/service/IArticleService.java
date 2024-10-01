/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.easyconference.domain.service;

import com.easyconference.domain.entities.Article;
import java.util.List;

/**
 *
 * @author Ashlee Campaz
 */
public interface IArticleService {
    public void almacenarArticulos(Article objArticle);
    public List<Article> listarArticulos();
}
