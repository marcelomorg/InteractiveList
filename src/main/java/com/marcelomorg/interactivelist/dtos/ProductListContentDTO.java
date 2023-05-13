package com.marcelomorg.interactivelist.dtos;

import com.marcelomorg.interactivelist.projections.ParametersProjection;

public class ProductListContentDTO {
    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String imgUrl;
    private String listName;
    private Integer position;
    private String shortDescription;


    public ProductListContentDTO(){

    }

    public ProductListContentDTO(ParametersProjection projection){
        this.id = projection.getId();
        this.title = projection.getTitle();
        this.year = projection.getYearProduct();
        this.genre = projection.getGenre();
        this.imgUrl = projection.getImgUrl();
        this.listName = projection.getName();
        this.position = projection.getPosition();
        this.shortDescription = projection.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
    
    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

}
