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
public class ItemSelection extends JFrame {

	private Home home;
	private Meal meal;

	private JButton burger1 = new JButton("Burger1");
	private JButton burger2 = new JButton("Burger2");

	private JButton fritesSmall = new JButton("fritesSmall");
	private JButton fritesMedium = new JButton("fritesMedium");
	private JButton fritesBig = new JButton("fritesBig");

	private JButton potatoesSmall = new JButton("PotatoesSmall");
	private JButton potatoesMedium = new JButton("PotatoesMedium");
	private JButton potatoesBig = new JButton("PotatoesBig");

	private JButton validate = new JButton("Valider");

	public ItemSelection() {
		this.setTitle("Items");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		bindActions();
		addButtons();

		this.setVisible(true);
	}

	private void addButtons() {
		JPanel container = new JPanel();
		container.setLayout(new GridLayout(3, 1));

		JPanel containerBurger = new JPanel();
		containerBurger.setLayout(new GridLayout(2, 4));
		containerBurger.add(burger1);
		containerBurger.add(burger2);
		container.add(containerBurger);

		JPanel containerAccompaniment = new JPanel();
		containerAccompaniment.setLayout(new GridLayout(2, 3));
		containerAccompaniment.add(fritesSmall);
		containerAccompaniment.add(fritesMedium);
		containerAccompaniment.add(fritesBig);
		containerAccompaniment.add(potatoesSmall);
		containerAccompaniment.add(potatoesMedium);
		containerAccompaniment.add(potatoesBig);
		container.add(containerAccompaniment);

		container.add(validate);
		this.setContentPane(container);
	}

	private void bindActions() {

		
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
		
		fritesSmall.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				meal.addItem(new frites(1));
			}
		});
		
		fritesMedium.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				meal.addItem(new frites(2));
			}
		});
		
		fritesBig.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				meal.addItem(new frites(3));
			}
		});
		
		potatoesSmall.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				meal.addItem(new Potatoes(1));
			}
		});
		
		potatoesMedium.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				meal.addItem(new Potatoes(2));
			}
		});
		
		potatoesBig.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				meal.addItem(new Potatoes(3));
			}
		});
		
		
		
		validate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				meal.showItems();
				System.out.println(meal.getCost());
				
				home.setMeal(meal);
				home.setVisible(true);
				ItemSelection.this.dispose();
			}
		});
	}

	public void setHome(Home home) {
		this.home = home;
		meal = home.getMeal();
		home.setVisible(false);
	}
}
