package com.example.whatdoieat.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class IngredientEntity {
    @JsonProperty("ingredientName")
    private String ingredientName;
}
