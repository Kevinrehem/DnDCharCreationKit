package dbconnect;

import model.Character;
import view.MainMenu;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;


public class CharacterDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/dndcckitdb";
    private static final String USER = "root";
    private static final String PASSWORD = "";


    public void saveCharacter(Character character) throws SQLException {
        String sql = "INSERT INTO characters (name, archetype, level, strength, dexterity, constitution, intelligence, " +
                "wisdom, charisma, athletics, acrobatics, sleightOfHand, arcana, history_skill, investigation, nature, " +
                "religion, animalHandling, insight, medicine, perception, survival, deception, intimidation, " +
                "performance, persuasion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1, character.getName());
            statement.setString(2, character.getArchetype());
            statement.setInt(3, character.getLevel());
            statement.setInt(4, character.getStrength());
            statement.setInt(5, character.getDexterity());
            statement.setInt(6, character.getConstitution());
            statement.setInt(7, character.getIntelligence());
            statement.setInt(8, character.getWisdom());
            statement.setInt(9, character.getCharisma());
            statement.setBoolean(10, character.isAthletics());
            statement.setBoolean(11, character.isAcrobatics());
            statement.setBoolean(12, character.isSleightOfHand());
            statement.setBoolean(13, character.isArcana());
            statement.setBoolean(14, character.isHistory());
            statement.setBoolean(15, character.isInvestigation());
            statement.setBoolean(16, character.isNature());
            statement.setBoolean(17, character.isReligion());
            statement.setBoolean(18, character.isAnimalHandling());
            statement.setBoolean(19, character.isInsight());
            statement.setBoolean(20, character.isMedicine());
            statement.setBoolean(21, character.isPerception());
            statement.setBoolean(22, character.isSurvival());
            statement.setBoolean(23, character.isDeception());
            statement.setBoolean(24, character.isIntimidation());
            statement.setBoolean(25, character.isPerformance());
            statement.setBoolean(26, character.isPersuasion());

            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Personagem salvo com sucesso!");
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void getAllCharacters(ArrayList<Character> characters){
        String sql = "SELECT * FROM characters";

        try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)){

            while(resultSet.next()){
                characters.add(new Character(
                        resultSet.getString("name"),
                        resultSet.getString("archetype"),
                        resultSet.getInt("level"),
                        resultSet.getInt("strength"),
                        resultSet.getInt("dexterity"),
                        resultSet.getInt("constitution"),
                        resultSet.getInt("intelligence"),
                        resultSet.getInt("wisdom"),
                        resultSet.getInt("charisma"),
                        resultSet.getBoolean("athletics"),
                        resultSet.getBoolean("acrobatics"),
                        resultSet.getBoolean("sleightOfHand"),
                        resultSet.getBoolean("arcana"),
                        resultSet.getBoolean("history_skill"),
                        resultSet.getBoolean("investigation"),
                        resultSet.getBoolean("nature"),
                        resultSet.getBoolean("religion"),
                        resultSet.getBoolean("animalHandling"),
                        resultSet.getBoolean("insight"),
                        resultSet.getBoolean("medicine"),
                        resultSet.getBoolean("perception"),
                        resultSet.getBoolean("survival"),
                        resultSet.getBoolean("deception"),
                        resultSet.getBoolean("intimidation"),
                        resultSet.getBoolean("performance"),
                        resultSet.getBoolean("persuasion")
                        )
                );
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteChar(String name){
        String sql="DELETE FROM `characters` WHERE name = ?";

        //verifica se o usuário deseja realmente excluir o personagem selecionado

        try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement statement = connection.prepareStatement(sql)){

            statement.setString(1, name);
            int rowsAffected = statement.executeUpdate();

            if(rowsAffected>0){
                String output = "Character " + name + " deleted successfully!";
                JOptionPane.showMessageDialog(null, output);
            }else{
                String output = "Character " + name + " not found!";
                JOptionPane.showMessageDialog(null, output);
            }

        }catch (SQLException e){

        }



    }
}
