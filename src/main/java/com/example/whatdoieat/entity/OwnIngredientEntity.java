package com.example.whatdoieat.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OwnIngredientEntity {

    @JsonProperty("ownIngredientName")
    private String ownIngredientName;

}
