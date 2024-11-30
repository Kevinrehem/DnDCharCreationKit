package dbconnect;

import model.Character;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CharacterDAO {
    public void saveCharacter(Character character) throws SQLException {
        String sql = "INSERT INTO personagens(" +
                "nome, classe,nivel,forca,dextreza,constituicao,inteligencia,sabedoria,carisma, atlhletics," +
                "    acrobatics, sleight_of_hand, arcana, history_skill , investigation , nature, religion, animal_handling," +
                "    insight, medicine, perception, survival, deception, intimidation, performance, persuasion" +
                "    )";
        PreparedStatement ps = null;
        try {
            ps = DBConnection.getConnection().prepareStatement(sql);
            ps.setString(1,character.getName());
            ps.setString(2,character.getArchetype());
            ps.setInt(3,character.getLevel());
            ps.setInt(4,character.getStrength());
            ps.setInt(5,character.getDexterity());
            ps.setInt(6, character.getConstitution());
            ps.setInt(7, character.getIntelligence());
            ps.setInt(8, character.getWisdom());
            ps.setInt(9,character.getCharisma());
            ps.setBoolean(10, character.isAthletics());
            ps.setBoolean(12, character.isAcrobatics());
            ps.setBoolean(13, character.isSleightOfHand());
            ps.setBoolean(14, character.isArcana());
            ps.setBoolean(15, character.isHistory());
            ps.setBoolean(16, character.isInvestigation());
            ps.setBoolean(17, character.isNature());
            ps.setBoolean(18, character.isReligion());
            ps.setBoolean(19, character.isAnimalHandling());
            ps.setBoolean(20, character.isInsight());
            ps.setBoolean(21, character.isMedicine());
            ps.setBoolean(22, character.isPerception());
            ps.setBoolean(23, character.isSurvival());
            ps.setBoolean(24, character.isDeception());
            ps.setBoolean(25, character.isIntimidation());
            ps.setBoolean(26, character.isPerformance());
            ps.setBoolean(27, character.isPersuasion());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
