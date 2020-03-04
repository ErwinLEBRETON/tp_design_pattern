package com.tactfactory.designpattern.controle.models;

import com.tactfactory.designpattern.controle.entities.Item;
import com.tactfactory.designpattern.controle.interfaces.Accompaniments;

public class Potatoes implements Accompaniments, Item {
  
  private String name;
  private float price;
  
  public Potatoes() {
    this.name = "Potatoes";
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
    return this.name + " " + this.price + " " + "\n";
  }


}
