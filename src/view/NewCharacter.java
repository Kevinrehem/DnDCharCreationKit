package view;

import dbconnect.CharacterDAO;
import model.Character;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;


public class NewCharacter extends JFrame implements ActionListener{
    private Container container;
    private JLabel nameLabel, levelLabel, strLabel, dexLabel, conLabel, intLabel, wisLabel, charLabel, archetypeLabel;
    private JTextField nameField, levelField, strField, dexField, conField, intField, wisField, charField, archetypeField;
    private JButton cancelButton, saveButton, clearFieldsButton;
    private JCheckBox athletics, acrobatics, sleightOfHand, arcana, history, investigation,
    nature, religion, animalHandling, insight, medicine, perception, survival, deception, intimidation,
    performance, persuasion;
    private ArrayList<Character> charList;
    CharacterDAO characterDAO;


    public NewCharacter(ArrayList<model.Character> charList){
        //instanciando objetos
        this.setLayout(null);
        this.container = getContentPane();
        this.nameLabel = new JLabel("NAME");
        this.levelLabel = new JLabel("LEVEL");
        this.archetypeLabel = new JLabel("CLASS");
        this.strLabel = new JLabel("STR");
        this.dexLabel = new JLabel("DEX");
        this.conLabel = new JLabel("CON");
        this.intLabel = new JLabel("INT");
        this.wisLabel = new JLabel("WIS");
        this.charLabel = new JLabel("CHA");
        this.charList = charList;
        this.characterDAO = new CharacterDAO();

        this.nameField = new JTextField();
        this.levelField = new JTextField();
        this.archetypeField = new JTextField();
        this.strField = new JTextField();
        this.dexField = new JTextField();
        this.conField = new JTextField();
        this.intField = new JTextField();
        this.wisField = new JTextField();
        this.charField = new JTextField();

        this.athletics = new JCheckBox("Athletics");
        this.acrobatics = new JCheckBox("Acrobatics");
        this.sleightOfHand = new JCheckBox("Sleight Of Hand");
        this.arcana = new JCheckBox("Arcana");
        this.history = new JCheckBox("History");
        this.investigation = new JCheckBox("Investigation");
        this.nature = new JCheckBox("Nature");
        this.religion = new JCheckBox("Religion");
        this.animalHandling = new JCheckBox("Animal Handling");
        this.insight = new JCheckBox("Insight");
        this.medicine = new JCheckBox("Medicine");
        this.perception = new JCheckBox("Perception");
        this.survival = new JCheckBox("Survival");
        this.deception = new JCheckBox("Deception");
        this.intimidation = new JCheckBox("Intimidation");
        this.performance = new JCheckBox("Performance");
        this.persuasion = new JCheckBox("Persuasion");

        this.cancelButton = new JButton("CANCEL");
        this.clearFieldsButton = new JButton("CLEAR");
        this.saveButton = new JButton("SAVE");

        //adicionando elementos à tela de criação de personagem
        this.container.add(this.nameLabel);
        this.container.add(this.nameField);
        this.container.add(this.levelLabel);
        this.container.add(this.levelField);
        this.container.add(this.strLabel);
        this.container.add(this.strField);
        this.container.add(this.dexLabel);
        this.container.add(this.dexField);
        this.container.add(this.conLabel);
        this.container.add(this.conField);
        this.container.add(this.intLabel);
        this.container.add(this.intField);
        this.container.add(this.wisLabel);
        this.container.add(this.wisField);
        this.container.add(this.charLabel);
        this.container.add(this.charField);
        this.container.add(this.saveButton);
        this.container.add(this.clearFieldsButton);
        this.container.add(this.cancelButton);
        this.container.add(this.athletics);
        this.container.add(this.acrobatics);
        this.container.add(this.sleightOfHand);
        this.container.add(this.arcana);
        this.container.add(this.history);
        this.container.add(this.investigation);
        this.container.add(this.nature);
        this.container.add(this.religion);
        this.container.add(this.animalHandling);
        this.container.add(this.insight);
        this.container.add(this.medicine);
        this.container.add(this.perception);
        this.container.add(this.survival);
        this.container.add(this.deception);
        this.container.add(this.intimidation);
        this.container.add(this.performance);
        this.container.add(this.persuasion);
        this.container.add(this.archetypeLabel);
        this.container.add(this.archetypeField);

        //ajustando posição e tamanho dos elementos
        this.saveButton.setBounds(20, 700, 80, 30);
        this.clearFieldsButton.setBounds(120, 700, 80, 30);
        this.cancelButton.setBounds(450, 700, 120, 30);
        this.nameLabel.setBounds(20,15,200,20);
        this.nameField.setBounds(20,35,400,30);
        this.levelLabel.setBounds(450,15,100,20);
        this.levelField.setBounds(450,35,100,30);
        this.archetypeLabel.setBounds(this.levelField.getX()-100,this.levelField.getY()+35,200,20);
        this.archetypeField.setBounds(this.levelField.getX()-100,this.levelField.getY()+55,200,30);
        this.strLabel.setBounds(40, 85, 100,20);
        this.strField.setBounds(30, 110, 50,50);
        this.athletics.setBounds(this.strField.getX() + 60,this.strField.getY(), 120,13);
        this.dexLabel.setBounds(this.strLabel.getX(), this.strField.getY()+60, 100,20);
        this.dexField.setBounds(this.strField.getX(), this.dexLabel.getY()+25, 50,50);
        this.acrobatics.setBounds(this.dexField.getX() + 60,this.dexField.getY(), 120,13);
        this.sleightOfHand.setBounds(this.dexField.getX() + 60,this.dexField.getY()+15, 120,13);
        this.conLabel.setBounds(this.dexLabel.getX(), this.dexField.getY()+60, 100,20);
        this.conField.setBounds(this.dexField.getX(), this.conLabel.getY()+25, 50,50);
        this.intLabel.setBounds(this.conLabel.getX(), this.conField.getY()+60, 100,20);
        this.intField.setBounds(this.conField.getX(), this.intLabel.getY()+25, 50,50);
        this.arcana.setBounds(this.intField.getX() + 60,this.intField.getY(), 120,13);
        this.history.setBounds(this.intField.getX() + 60,this.intField.getY()+15, 120,13);
        this.investigation.setBounds(this.intField.getX() + 60,this.intField.getY()+30, 120,13);
        this.nature.setBounds(this.intField.getX() + 180,this.intField.getY(), 120,13);
        this.religion.setBounds(this.intField.getX() + 180,this.intField.getY()+15, 120,13);
        this.wisLabel.setBounds(this.intLabel.getX(),this.intField.getY()+60, 100, 20);
        this.wisField.setBounds(this.intField.getX(),this.wisLabel.getY()+25, 50, 50);
        this.animalHandling.setBounds(this.wisField.getX()+60,this.wisField.getY(), 120,13);
        this.insight.setBounds(this.wisField.getX()+60,this.wisField.getY()+15, 120,13);
        this.medicine.setBounds(this.wisField.getX()+60,this.wisField.getY()+30, 120,13);
        this.perception.setBounds(this.wisField.getX()+180,this.wisField.getY(), 120,13);
        this.survival.setBounds(this.wisField.getX()+180,this.wisField.getY()+15, 120,13);
        this.charLabel.setBounds(this.wisLabel.getX(),this.wisField.getY()+60, 100, 20);
        this.charField.setBounds(this.wisField.getX(),this.charLabel.getY()+25, 50, 50);
        this.deception.setBounds(this.charField.getX()+60,this.charField.getY(), 120,13);
        this.intimidation.setBounds(this.charField.getX()+60,this.charField.getY()+15, 120,13);
        this.persuasion.setBounds(this.charField.getX()+60,this.charField.getY()+30, 120,13);
        this.performance.setBounds(this.charField.getX()+180,this.charField.getY(), 120,13);

        this.cancelButton.addActionListener(this::actionPerformed);
        this.saveButton.addActionListener(this::actionPerformed);
        this.clearFieldsButton.addActionListener(this::actionPerformed);

        this.setSize(600,800);
        this.setTitle("model.Character creation");
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    public void addChar(ArrayList<model.Character> characters){
        characters.add(new model.Character(
                this.nameField.getText(), this.archetypeField.getText(),
                Integer.parseInt(this.levelField.getText()),Integer.parseInt(this.strField.getText()),
                Integer.parseInt(this.dexField.getText()), Integer.parseInt(this.conField.getText()),
                Integer.parseInt(this.intField.getText()), Integer.parseInt(this.wisField.getText()),
                Integer.parseInt(this.charField.getText()),this.athletics.isSelected(),
                this.acrobatics.isSelected(), this.sleightOfHand.isSelected(), this.arcana.isSelected(),
                this.history.isSelected(), this.investigation.isSelected(), this.nature.isSelected(),
                this.religion.isSelected(), this.animalHandling.isSelected(), this.insight.isSelected(),
                this.medicine.isSelected(), this.perception.isSelected(), this.survival.isSelected(),
                this.deception.isSelected(), this.intimidation.isSelected(), this.performance.isSelected(),
                this.persuasion.isSelected()
            )
        );
        try {
            characterDAO.saveCharacter(new Character(
                            this.nameField.getText(), this.archetypeField.getText(),
                            Integer.parseInt(this.levelField.getText()),Integer.parseInt(this.strField.getText()),
                            Integer.parseInt(this.dexField.getText()), Integer.parseInt(this.conField.getText()),
                            Integer.parseInt(this.intField.getText()), Integer.parseInt(this.wisField.getText()),
                            Integer.parseInt(this.charField.getText()),this.athletics.isSelected(),
                            this.acrobatics.isSelected(), this.sleightOfHand.isSelected(), this.arcana.isSelected(),
                            this.history.isSelected(), this.investigation.isSelected(), this.nature.isSelected(),
                            this.religion.isSelected(), this.animalHandling.isSelected(), this.insight.isSelected(),
                            this.medicine.isSelected(), this.perception.isSelected(), this.survival.isSelected(),
                            this.deception.isSelected(), this.intimidation.isSelected(), this.performance.isSelected(),
                            this.persuasion.isSelected()
                    )
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void clearFields(){
        this.nameField.setText("");
        this.levelField.setText("");
        this.archetypeField.setText("");
        this.strField.setText("");
        this.dexField.setText("");
        this.conField.setText("");
        this.intField.setText("");
        this.wisField.setText("");
        this.charField.setText("");
        this.athletics.setSelected(false);
        this.acrobatics.setSelected(false);
        this.sleightOfHand.setSelected(false);
        this.arcana.setSelected(false);
        this.history.setSelected(false);
        this.investigation.setSelected(false);
        this.nature.setSelected(false);
        this.religion.setSelected(false);
        this.animalHandling.setSelected(false);
        this.insight.setSelected(false);
        this.medicine.setSelected(false);
        this.perception.setSelected(false);
        this.survival.setSelected(false);
        this.deception.setSelected(false);
        this.intimidation.setSelected(false);
        this.performance.setSelected(false);
        this.persuasion.setSelected(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.cancelButton){
            this.dispose();
        }else if(e.getSource()==this.saveButton){
            this.addChar(this.charList);
            dispose();
        }else if(e.getSource()==this.clearFieldsButton){
            this.clearFields();
        }
    }
}
