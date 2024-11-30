package view;

import model.Character;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainMenu extends JFrame implements ActionListener {

    ArrayList<model.Character> charList;
    private JButton newCharScreen;
    private JButton charListScreen;
    private JButton exitButton;
    private Container screen;

    public MainMenu(){
        this.setSize(600,200);
        this.screen = getContentPane();
        this.newCharScreen = new JButton("NEW CHARACTER");
        this.charListScreen = new JButton("CHARACTER LIST");
        this.exitButton = new JButton("EXIT");
        this.setLayout(new GridLayout());
        this.charList = new ArrayList<model.Character>();

        this.screen.add(newCharScreen);
        this.screen.add(charListScreen);
        this.screen.add(exitButton);

        this.newCharScreen.addActionListener(this::actionPerformed);
        this.charListScreen.addActionListener(this::actionPerformed);
        this.exitButton.addActionListener(this::actionPerformed);


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void openMainMenu(){
        this.setVisible(true);
    }

    public void tempShowChars(){
        for(Character it: this.charList){
            System.out.println(it.getName());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.exitButton){
            dispose();
        }else if(e.getSource() == this.newCharScreen){
            System.out.println("OPENING CHARACTER CREATION SCREEN");
            NewCharacter newCharacter = new NewCharacter(this.charList);
        }else if (e.getSource() == this.charListScreen){
            System.out.println("OPENING CHARACTER LIST");
            new CharacterList(charList);
            this.tempShowChars();
        }
    }

}
