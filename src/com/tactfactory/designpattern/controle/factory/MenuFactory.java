package com.tactfactory.designpattern.controle.factory;

import com.tactfactory.designpattern.controle.entities.*;
import com.tactfactory.designpattern.controle.models.*;

public class MenuFactory {

	public Meal create(String menu, String accompagnement, String burger) {

		switch (burger.toLowerCase().trim()) {
		case "burger1":
			meal.addItem(new Burger1());
			break;
		case "burger2":
			meal.addItem(new Burger2());
			break;
		default:
			System.out.println("Burger not recognized");
			break;
		}
		return meal;
	}
}
