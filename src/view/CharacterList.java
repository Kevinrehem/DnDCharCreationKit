package view;

import model.Character;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CharacterList extends JFrame implements ActionListener {
    private ArrayList<JButton> characters;
    private ArrayList<model.Character> charList;
    private int countY;

    public CharacterList (ArrayList<model.Character> characters){
        this.setSize(600,700);
        this.characters = new ArrayList<JButton>();
        this.charList=characters;
        this.setLayout(null);
        for(Character it: characters){
            this.characters.add(new JButton(it.getName()));
        }
        for(JButton it: this.characters){
            this.add(it);
        }

        this.countY = 10;
        for (JButton it: this.characters){
            it.setBounds(150, countY, 300, 30);
            countY+=40;
        }

        for(JButton it: this.characters){
            it.addActionListener(this::actionPerformed);
        }

        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    public model.Character searchCharacter(String name){
        model.Character aux=null;
        for(model.Character it:charList){
            if(it.getName().equalsIgnoreCase(name)){
                aux=it;
            }
        }
        return aux;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(JButton it:characters){
            if(e.getSource()==it){

            }
        }
    }
}
