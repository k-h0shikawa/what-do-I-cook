package com.example.whatdoieat.dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.whatdoieat.entity.MenuEntity;
import com.example.whatdoieat.entity.OwnIngredientEntity;
import com.example.whatdoieat.entity.OwnIngredientsEntity;

@Mapper
public interface MenuMapper {
    public List<MenuEntity> search();

    public List<MenuEntity> canMakeMenus(List<OwnIngredientEntity> ownIngredientEntity);

}
