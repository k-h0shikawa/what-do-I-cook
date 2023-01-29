package com.example.whatdoieat.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IngredientEntity {

    
    @JsonProperty("ingredientId")
	private String ingredientId;

    @JsonProperty("ingredientName")
	private String ingredientName;
}
