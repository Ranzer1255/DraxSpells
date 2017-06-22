package com.example.ranzer.draxspells.data;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class SimpleSpellDataProvider {

	public static List<SpellItem> spellList;
	public static Map<String, SpellItem> spellMap;

	static {
		spellList = new ArrayList<>();
		spellMap = new HashMap<>();

		addSpell(null, "Fireball", 3, "envocation", "S,V,M", "a ball of fire", "Dex Save", null, "8d6");
		addSpell(null, "Firebolt", 0, "envocation", "S,v", "a  small ball of fire", null, "dex", "1d10");
	}

	public static void addSpell(String spellID, String name, int level, String school, String components,
								String description, String saveDC, String attackBonus, String damage) {
		if (spellID != null) {
			spellID = UUID.randomUUID().toString();
		}
		SpellItem spell = new SpellItem(spellID, name, level, school, components,
				description, saveDC, attackBonus, damage);

		addSpell(spell);
	}

	public static void addSpell(SpellItem spell) {
		spellList.add(spell);
		spellMap.put(spell.getSpellID(), spell);
	}
}
