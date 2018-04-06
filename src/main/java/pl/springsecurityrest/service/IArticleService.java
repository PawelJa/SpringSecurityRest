package pl.springsecurityrest.service;

import org.springframework.security.access.annotation.Secured;
import pl.springsecurityrest.entity.Article;

import java.util.List;

public interface IArticleService {

    @Secured({"ROLE_ADMIN", "ROLE_USER"})
    List<Article> getAllArticles();

    @Secured ({"ROLE_ADMIN", "ROLE_USER"})
    Article getArticleById(int articleId);

    @Secured ({"ROLE_ADMIN"})
    boolean addArticle(Article article);

    @Secured ({"ROLE_ADMIN"})
    void updateArticle(Article article);

    @Secured ({"ROLE_ADMIN"})
    void deleteArticle(int articleId);
}
