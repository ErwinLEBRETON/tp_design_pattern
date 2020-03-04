package com.tactfactory.designpattern.controle.models;

import com.tactfactory.designpattern.controle.entities.Item;
import com.tactfactory.designpattern.controle.interfaces.Burger;

public class Burger2 implements Burger, Item {
  
  private String name;
  private float price;

  public Burger2() {
    this.name = "Burger 2";
    this.price = 2F;
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
  }
  
}
