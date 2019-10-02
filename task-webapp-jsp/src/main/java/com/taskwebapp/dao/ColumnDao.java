package com.taskwebapp.dao;

import com.taskwebapp.entity.ColumnEntity;

import java.util.List;

public interface ColumnDao {
    List<ColumnEntity> findByKolumna1(boolean unique);

    List<ColumnEntity> findByKolumna2(boolean unique);

    List<ColumnEntity> findByKolumna3(boolean unique);

    List<ColumnEntity> findByKolumna4(boolean unique);


}
