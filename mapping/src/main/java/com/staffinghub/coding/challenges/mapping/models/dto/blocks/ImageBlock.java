package com.staffinghub.coding.challenges.mapping.models.dto.blocks;

import com.staffinghub.coding.challenges.mapping.models.dto.ImageDto;

public class ImageBlock extends ArticleBlockDto {

    private ImageDto image;

    public ImageDto getImage() {
        return image;
    }

    public void setImage(ImageDto image) {
        this.image = image;
    }
}
