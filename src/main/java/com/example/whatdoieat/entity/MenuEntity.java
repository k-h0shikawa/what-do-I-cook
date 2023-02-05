package com.example.whatdoieat.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MenuEntity {
    @JsonProperty("id")
    private long id;

    @JsonProperty("menuName")
	private String menuName;

    @JsonProperty("ingredients")
	private List<IngredientEntity> ingredients;
}
