package com.taskwebapp.dao;

import com.taskwebapp.entity.ColumnEntity;
import com.taskwebapp.mapper.ColumnsRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ColumnsDaoImpl implements ColumnsDao {
    NamedParameterJdbcTemplate template;

    public ColumnsDaoImpl(NamedParameterJdbcTemplate template){
        this.template = template;
    }

    @Override
    public List<ColumnEntity> findAll(String columnName) {
        String sql = "SELECT *\n" +
                "FROM tabela_testowa\n" +
                "WHERE " +  columnName + " IN (SELECT " + columnName + "\n" +
                "                      FROM tabela_testowa \n" +
                "                      GROUP BY " + columnName + " \n" +
                "                      HAVING COUNT(" + columnName +") > 1);";
        return template.query(sql, new ColumnsRowMapper());
    }
}
