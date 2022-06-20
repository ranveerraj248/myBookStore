package com.store.book.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "BookDto", description = "All details about book")
public class BookDto {

    @ApiParam(
            value = "UUID",
            type = "UUID",
            example = "b5607d38-8fc1-43ef-b44e-34967083c80a",
            required = true
    )
    private UUID id;

    @ApiParam(
            value = "title",
            type = "String",
            example = "Book Title",
            required = true
    )
    private String title;

    @ApiParam(
            value = "description",
            type = "String",
            example = "Book Description",
            required = true
    )
    private String description;

    @ApiParam(
            value = "releaseYear",
            type = "int",
            example = "2020",
            required = true
    )
    private int releaseYear;
}
