package com.bilibili.main.model;

public class Grids {
    private String gridId;

    private String gridsName;

    private String gridPrice;

    private String gridImg;

    private Integer gridsStock;

    public String getGridId() {
        return gridId;
    }

    public void setGridId(String gridId) {
        this.gridId = gridId == null ? null : gridId.trim();
    }

    public String getGridsName() {
        return gridsName;
    }

    public void setGridsName(String gridsName) {
        this.gridsName = gridsName == null ? null : gridsName.trim();
    }

    public String getGridPrice() {
        return gridPrice;
    }

    public void setGridPrice(String gridPrice) {
        this.gridPrice = gridPrice == null ? null : gridPrice.trim();
    }

    public String getGridImg() {
        return gridImg;
    }

    public void setGridImg(String gridImg) {
        this.gridImg = gridImg == null ? null : gridImg.trim();
    }

    public Integer getGridsStock() {
        return gridsStock;
    }

    public void setGridsStock(Integer gridsStock) {
        this.gridsStock = gridsStock;
    }
}