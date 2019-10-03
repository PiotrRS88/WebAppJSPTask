package com.taskwebapp.service;

import com.taskwebapp.dao.ColumnDao;
import com.taskwebapp.entity.ColumnEntity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class ColumnServiceImplTest {
    @InjectMocks
    ColumnService columnService = new ColumnServiceImpl();

    @Mock
    ColumnDao columnDao;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void findAllByParam() {
        //given
        List<ColumnEntity> list = new ArrayList<>();
        ColumnEntity columnEntity = new ColumnEntity();
        columnEntity.setId(1);
        columnEntity.setKolumna1("wartosc1");
        columnEntity.setKolumna2("wartosc2");
        columnEntity.setKolumna3("wartosc3");
        columnEntity.setKolumna4(4);
        list.add(columnEntity);
        //when
        when(columnDao.findByKolumna1(true)).thenReturn(list);
        //then
        List<ColumnEntity> columnEntityList = columnService.findAllByParam("kolumna1", true);

        assertEquals(1, columnEntityList.size());
    }
}