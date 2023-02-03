package com.example.whatdoieat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.whatdoieat.dao.MenuMapper;
import com.example.whatdoieat.entity.MenuEntity;
import com.example.whatdoieat.entity.OwnIngredientEntity;

@Service
public class MenuService {

    @Autowired
    private MenuMapper menuMapper;

    public List<MenuEntity> fetchMenu(){
        return menuMapper.search();
    }

    public List<MenuEntity> fetchCanMakeMenus(OwnIngredientEntity ownIngredientEntity) {
        return menuMapper.canMakeMenus(ownIngredientEntity);

    }
}
