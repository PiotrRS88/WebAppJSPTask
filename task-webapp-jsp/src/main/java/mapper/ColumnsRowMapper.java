package mapper;

import entity.Columns;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ColumnsRowMapper implements RowMapper<Columns> {
    @Override
    public Columns mapRow(ResultSet resultSet, int i) throws SQLException {
        Columns columns = new Columns();
        columns.setId(resultSet.getInt("id"));
        columns.setKolumna1(resultSet.getString("kolumna1"));
        columns.setKolumna2(resultSet.getString("kolumna2"));
        columns.setKolumna3(resultSet.getString("kolumna3"));
        columns.setKolumna4(resultSet.getInt("kolumna4"));

        return columns;
    }
}
