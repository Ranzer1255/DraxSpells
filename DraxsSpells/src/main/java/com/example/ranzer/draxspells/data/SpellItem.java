package com.example.ranzer.draxspells.data;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class SpellItem {

	@PrimaryKey
	private final String spellID;
	@ColumnInfo
	private final String name;
	@ColumnInfo
	private final int level;
	@ColumnInfo
	private final String school;
	@ColumnInfo
	private final String castingTime;
	@ColumnInfo
	private final String range;
	@ColumnInfo
	private final String components;
	@ColumnInfo
	private final String duration;
	@ColumnInfo
	private final boolean concentration;
	@ColumnInfo
	private final String description;
	@ColumnInfo
	private final String higherLevels;
	@ColumnInfo
	private final String saveDC;
	@ColumnInfo
	private final String attackBonus;
	@ColumnInfo
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

	/**
	 * compares this object with another SpellItem. first by Spell Level, then by Spell Name
	 * Lexicographically
	 *
	 * @param o2 SpellItem to be compared to
	 * @return 0 if both the spell level and spell name are equal. -1 if this is lower in spell level
	 * or in spell name lexicographically. 1 if this is higher in spell level or spell name lexicographically
	 */
	public int compareTo(SpellItem o2) {
		if(o2.getLevel()==this.getLevel()) {
			return this.name.compareTo(o2.getName());
		} else if(o2.getLevel()<this.getLevel()){
			return 1;
		} else {
			return -1;
		}
	}
}