package com.tactfactory.designpattern.controle.builders;

import com.tactfactory.designpattern.controle.entities.Meal;
import com.tactfactory.designpattern.controle.models.Burger1;
import com.tactfactory.designpattern.controle.models.Burger2;
import com.tactfactory.designpattern.controle.models.frites;
import com.tactfactory.designpattern.controle.models.Potatoes;

public class MealBuilder {

	private Meal order = new Meal();

	public MealBuilder addBurger(String input) {
		switch (input.toLowerCase()) {
		case "burger 1":
			this.order.addItem(new Burger1());
			break;

		case "burger 2":
			this.order.addItem(new Burger2());
			break;

		default:
			System.err.println("Please enter a valid borgor !");
			break;
		}
		return this;
	}

	public Meal build() {
		Meal temp = this.order;
		this.order = new Meal();
		return temp;
	}

	public Meal menuAdd(Meal meal) {
		return meal;
	}

}
