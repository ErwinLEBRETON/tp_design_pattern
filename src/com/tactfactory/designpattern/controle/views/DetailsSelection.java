package com.tactfactory.designpattern.controle.views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.tactfactory.designpattern.controle.entities.Meal;

@SuppressWarnings("serial")
public class DetailsSelection extends JFrame {

  private Home home;
  private Meal meal;

  private JButton back = new JButton("Retour");
  private JButton reset = new JButton("Reset");
  private JButton validate = new JButton("Validate");
  private JTextField commandDetails = new JTextField();
  private JTextField price = new JTextField();

  public DetailsSelection() {
    this.setTitle("Details");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    bindActions();
    addButtons();

    this.setVisible(true);
    
  }
  
  private void addButtons() {
    JPanel container = new JPanel();
    container.setLayout(new GridLayout(4, 1));
    container.add(commandDetails);
    container.add(price);
    
    JPanel containerValidation = new JPanel();
    containerValidation.setLayout(new GridLayout(1, 2));
    containerValidation.add(reset);
    containerValidation.add(validate);
    
	container.add(containerValidation);
    container.add(back);
	
    this.setContentPane(container);
  }

  private void bindActions() {

    reset.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
          home.setMeal(new Meal());
          home.setVisible(true);
          DetailsSelection.this.dispose();
      }
  });

    validate.addActionListener(new ActionListener() {
  
        @Override
        public void actionPerformed(ActionEvent e) {
            home.setMeal(new Meal());
            home.setVisible(true);
            DetailsSelection.this.dispose();
        }
    });
    
    
  }

  public void setHome(Home home) {
    this.home = home;
    meal = home.getMeal();
    home.setVisible(false);

    displayOrder();
    displayCost();
}
  
  public void setMeal(Meal meal) {
    this.meal = meal;
  }
  public Meal getMeal() {
    return meal;
  }
}
