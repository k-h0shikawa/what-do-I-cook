package com.example.whatdoieat.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OwnIngredientsEntity {

    @JsonProperty("ownIngredients")
    private List<OwnIngredientEntity> ownIngredients;

}
