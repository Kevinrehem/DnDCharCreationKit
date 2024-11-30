package model;

public class Character {
    private String name, archetype;
    private int level, strength, dexterity, constitution, intelligence, wisdom, charisma;
    private boolean athletics, acrobatics, sleightOfHand, arcana, history, investigation,
            nature, religion, animalHandling, insight, medicine, perception, survival, deception, intimidation,
            performance, persuasion;

    public Character(String name, String archetype, int level, int strength,
                         int dexterity, int constitution, int intelligence, int wisdom,
                         int charisma, boolean athletics, boolean acrobatics, boolean sleightOfHand,
                         boolean arcana, boolean history, boolean investigation, boolean nature,
                         boolean religion, boolean animalHandling, boolean insight, boolean medicine,
                         boolean perception, boolean survival, boolean deception, boolean intimidation,
                         boolean performance, boolean persuasion
                    ) {
        this.name = name;
        this.archetype = archetype;
        this.level = level;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.athletics = athletics;
        this.acrobatics = acrobatics;
        this.sleightOfHand = sleightOfHand;
        this.arcana = arcana;
        this.history = history;
        this.investigation = investigation;
        this.nature = nature;
        this.religion = religion;
        this.animalHandling = animalHandling;
        this.insight = insight;
        this.medicine = medicine;
        this.perception = perception;
        this.survival = survival;
        this.deception = deception;
        this.intimidation = intimidation;
        this.performance = performance;
        this.persuasion = persuasion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArchetype() {
        return archetype;
    }

    public void setArchetype(String archetype) {
        this.archetype = archetype;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public boolean isAthletics() {
        return athletics;
    }

    public void setAthletics(boolean athletics) {
        this.athletics = athletics;
    }

    public boolean isAcrobatics() {
        return acrobatics;
    }

    public void setAcrobatics(boolean acrobatics) {
        this.acrobatics = acrobatics;
    }

    public boolean isSleightOfHand() {
        return sleightOfHand;
    }

    public void setSleightOfHand(boolean sleightOfHand) {
        this.sleightOfHand = sleightOfHand;
    }

    public boolean isArcana() {
        return arcana;
    }

    public void setArcana(boolean arcana) {
        this.arcana = arcana;
    }

    public boolean isHistory() {
        return history;
    }

    public void setHistory(boolean history) {
        this.history = history;
    }

    public boolean isInvestigation() {
        return investigation;
    }

    public void setInvestigation(boolean investigation) {
        this.investigation = investigation;
    }

    public boolean isNature() {
        return nature;
    }

    public void setNature(boolean nature) {
        this.nature = nature;
    }

    public boolean isReligion() {
        return religion;
    }

    public void setReligion(boolean religion) {
        this.religion = religion;
    }

    public boolean isAnimalHandling() {
        return animalHandling;
    }

    public void setAnimalHandling(boolean animalHandling) {
        this.animalHandling = animalHandling;
    }

    public boolean isInsight() {
        return insight;
    }

    public void setInsight(boolean insight) {
        this.insight = insight;
    }

    public boolean isMedicine() {
        return medicine;
    }

    public void setMedicine(boolean medicine) {
        this.medicine = medicine;
    }

    public boolean isPerception() {
        return perception;
    }

    public void setPerception(boolean perception) {
        this.perception = perception;
    }

    public boolean isSurvival() {
        return survival;
    }

    public void setSurvival(boolean survival) {
        this.survival = survival;
    }

    public boolean isDeception() {
        return deception;
    }

    public void setDeception(boolean deception) {
        this.deception = deception;
    }

    public boolean isIntimidation() {
        return intimidation;
    }

    public void setIntimidation(boolean intimidation) {
        this.intimidation = intimidation;
    }

    public boolean isPerformance() {
        return performance;
    }

    public void setPerformance(boolean performance) {
        this.performance = performance;
    }

    public boolean isPersuasion() {
        return persuasion;
    }

    public void setPersuasion(boolean persuasion) {
        this.persuasion = persuasion;
    }
}
