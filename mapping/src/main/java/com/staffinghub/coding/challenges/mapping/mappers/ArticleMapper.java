package com.staffinghub.coding.challenges.mapping.mappers;

import com.staffinghub.coding.challenges.mapping.models.db.Article;
import com.staffinghub.coding.challenges.mapping.models.dto.ArticleDto;
import org.springframework.stereotype.Component;

@Component
public class ArticleMapper {

    public ArticleDto map(Article article){
        //TODO
        return new ArticleDto();
    }

    public Article map(ArticleDto articleDto) {
        // Nicht Teil dieser Challenge.
        return new Article();
    }
}
