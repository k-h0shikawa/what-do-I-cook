package com.example.whatdoieat.dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.whatdoieat.entity.MenuEntity;

@Mapper

public interface MenuMapper {
    public List<MenuEntity> search();

    public List<MenuEntity> canMakeMenus();
}
