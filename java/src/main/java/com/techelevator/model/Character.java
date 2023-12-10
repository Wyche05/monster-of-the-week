package com.techelevator.model;

import java.util.List;

public class Character extends Creature {

    private int user_id;

    private String background;

    //Spells is an ability
    private String abilities;
    //Creature is race
    private String creature;
    //Profession is character class
    private String class_profession;
    private int character_strength;
    private int character_dexterity;
    private int character_constitution;
    private int character_intelligence;
    private int character_wisdom;
    private int character_charisma;

    public Character(int id, String character_name, Byte image, int user_id, String background, String abilities, String creature, String class_profession, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(id, character_name, image);
        this.user_id = user_id;
        this.background = background;
        this.abilities = abilities;
        this.creature = creature;
        this.class_profession = class_profession;
        this.character_strength = character_strength;
        this.character_dexterity = character_dexterity;
        this.character_constitution = character_constitution;
        this.character_intelligence = character_intelligence;
        this.character_wisdom = character_wisdom;
        this.character_charisma = character_charisma;
    }

    public Character() {

    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    public String getCreature() {
        return creature;
    }

    public void setCreature(String creature) {
        this.creature = creature;
    }

    public String getClass_profession() {
        return class_profession;
    }

    public void setClass_profession(String class_profession) {
        this.class_profession = class_profession;
    }

    public int getCharacter_strength() {
        return character_strength;
    }

    public void setCharacter_strength(int character_strength) {
        this.character_strength = character_strength;
    }

    public int getCharacter_dexterity() {
        return character_dexterity;
    }

    public void setCharacter_dexterity(int character_dexterity) {
        this.character_dexterity = character_dexterity;
    }

    public int getCharacter_constitution() {
        return character_constitution;
    }

    public void setCharacter_constitution(int character_constitution) {
        this.character_constitution = character_constitution;
    }

    public int getCharacter_intelligence() {
        return character_intelligence;
    }

    public void setCharacter_intelligence(int character_intelligence) {
        this.character_intelligence = character_intelligence;
    }

    public int getCharacter_wisdom() {
        return character_wisdom;
    }

    public void setCharacter_wisdom(int character_wisdom) {
        this.character_wisdom = character_wisdom;
    }

    public int getCharacter_charisma() {
        return character_charisma;
    }

    public void setCharacter_charisma(int character_charisma) {
        this.character_charisma = character_charisma;
    }

    public void setCharacter_id(int newCharacterId) {
    }
}
