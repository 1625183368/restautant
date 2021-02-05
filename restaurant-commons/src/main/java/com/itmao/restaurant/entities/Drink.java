package com.itmao.restaurant.entities;


public class Drink {

  private long drinkId;
  private String drinkName;
  private String drinkDetail;
  private String drinkMaterial;
  private long drinkSales;
  private String drinkImages;
  private double drinkPrice;


  public long getDrinkId() {
    return drinkId;
  }

  public void setDrinkId(long drinkId) {
    this.drinkId = drinkId;
  }


  public String getDrinkName() {
    return drinkName;
  }

  public void setDrinkName(String drinkName) {
    this.drinkName = drinkName;
  }


  public String getDrinkDetail() {
    return drinkDetail;
  }

  public void setDrinkDetail(String drinkDetail) {
    this.drinkDetail = drinkDetail;
  }


  public String getDrinkMaterial() {
    return drinkMaterial;
  }

  public void setDrinkMaterial(String drinkMaterial) {
    this.drinkMaterial = drinkMaterial;
  }


  public long getDrinkSales() {
    return drinkSales;
  }

  public void setDrinkSales(long drinkSales) {
    this.drinkSales = drinkSales;
  }


  public String getDrinkImages() {
    return drinkImages;
  }

  public void setDrinkImages(String drinkImages) {
    this.drinkImages = drinkImages;
  }


  public double getDrinkPrice() {
    return drinkPrice;
  }

  public void setDrinkPrice(double drinkPrice) {
    this.drinkPrice = drinkPrice;
  }

}
