package com.example.typeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import com.example.whatdoieat.entity.OwnIngredientEntity;

public class OwnIngredientTypeHandler extends BaseTypeHandler<OwnIngredientEntity>{

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, OwnIngredientEntity parameter, JdbcType jdbcType)
        throws SQLException {
      ps.setString(i, parameter.getOwnIngredientName());
    }
  
    @Override
    public OwnIngredientEntity getNullableResult(ResultSet rs, String columnName) throws SQLException {
      OwnIngredientEntity ownIngredient = new OwnIngredientEntity();
      ownIngredient.setOwnIngredientName(rs.getString(columnName));
      return ownIngredient;
    }

    @Override
    public OwnIngredientEntity getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
      OwnIngredientEntity ownIngredient = new OwnIngredientEntity();
      ownIngredient.setOwnIngredientName(rs.getString(columnIndex));
      return ownIngredient;
    }
  
    @Override
    public OwnIngredientEntity getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
      OwnIngredientEntity ownIngredient = new OwnIngredientEntity();
      ownIngredient.setOwnIngredientName(cs.getString(columnIndex));
      return ownIngredient;
    }
    
}
