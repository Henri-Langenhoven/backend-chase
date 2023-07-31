package com.staffinghub.coding.challenges.mapping.services

import com.staffinghub.coding.challenges.mapping.repositories.ArticleRepository
import com.staffinghub.coding.challenges.mapping.mappers.ArticleMapper
import com.staffinghub.coding.challenges.mapping.models.dto.ArticleDto
import org.springframework.stereotype.Service

@Service
class ArticleService(
    private val mapper: ArticleMapper,
) {
    fun list(): List<ArticleDto> {
        val articles = ArticleRepository.all()
        //TODO
        return emptyList()
    }

    fun articleForId(id: Long): ArticleDto {
        val article = ArticleRepository.findBy(id)
        //TODO
        return ArticleDto(0, "", "", "", emptyList())
    }

    fun create(articleDto: ArticleDto): ArticleDto {
        val article = mapper.map(articleDto)
        ArticleRepository.create(article)
        return mapper.map(article)
    }
}
