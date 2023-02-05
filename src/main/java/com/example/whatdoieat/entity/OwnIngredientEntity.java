package com.example.whatdoieat.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OwnIngredientEntity {

    @JsonProperty("ownIngredientName")
    private String ownIngredientName;

}
