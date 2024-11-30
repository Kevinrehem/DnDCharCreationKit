package view;

import dbconnect.CharacterDAO;
import model.Character;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CharacterList extends JFrame implements ActionListener {
    private ArrayList<JButton> characters;
    private ArrayList<model.Character> charList;
    private JButton deleteModeButton, exitButton;
    private boolean deleteMode = false;
    private int countY;

    public CharacterList(ArrayList<model.Character> characters) {
        this.setSize(600, 700);
        this.characters = new ArrayList<>();
        this.charList = characters;
        this.setLayout(null);
        this.deleteModeButton = new JButton("ENTER DELETE MODE");
        this.exitButton = new JButton("EXIT");

        this.add(deleteModeButton);
        this.add(exitButton);
        this.deleteModeButton.setBounds(20, 610, 200, 30);
        this.exitButton.setBounds(490, 610, 80, 30);

        for (model.Character it : characters) {
            this.characters.add(new JButton(it.getName()));
        }
        for (JButton it : this.characters) {
            this.add(it);
        }

        this.countY = 10;
        for (JButton it : this.characters) {
            it.setBounds(150, countY, 300, 30);
            countY += 40;
        }

        for (JButton it : this.characters) {
            it.addActionListener(this::actionPerformed);
        }

        this.deleteModeButton.addActionListener(this::actionPerformed);
        this.exitButton.addActionListener(this::actionPerformed);

        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    public void toggleDeleteMode() {
        if (deleteMode) {
            deleteMode = false;
            deleteModeButton.setText("ENTER DELETE MODE");
        } else {
            deleteMode = true;
            deleteModeButton.setText("EXIT DELETE MODE");
        }
        // Recalcular a posição dos botões após mudança de modo
        updateButtonPositions();
        this.repaint();
        this.revalidate();
    }

    public void deleteChar(String name) {
        charList.remove(searchCharacter(name));
    }

    public model.Character searchCharacter(String name) {
        for (model.Character it : charList) {
            if (it.getName().equalsIgnoreCase(name)) {
                return it;
            }
        }
        return null;
    }

    public void updateButtonPositions() {
        countY = 10; // Reinicia a posição Y
        for (JButton it : this.characters) {
            it.setBounds(150, countY, 300, 30);
            countY += 40;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Fecha janela que demonstra lista de personagens
        if(e.getSource()==exitButton){
            this.dispose();
        }

        // Alternar modo de exclusão
        if (e.getSource() == this.deleteModeButton) {
            this.toggleDeleteMode(); // Chama o método para alternar o modo de exclusão
        }

        // Verifica se está no modo de exclusão
        if (this.deleteMode) {
            JButton buttonToRemove = null;
            for (JButton it : this.characters) {
                if (e.getSource() == it) {
                    // Remove o personagem do banco de dados e da lista lógica
                    String charName = it.getText();
                    deleteChar(charName);
                    new CharacterDAO().deleteChar(charName);

                    // Remove o botão correspondente
                    buttonToRemove = it;
                    break;
                }
            }

            // Atualiza a interface, removendo o botão
            if (buttonToRemove != null) {
                this.characters.remove(buttonToRemove);
                this.remove(buttonToRemove);
                this.repaint(); // Atualiza o layout da janela
                this.revalidate();
            }
            return; // Impede a abertura de detalhes no modo de exclusão
        } else {
            // Abrir tela de detalhes se não estiver no modo de exclusão
            int found = 0;
            for (JButton it : this.characters) {
                if (e.getSource() == it) {
                    new CharDetailsScreen(charList.get(found));
                    break;
                }
                found++;
            }
        }
    }

}
