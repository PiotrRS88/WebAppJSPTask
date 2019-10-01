package service;

import dao.ColumnsDao;
import entity.Columns;

import javax.annotation.Resource;
import java.util.List;

public class ColumnServiceImpl implements ColumnsService{
    @Resource
    ColumnsDao columnsDao;

    @Override
    public List<Columns> findAll() {
        return columnsDao.findAll();
    }
}
