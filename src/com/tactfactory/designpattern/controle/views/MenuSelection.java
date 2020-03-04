package com.tactfactory.designpattern.controle.views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.tactfactory.designpattern.controle.entities.Meal;
import com.tactfactory.designpattern.controle.models.*;

@SuppressWarnings("serial")
public class MenuSelection extends JFrame {

	private Home home;
	private Meal meal;
	
  public void setMeal(Meal meal) {
    this.meal = meal;
  }
  public Meal getMeal() {
    return meal;
  }

	private JButton bestOf = new JButton("BestOf");
	private JButton maxiBestOf = new JButton("MaxiBestOf");

	private JButton burger1 = new JButton("Burger1");
	private JButton burger2 = new JButton("Burger2");

	private JButton frites = new JButton("Frites");
	private JButton potatoes = new JButton("Potatoes");

	private JButton validate = new JButton("Valider");

	public MenuSelection() {
		this.setTitle("Menu");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		bindActions();
		addButtons();

		this.setVisible(true);
		
		burger1.setEnabled(false);
		burger2.setEnabled(false);
		frites.setEnabled(false);
		potatoes.setEnabled(false);
	}

	private void addButtons() {
		JPanel container = new JPanel();
		container.setLayout(new GridLayout(3, 1));

		JPanel containerType = new JPanel();
		containerType.setLayout(new GridLayout(1, 2));
		containerType.add(bestOf);
		containerType.add(maxiBestOf);
		container.add(containerType);

		JPanel containerBurger = new JPanel();
		containerBurger.setLayout(new GridLayout(2, 4));
		containerBurger.add(burger1);
		containerBurger.add(burger2);
		container.add(containerBurger);

		JPanel containerAccompaniment = new JPanel();
		containerAccompaniment.setLayout(new GridLayout(2, 4));
		containerAccompaniment.add(frites);
		containerAccompaniment.add(potatoes);
		container.add(containerAccompaniment);

		container.add(validate);
		this.setContentPane(container);
	}

	private void bindActions() {
		
		bestOf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				burger1.setEnabled(true);
				burger2.setEnabled(true);
				frites.setEnabled(true);
				potatoes.setEnabled(true);
			}
		});
		
		maxiBestOf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				burger1.setEnabled(true);
				burger2.setEnabled(true);
				frites.setEnabled(true);
				potatoes.setEnabled(true);
			}
		});
		
		burger1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				meal.addItem(new Burger1());
			}
		});
		
		burger2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				meal.addItem(new Burger2());
			}
		});		

		validate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				meal.showItems();
				System.out.println(meal.getCost());
				
				home.setMeal(meal);
				home.setVisible(true);
				MenuSelection.this.dispose();
			}
		});
	}

	public void setHome(Home home) {
		this.home = home;
		meal = home.getMeal();
		home.setVisible(false);
	}
}
