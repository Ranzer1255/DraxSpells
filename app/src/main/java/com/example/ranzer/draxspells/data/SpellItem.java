package com.example.ranzer.draxspells.data;

public class SpellItem {

	private String spellID;
	private String name;
	private int level;
	private String school;
	private String components;
	private String description;
	private String saveDC;
	private String attackBonus;
	private String damage;

	public SpellItem(String spellID, String name, int level, String school, String components,
					 String description, String saveDC, String attackBonus, String damage) {

		this.spellID = spellID;
		this.name = name;
		this.level = level;
		this.school = school;
		this.components = components;
		this.description = description;
		this.saveDC = saveDC;
		this.attackBonus = attackBonus;
		this.damage = damage;
	}

	public String getSpellID() {
		return spellID;
	}

	public void setSpellID(String spellID) {
		this.spellID = spellID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getComponents() {
		return components;
	}

	public void setComponents(String components) {
		this.components = components;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSaveDC() {
		return saveDC;
	}

	public void setSaveDC(String saveDC) {
		this.saveDC = saveDC;
	}

	public String getAttackBonus() {
		return attackBonus;
	}

	public void setAttackBonus(String attackBonus) {
		this.attackBonus = attackBonus;
	}

	public String getDamage() {
		return damage;
	}

	public void setDamage(String damage) {
		this.damage = damage;
	}
}
