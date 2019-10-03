package com.taskwebapp.mapper;

import com.taskwebapp.entity.ColumnEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ColumnRowMapper implements RowMapper<ColumnEntity> {
    @Override
    public ColumnEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        ColumnEntity columnEntity = new ColumnEntity();
        columnEntity.setId(resultSet.getInt("id"));
        columnEntity.setKolumna1(resultSet.getString("kolumna1"));
        columnEntity.setKolumna2(resultSet.getString("kolumna2"));
        columnEntity.setKolumna3(resultSet.getString("kolumna3"));
        columnEntity.setKolumna4(resultSet.getInt("kolumna4"));

        return columnEntity;
    }
}
