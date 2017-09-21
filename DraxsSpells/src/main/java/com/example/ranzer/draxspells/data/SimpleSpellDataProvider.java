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

//		addSpell(null, "Fireball", 3, "Evocation", "1 Action", "120 Feet", "S,V,M", "Instantaneous", false,
//				"A bright streak flashes from our pointing finger to a point you choose within range " +
//						"and then blossoms with a low roar into an explosion of flame. Each creature " +
//						"in a 20 foot radius sphere centered on that point must make a Dexterity " +
//						"saving throw. A target takes 8d6 fire damage on a failed save, or half as " +
//						"much damage on a successful one.\n\n" +
//				"The fire spreads around corners. it ignites flammable objects in the area that aren't being worn or carried.",
//				"When you cast this spell using a spell slot of 4th level or higher, the damage increases by 1d6 for each slot level above 3rd",
//				"Dex Save", null, "8d6");

		addSpell(null, "Mage Hand", 0, "Conjuration", "1 Action", "30 Feet", "S,V", "1 Minute", false,
				"A spectral, floating hand appears at a point you choose within range. The hand lasts " +
						"for the duration or until you dismiss it as an action. The hand vanishes if it is " +
						"ever more than 30 feet away from you or if you cast " +
						"this spell again.\n" +
						"You can use your action to control the hand. You can " +
						"use the hand to manipulate an object, open an unlocked " +
						"door or container, stow or retrieve an item from an open " +
						"container, or pour the contents out of a vial. You can " +
						"move the hand up to 30 feet each time you use it.\n" +
						"The hand can't attack, activate magic items, ar carry " +
						"more than 10 pounds.",
				null, null, null, null);

		addSpell(null, "True Strike", 0, "Divination", "1 Action", "30 Feet", "S", "Concentration, up to 1 round", true,
				"You extend your hand and point a finger at a target in range. Your magic grants you " +
						"a brief insight into the target's defenses. On your next turn, you gain advantage " +
						"on your first attack roll against the target, provided that this spell hasn't ended.",
				null, null, null, null);

		addSpell(null, "Firebolt", 0, "Evocation", "1 Action", "120 Feet", "V, S", "Instantaneous", false,
				"You hurl a mote of fire at a creature or object within range. Make a ranged spell attack against the target. On a hit, the target takes 1d10 fire damage. a flammable object hit by this spe3ll ignites if it isn't being worn ro carried.",
				"This spell's damage increases by 1d10 when you reach 5th level (2d10, 11th level (3d10), and 17h level (4d10)",
				null, "1d20+Prof+Dex", "1d10");

		addSpell(null, "Mending", 0, "Transmutation", "1 minute", "Touch", "V,S,M", "Instantaneous",
				false, "This spell repairs a single break or tear in an object you touch, such as a broken " +
						"chain link. two halves of a broken key, a torn c1oak, or a leaking wineskin. " +
						"As	long as the break or tear is no larger than 1 foot in any dimension, " +
						"you mend it. leaving no trace of the former damage.\n" +
						"This spell can physically repair a magic item or construct, but the spell can't restore " +
						"magic to such an object.",
				null, null, null, null);

		addSpell(null, "Prestidigitation", 0, "transmutation", "1 Action", "10 Feet", "V,S", "Up to 1 hour",
				false, "This spell is a minor magical trick that novice spellcasters use for practice. " +
						"You create one of the following magical effects within range:\n\n" +
						"* You create an instantaneous. harmless sensory effect. such as a shower of " +
						"sparks. a puff of wind. faint musical notes. or an odd odor.\n\n" +
						"* You instantaneously light or snuff out a candle. a torch. or a small campfire.\n\n" +
						"* You instantaneously clean or soil an object no larger than 1 cubic foot.\n\n" +
						"* You chill, warm, or flavor up to 1 cubic foot of nonliving material for 1 hour.\n\n" +
						"* You make a color, a small mark, or a symbol appear on an object or " +
						"a surface for 1 hour.\n\n" +
						"* You create a nonmagical trinket or an illusory image that can fit in your " +
						"hand and that lasts until the end of your next turn\n\n" +
						"If you cast this spell multiple times. You can have up to " +
						"three of its non-instantaneous effects active at a time. and you can " +
						"dismiss such an effect as an action.", null, null, null, null
				);

		addSpell(null, "Burning Hands", 1, "evocation", "1 Action", "15 foot cone", "V,S", "Instantaneous", false,
					"As you hold your hands with thumbs touching and fingers spread, a thin sheet of " +
							"flames shoots forth from your outstretched fingertips. Each creature in a 15-foot " +
							"cone must make a Dexterity saving throw. A creature takes 3d6 fire damage " +
							"on a failed save, or half as much damage on a successful one.\n" +
							"The fire ignites any flammable objects in the area that aren't being worn" +
							" or carried.\n",
							"When you cast this spell using a spell slot of 2nd level or higher, the " +
							"damage increases by 1d6 for each slot level above 1st.", "Dex Save",null,"3d8");

		//ray of sickness
		addSpell(null, "Ray of Sickness", 1, "necromancy", "1 Action", "60 Feet", "V,S", "Instantaneous", false,
				"A ray of sickening greenish energy lashes out toward a creature within range. Make " +
						"a ranged spell attack against the target. On a hit, the target takes 2d8 poison " +
						"damage and must make a Constitution saving throw. On a failed save, it is" +
						" also poisoned until the end of your next turn.",
				"When you cast this spell using a spell slot of 2nd level or higher, the damage " +
						"increases by ld8 for each slot level above 1st.",
				"Con Save", "Prof+Spell ability", "2d8 Poison"
		);
		//shatter
		addSpell(null, "Shatter", 2, "evocation", "1 Action", "60 Feet", "V,S,M", "Instantaneous", false,
				"A sudden loud ringing noise, painfully intense, erupts from a point of your choice " +
						"within range. Each creature in a lO-foot-radius sphere centered on that " +
						"point must make a Constitution saving throw. A creature takes 3d8 thunder damage " +
						"on a failed save, or half as much damage on a successful one. A creature " +
						"made of inorganic material such as stone, crystal, or metal has disadvantage on " +
						"this saving throw.\n\n" +
						"nonmagical object that isn't being worn or carried also takes the damage " +
						"if it's in the spell's area.",
				"When you cast this spell using a spell slot of 3rd level or higher, the damage " +
						"increases by ld8 for each slot level above 2nd.",
				"Con Save", null, "3d8 Thunder Damage");

		//hold person
		addSpell(null, "Hold Person", 2, "enchantment", "1 Action", "60 Feet", "V,S,M", "Concentration, up to 1 minute", true,
				"Choose a humanoid that you can see within range. The target must succeed on a " +
						"Wisdom saving throw or be paralyzed for the duration. At the end of each of " +
						"its turns. the target can make another Wisdom saving throw. On a success. " +
						"the spell ends on the target.",
				"When you cast this spell using a spell slot of 3rd level or higher, you can target " +
						"one additional humanoid for each slot level above 2nd. The humanoids must " +
						"be within 30 feet of each other when you target them.",
				"Wis Save", null, null);

		//blur
		addSpell(null, "Blur", 2, "illusion", "1 action", "Self", "V", "Concentration, up to 1 minute", true,
				"Your body becomes blurred, shifting and wavering to all who can see you. For the " +
						"duration, any creature has disadvantage on attack rolls against you. An " +
						"attacker is immune to this effect if it doesn't rely on sight, " +
						"as with blindsight, or can see through illusions, as with truesight.",
				null, null, null, null);
	}

	public static void addSpell(String spellID, String name, int level, String school, String castingTime,
								String range, String components, String duration, boolean concentration,
								String description, String higherLevels, String saveDC, String attackBonus,
								String damage) {
		if (spellID == null) {
			spellID = UUID.randomUUID().toString();
		}
		SpellItem spell = new SpellItem(spellID, name, level, school, castingTime, range, components,
				duration, concentration, description, higherLevels, saveDC,
				attackBonus, damage);

		addSpell(spell);
	}

	public static void addSpell(SpellItem spell) {
		spellList.add(spell);
		spellMap.put(spell.getName(), spell);
	}
}
