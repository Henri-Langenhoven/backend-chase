package com.staffinghub.coding.challenges.mapping.mappers

import com.staffinghub.coding.challenges.mapping.models.db.Article
import com.staffinghub.coding.challenges.mapping.models.dto.ArticleDto
import org.springframework.stereotype.Component
import java.util.*

@Component
class ArticleMapper {
    fun map(article: Article?): ArticleDto {
        //TODO
        return ArticleDto(0, "", "", "", emptyList())
    }

    // Not part of the challenge / Nicht Teil dieser Challenge.
    fun map(articleDto: ArticleDto?): Article = Article(
        title = "An Article",
        blocks = emptySet(),
        id = 1,
        lastModified = Date()
    )
}
