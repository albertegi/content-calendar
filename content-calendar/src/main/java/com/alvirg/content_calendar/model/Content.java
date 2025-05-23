package com.alvirg.content_calendar.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public record Content(
        Integer id,

        @NotBlank(message = "Title is mandatory")
        @Size(max = 100, message = "Title must not exceed 100 characters")
        String title,

        @NotBlank(message = "Description is mandatory")
        @Size(max = 500, message = "Description must not exceed 500 characters")
        String description,

        @NotNull(message = "Status is required")
        Status status,

        @NotNull(message = "Content type is required")
        Type contentType,

        @NotNull(message = "Creation date is required")
        @PastOrPresent(message = "Creation date cannot be in the future")
        LocalDateTime dateCreated,

        @PastOrPresent(message = "Update date cannot be in the future")
        LocalDateTime dateUpdated,

        @Size(max = 2048, message = "URL must not exceed 2048 characters")
        String url
) {

}
