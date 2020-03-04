package com.tactfactory.designpattern.controle.models;

import com.tactfactory.designpattern.controle.entities.Item;
import com.tactfactory.designpattern.controle.interfaces.Burger;

public class Burger1 implements Burger, Item {
  
  private String name;
  private float price;

  public Burger1() {
    this.name = "Burger 1";
    this.price = 1F;
  }

  @Override
  public String name() {
    return this.name;
  }

  @Override
  public float price() {
    return this.price;
  }
  
  @Override
  public String toString() {
    return this.name + " " + this.price + "\n";
  }

}
