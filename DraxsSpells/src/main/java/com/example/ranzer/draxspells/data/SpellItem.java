package com.example.ranzer.draxspells.data;

public class SpellItem {

	private final String spellID;
	private final String name;
	private final int level;
	private final String school;
	private final String castingTime;
	private final String range;
	private final String components;
	private final String duration;
	private final boolean concentration;
	private final String description;
	private final String higherLevels;
	private final String saveDC;
	private final String attackBonus;
	private final String damage;

	public SpellItem(String spellID, String name, int level, String school, String castingTime,
					 String range, String components, String duration, boolean concentration,
					 String description, String higherLevels, String saveDC, String attackBonus,
					 String damage) {

		this.spellID = spellID;
		this.name = name;
		this.level = level;
		this.school = school;
		this.castingTime = castingTime;
		this.range = range;
		this.components = components;
		this.duration = duration;
		this.concentration = concentration;
		this.description = description;
		this.higherLevels = higherLevels;
		this.saveDC = saveDC;
		this.attackBonus = attackBonus;
		this.damage = damage;
	}

	public String getSpellID() {
		return spellID;
	}

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public String getSchool() {
		return school;
	}

	public String getCastingTime() {
		return castingTime;
	}

	public String getRange() {
		return range;
	}

	public String getComponents() {
		return components;
	}

	public String getDuration() {
		return duration;
	}

	public boolean isConcentration() {
		return concentration;
	}

	public String getDescription() {
		return description;
	}

	public String getHigherLevels() {
		return higherLevels;
	}

	public String getSaveDC() {
		return saveDC;
	}

	public String getAttackBonus() {
		return attackBonus;
	}

	public String getDamage() {
		return damage;
	}

	//sorts by Spell level then by name.
    public int compare(SpellItem o2) {
		if(o2.getLevel()==this.getLevel()) {
			return this.name.compareTo(o2.getName());
		} else if(o2.getLevel()<this.getLevel()){
			return 1;
		} else {
			return -1;
		}
    }
}