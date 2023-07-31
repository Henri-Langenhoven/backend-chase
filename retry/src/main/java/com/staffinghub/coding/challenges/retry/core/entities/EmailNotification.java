package com.staffinghub.coding.challenges.retry.core.entities;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class EmailNotification {

    @NotBlank
    private String recipient;

    @NotBlank
    private String subject;

    @NotBlank
    private String text;
}
