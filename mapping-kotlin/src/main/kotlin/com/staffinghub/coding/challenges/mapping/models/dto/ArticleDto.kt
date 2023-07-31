package com.staffinghub.coding.challenges.mapping.models.dto

import com.staffinghub.coding.challenges.mapping.models.dto.blocks.ArticleBlockDto

data class ArticleDto(
    var id: Long,
    var title: String,
    var description: String,
    var author: String,
    var blocks: Collection<ArticleBlockDto>
)
