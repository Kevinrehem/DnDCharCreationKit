package view;

import model.Character;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharDetailsScreen extends JFrame implements ActionListener {

    private Container container;
    private JLabel nameLabel, levelLabel, strLabel, dexLabel, conLabel, intLabel, wisLabel, charLabel, archetypeLabel;
    private JTextField nameField, levelField, strField, dexField, conField, intField, wisField, charField, archetypeField;
    private JButton exitButton, editSaveButton, cancelButton;
    private JCheckBox athletics, acrobatics, sleightOfHand, arcana, history, investigation,
            nature, religion, animalHandling, insight, medicine, perception, survival, deception, intimidation,
            performance, persuasion;
    private boolean editMode;
    private model.Character character;

    public CharDetailsScreen(Character character){
        //instanciando objetos
        this.setLayout(null);
        this.editMode = false;
        this.container = getContentPane();
        this.character = character;
        this.nameLabel = new JLabel("NAME");
        this.levelLabel = new JLabel("LEVEL");
        this.archetypeLabel = new JLabel("CLASS");
        this.strLabel = new JLabel("STR");
        this.dexLabel = new JLabel("DEX");
        this.conLabel = new JLabel("CON");
        this.intLabel = new JLabel("INT");
        this.wisLabel = new JLabel("WIS");
        this.charLabel = new JLabel("CHA");

        this.nameField = new JTextField(character.getName());
        this.levelField = new JTextField(String.valueOf(character.getLevel()));
        this.archetypeField = new JTextField(character.getArchetype());
        this.strField = new JTextField(String.valueOf(character.getStrength()));
        this.dexField = new JTextField(String.valueOf(character.getDexterity()));
        this.conField = new JTextField(String.valueOf(character.getConstitution()));
        this.intField = new JTextField(String.valueOf(character.getIntelligence()));
        this.wisField = new JTextField(String.valueOf(character.getWisdom()));
        this.charField = new JTextField(String.valueOf(character.getCharisma()));

        this.nameField.setEditable(false);
        this.levelField.setEditable(false);
        this.archetypeField.setEditable(false);
        this.strField.setEditable(false);
        this.dexField.setEditable(false);
        this.conField.setEditable(false);
        this.intField.setEditable(false);
        this.wisField.setEditable(false);
        this.charField.setEditable(false);

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

        this.athletics.setSelected(character.isAthletics());
        this.acrobatics.setSelected(character.isAcrobatics());
        this.sleightOfHand.setSelected(character.isSleightOfHand());
        this.arcana.setSelected(character.isArcana());
        this.history.setSelected(character.isHistory());
        this.investigation.setSelected(character.isInvestigation());
        this.nature.setSelected(character.isNature());
        this.religion.setSelected(character.isReligion());
        this.animalHandling.setSelected(character.isAnimalHandling());
        this.insight.setSelected(character.isInsight());
        this.medicine.setSelected(character.isMedicine());
        this.perception.setSelected(character.isPerception());
        this.survival.setSelected(character.isSurvival());
        this.deception.setSelected(character.isDeception());
        this.intimidation.setSelected(character.isIntimidation());
        this.performance.setSelected(character.isPerformance());
        this.persuasion.setSelected(character.isPersuasion());

        this.athletics.setEnabled(false);
        this.acrobatics.setEnabled(false);
        this.sleightOfHand.setEnabled(false);
        this.arcana.setEnabled(false);
        this.history.setEnabled(false);
        this.investigation.setEnabled(false);
        this.nature.setEnabled(false);
        this.religion.setEnabled(false);
        this.animalHandling.setEnabled(false);
        this.insight.setEnabled(false);
        this.medicine.setEnabled(false);
        this.perception.setEnabled(false);
        this.survival.setEnabled(false);
        this.deception.setEnabled(false);
        this.intimidation.setEnabled(false);
        this.performance.setEnabled(false);
        this.persuasion.setEnabled(false);

        this.exitButton = new JButton("EXIT");
        this.cancelButton = new JButton("CANCEL");
        this.editSaveButton = new JButton("EDIT");
        this.cancelButton.setVisible(false);

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
        this.container.add(this.editSaveButton);
        this.container.add(this.cancelButton);
        this.container.add(this.exitButton);
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
        this.editSaveButton.setBounds(20, 610, 80, 30);
        this.cancelButton.setBounds(120, 610, 80, 30);
        this.exitButton.setBounds(450, 610, 120, 30);
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

        this.exitButton.addActionListener(this::actionPerformed);
        this.editSaveButton.addActionListener(this::actionPerformed);
        this.cancelButton.addActionListener(this::actionPerformed);

        this.setSize(600,700);
        this.setTitle("model.Character creation");
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void resetChanges(){
        this.nameField.setText(character.getName());
        this.levelField.setText(String.valueOf(character.getLevel()));
        this.archetypeField.setText(character.getArchetype());
        this.strField.setText(String.valueOf(character.getStrength()));
        this.dexField.setText(String.valueOf(character.getDexterity()));
        this.conField.setText(String.valueOf(character.getConstitution()));
        this.intField.setText(String.valueOf(character.getIntelligence()));
        this.wisField.setText(String.valueOf(character.getWisdom()));
        this.charField.setText(String.valueOf(character.getCharisma()));

        this.athletics.setSelected(character.isAthletics());
        this.acrobatics.setSelected(character.isAcrobatics());
        this.sleightOfHand.setSelected(character.isSleightOfHand());
        this.arcana.setSelected(character.isArcana());
        this.history.setSelected(character.isHistory());
        this.investigation.setSelected(character.isInvestigation());
        this.nature.setSelected(character.isNature());
        this.religion.setSelected(character.isReligion());
        this.animalHandling.setSelected(character.isAnimalHandling());
        this.insight.setSelected(character.isInsight());
        this.medicine.setSelected(character.isMedicine());
        this.perception.setSelected(character.isPerception());
        this.survival.setSelected(character.isSurvival());
        this.deception.setSelected(character.isDeception());
        this.intimidation.setSelected(character.isIntimidation());
        this.performance.setSelected(character.isPerformance());
        this.persuasion.setSelected(character.isPersuasion());

        this.toggleEditMode();

    }

    public void toggleFields(){

        if(this.editMode){
            this.athletics.setEnabled(false);
            this.acrobatics.setEnabled(false);
            this.sleightOfHand.setEnabled(false);
            this.arcana.setEnabled(false);
            this.history.setEnabled(false);
            this.investigation.setEnabled(false);
            this.nature.setEnabled(false);
            this.religion.setEnabled(false);
            this.animalHandling.setEnabled(false);
            this.insight.setEnabled(false);
            this.medicine.setEnabled(false);
            this.perception.setEnabled(false);
            this.survival.setEnabled(false);
            this.deception.setEnabled(false);
            this.intimidation.setEnabled(false);
            this.performance.setEnabled(false);
            this.persuasion.setEnabled(false);
            this.nameField.setEditable(false);
            this.levelField.setEditable(false);
            this.archetypeField.setEditable(false);
            this.strField.setEditable(false);
            this.dexField.setEditable(false);
            this.conField.setEditable(false);
            this.intField.setEditable(false);
            this.wisField.setEditable(false);
            this.charField.setEditable(false);
        }else{
            this.athletics.setEnabled(true);
            this.acrobatics.setEnabled(true);
            this.sleightOfHand.setEnabled(true);
            this.arcana.setEnabled(true);
            this.history.setEnabled(true);
            this.investigation.setEnabled(true);
            this.nature.setEnabled(true);
            this.religion.setEnabled(true);
            this.animalHandling.setEnabled(true);
            this.insight.setEnabled(true);
            this.medicine.setEnabled(true);
            this.perception.setEnabled(true);
            this.survival.setEnabled(true);
            this.deception.setEnabled(true);
            this.intimidation.setEnabled(true);
            this.performance.setEnabled(true);
            this.persuasion.setEnabled(true);
            this.nameField.setEditable(true);
            this.levelField.setEditable(true);
            this.archetypeField.setEditable(true);
            this.strField.setEditable(true);
            this.dexField.setEditable(true);
            this.conField.setEditable(true);
            this.intField.setEditable(true);
            this.wisField.setEditable(true);
            this.charField.setEditable(true);
        }
    }

    public void toggleEditMode(){
        if(!this.editMode){
            this.toggleFields();
            this.editMode=true;
            this.editSaveButton.setText("SAVE");
            this.cancelButton.setVisible(true);


        }else{
            this.toggleFields();
            this.editMode=false;
            this.editSaveButton.setText("EDIT");
            this.cancelButton.setVisible(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.editSaveButton){
            if(this.editMode){
                this.toggleEditMode();
            }else{
                this.toggleEditMode();
            }
        }
        if(e.getSource()==this.cancelButton){
            this.resetChanges();
        }
        if (e.getSource()==this.exitButton){
            dispose();
        }
    }
}
