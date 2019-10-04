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

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.beans.HasPropertyWithValue.hasProperty;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
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
        List<ColumnEntity> columnEntityList = columnService.findAllByParam("kolumna1", true);

        //then
        assertAll("columnEntityList assertions",
                () -> assertEquals(1, columnEntityList.size()),
                () -> assertThat(columnEntityList, contains(columnEntity)),
                () -> assertThat(columnEntityList, contains(
                        hasProperty("kolumna1", is("wartosc1"))
                )));
    }

    // TODO jeśli List<ColumnEntity> columnEntityList = columnService.findAllByParam("kolumna1", true); a metoda jest findByKolumna2 listSize powinien = 0

    @Test
    public void findAllByParam12() {
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
        when(columnDao.findByKolumna2(true)).thenReturn(list);
        List<ColumnEntity> columnEntityList = columnService.findAllByParam("kolumna2", true);

        //then
        assertEquals(1, columnEntityList.size());
    }
}