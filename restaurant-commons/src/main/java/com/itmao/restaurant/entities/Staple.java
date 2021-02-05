package com.itmao.restaurant.entities;


public class Staple {

  private long stapleId;
  private String stapleName;
  private String stapleDetail;
  private String stapleMaterial;
  private long stapleSales;
  private String stapleImages;
  private double staplePrice;


  public long getStapleId() {
    return stapleId;
  }

  public void setStapleId(long stapleId) {
    this.stapleId = stapleId;
  }


  public String getStapleName() {
    return stapleName;
  }

  public void setStapleName(String stapleName) {
    this.stapleName = stapleName;
  }


  public String getStapleDetail() {
    return stapleDetail;
  }

  public void setStapleDetail(String stapleDetail) {
    this.stapleDetail = stapleDetail;
  }


  public String getStapleMaterial() {
    return stapleMaterial;
  }

  public void setStapleMaterial(String stapleMaterial) {
    this.stapleMaterial = stapleMaterial;
  }


  public long getStapleSales() {
    return stapleSales;
  }

  public void setStapleSales(long stapleSales) {
    this.stapleSales = stapleSales;
  }


  public String getStapleImages() {
    return stapleImages;
  }

  public void setStapleImages(String stapleImages) {
    this.stapleImages = stapleImages;
  }


  public double getStaplePrice() {
    return staplePrice;
  }

  public void setStaplePrice(double staplePrice) {
    this.staplePrice = staplePrice;
  }

}
