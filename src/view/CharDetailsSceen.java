package view;

import model.Character;

import javax.swing.*;

public class CharDetailsSceen extends JFrame {
    private JLabel nameLabel, levelLabel, strLabel, dexLabel, conLabel, intLabel, wisLabel, charLabel, archetypeLabel,
            nameField, levelField, strField, dexField, conField, intField, wisField, charField, archetypeField;

    public CharDetailsSceen(Character character){
        this.nameLabel = new JLabel(character.getName());
        this.levelLabel = new JLabel(String.valueOf(character.getLevel()));
    }
}
