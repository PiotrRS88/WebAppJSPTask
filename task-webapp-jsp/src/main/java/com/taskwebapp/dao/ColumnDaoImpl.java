package com.taskwebapp.dao;

import com.taskwebapp.entity.ColumnEntity;
import com.taskwebapp.mapper.ColumnRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

import static java.lang.String.format;

@Repository
public class ColumnDaoImpl implements ColumnDao {
    NamedParameterJdbcTemplate template;

    String findInColumn = "SELECT *\n" +
            "FROM tabela_testowa\n" +
            "WHERE %1$s IN (SELECT %1$s\n" +
            "                      FROM tabela_testowa \n" +
            "                      GROUP BY %1$s \n" +
            "                      HAVING COUNT(%1$s) %2$s);";

    public ColumnDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public List<ColumnEntity> findByKolumna1(boolean unique) {
        final String count = unique ? "= 1" : "> 1";
        final String sql = format(findInColumn, "kolumna1", count);
        return template.query(sql, new ColumnRowMapper());
    }

    @Override
    public List<ColumnEntity> findByKolumna2(boolean unique) {
        final String count = unique ? "= 1" : "> 1";
        final String sql = format(findInColumn, "kolumna2", count);
        return template.query(sql, new ColumnRowMapper());
    }

    @Override
    public List<ColumnEntity> findByKolumna3(boolean unique) {
        final String count = unique ? "= 1" : "> 1";
        final String sql = format(findInColumn, "kolumna3", count);
        return template.query(sql, new ColumnRowMapper());
    }

    @Override
    public List<ColumnEntity> findByKolumna4(boolean unique) {
        final String count = unique ? "= 1" : "> 1";
        final String sql = format(findInColumn, "kolumna4", count);
        return template.query(sql, new ColumnRowMapper());
    }
}
