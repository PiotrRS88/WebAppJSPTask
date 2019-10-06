package com.taskwebapp.service;

import com.taskwebapp.dao.ColumnDao;
import com.taskwebapp.entity.ColumnEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.beans.HasPropertyWithValue.hasProperty;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ColumnServiceImplTest {
    @InjectMocks
    ColumnService columnService = new ColumnServiceImpl();

    @Mock
    ColumnDao columnDao;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @DisplayName("Kolumna1 - Should find all entities with unique values")
    @Test
    public void kolumna1_unique() {
        //given
        List<ColumnEntity> uniqueResultList = prepareUniqueResultList();
        //when
        when(columnDao.findByKolumna1(true)).thenReturn(uniqueResultList);
        List<ColumnEntity> columnEntityList = columnService.findAllByParam("kolumna1", true);

        //then
        assertAll("columnEntityList assertions",
                () -> assertEquals(1, columnEntityList.size()),
                () -> assertEquals(columnEntityList, uniqueResultList),
                () -> assertThat(columnEntityList, hasItems(
                        hasProperty("kolumna1", is("wartosc1")),
                        hasProperty("kolumna2", is("wartosc2")),
                        hasProperty("kolumna3", is("wartosc3"))
                )));
    }

    @DisplayName("Kolumna2 - Should find all entities with unique values")
    @Test
    public void kolumna2_unique() {
        //given
        List<ColumnEntity> uniqueResultList = prepareUniqueResultList();
        //when
        when(columnDao.findByKolumna2(true)).thenReturn(uniqueResultList);
        List<ColumnEntity> columnEntityList = columnService.findAllByParam("kolumna2", true);

        //then
        assertAll("columnEntityList assertions",
                () -> assertEquals(1, columnEntityList.size()),
                () -> assertEquals(columnEntityList, uniqueResultList),
                () -> assertThat(columnEntityList, hasItems(
                        hasProperty("kolumna1", is("wartosc1")),
                        hasProperty("kolumna2", is("wartosc2")),
                        hasProperty("kolumna3", is("wartosc3"))
                )));
    }

    @DisplayName("Kolumna3 - Should find all entities with unique values")
    @Test
    public void kolumna3_unique() {
        //given
        List<ColumnEntity> uniqueResultList = prepareUniqueResultList();
        //when
        when(columnDao.findByKolumna3(true)).thenReturn(uniqueResultList);
        List<ColumnEntity> columnEntityList = columnService.findAllByParam("kolumna3", true);

        //then
        assertAll("columnEntityList assertions",
                () -> assertEquals(1, columnEntityList.size()),
                () -> assertEquals(columnEntityList, uniqueResultList),
                () -> assertThat(columnEntityList, hasItems(
                        hasProperty("kolumna1", is("wartosc1")),
                        hasProperty("kolumna2", is("wartosc2")),
                        hasProperty("kolumna3", is("wartosc3"))
                )));
    }

    private List<ColumnEntity> prepareUniqueResultList() {
        List<ColumnEntity> list = new ArrayList<>();
        ColumnEntity columnEntity = new ColumnEntity();
        columnEntity.setId(1);
        columnEntity.setKolumna1("wartosc1");
        columnEntity.setKolumna2("wartosc2");
        columnEntity.setKolumna3("wartosc3");
        columnEntity.setKolumna4(4);
        list.add(columnEntity);
        return list;
    }
}