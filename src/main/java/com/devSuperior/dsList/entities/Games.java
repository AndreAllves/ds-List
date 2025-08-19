package com.devSuperior.dsList.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game")
public class Games {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;

    @Column(name = "game_year")
    private int yeear;
    private String plataform;
    private double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public Games() {
    }

    public Games(long id, String title, int yeear, String plataform, double score, String imgUrl, String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.yeear = yeear;
        this.plataform = plataform;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYeear() {
        return yeear;
    }

    public void setYeear(int yeear) {
        this.yeear = yeear;
    }

    public String getPlataform() {
        return plataform;
    }

    public void setPlataform(String plataform) {
        this.plataform = plataform;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Games games = (Games) o;
        return id == games.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
