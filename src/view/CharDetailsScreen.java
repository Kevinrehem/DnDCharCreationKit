package view;

import model.Character;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharDetailsScreen extends JFrame implements ActionListener {
    private JLabel nameLabel, levelLabel, strLabel, dexLabel, conLabel, intLabel, wisLabel, charLabel, archetypeLabel,
            nameField, levelField, strField, dexField, conField, intField, wisField, charField, archetypeField;

    public CharDetailsScreen(Character character){
        this.nameLabel = new JLabel(character.getName());
        this.levelLabel = new JLabel(String.valueOf(character.getLevel()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
