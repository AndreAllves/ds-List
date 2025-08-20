package com.devSuperior.dsList.dto;


import com.devSuperior.dsList.entities.Games;

public class GamesMinDto {

    private long id;
    private String title;
    private int yeear;
    private String imgUrl;
    private String shortDescription;

    public GamesMinDto(Games entity) {
        id = entity.getId();
        title = entity.getTitle();
        yeear = entity.getYeear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public GamesMinDto() {}

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
}
