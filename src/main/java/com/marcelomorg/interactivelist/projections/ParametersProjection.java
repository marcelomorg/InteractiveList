package com.marcelomorg.interactivelist.projections;

public interface ParametersProjection {
    Long getId();
    String getTitle();
    Integer getYearProduct();
    String getGenre();
    String getPlatform();/* */
    Double getScore(); /* */
    String getImgUrl();
    String getShortDescription(); /* */
    String getLongDescription(); /* */

    String getName();
    Integer getPosition();
}