package com.taskwebapp.entity;

public class ColumnEntity {
    int id;
    String kolumna1;
    String kolumna2;
    String kolumna3;
    int kolumna4;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKolumna1() {
        return kolumna1;
    }

    public void setKolumna1(String kolumna1) {
        this.kolumna1 = kolumna1;
    }

    public String getKolumna2() {
        return kolumna2;
    }

    public void setKolumna2(String kolumna2) {
        this.kolumna2 = kolumna2;
    }

    public String getKolumna3() {
        return kolumna3;
    }

    public void setKolumna3(String kolumna3) {
        this.kolumna3 = kolumna3;
    }

    public int getKolumna4() {
        return kolumna4;
    }

    public void setKolumna4(int kolumna4) {
        this.kolumna4 = kolumna4;
    }

    @Override
    public String toString() {
        return "ColumnEntity{" +
                "id=" + id +
                ", kolumna1='" + kolumna1 + '\'' +
                ", kolumna2='" + kolumna2 + '\'' +
                ", kolumna3='" + kolumna3 + '\'' +
                ", kolumna4=" + kolumna4 +
                '}';
    }
}
