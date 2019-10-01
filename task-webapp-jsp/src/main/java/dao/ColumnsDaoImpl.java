package dao;

import entity.Columns;
import mapper.ColumnsRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;

public class ColumnsDaoImpl implements ColumnsDao {
    NamedParameterJdbcTemplate template;

    public ColumnsDaoImpl(NamedParameterJdbcTemplate template){
        this.template = template;
    }

    @Override
    public List<Columns> findAll() {
        return template.query("SELECT * FROM tabela_testowa", new ColumnsRowMapper());
    }
}
