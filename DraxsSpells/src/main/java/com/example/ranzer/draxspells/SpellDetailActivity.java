package com.example.ranzer.draxspells;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ranzer.draxspells.data.SimpleSpellDataProvider;
import com.example.ranzer.draxspells.data.SpellItem;

public class SpellDetailActivity extends AppCompatActivity {

	private SpellItem spellItem;
	private TextView tvSpellName, tvLevelSchool, tvSpellDescription, tvCastingTime, tvRange;
	private TextView tvComponents, tvDuration;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spell_detail);

		String spellName = getIntent().getStringExtra(MainActivity.SPELL_NAME);
		spellItem = SimpleSpellDataProvider.spellMap.get(spellName);

		getViews();

		setSpellName();

		if (spellItem.getLevel() == 0) {
			tvLevelSchool.setText(String.format("%s Cantrip", spellItem.getSchool()));
		} else {
			tvLevelSchool.setText(String.format("%s Level %s", ordinal(spellItem.getLevel()), spellItem.getSchool()));
		}

		setDescription();

		tvCastingTime.setText(spellItem.getCastingTime());
		tvRange.setText(spellItem.getRange());
		tvComponents.setText(spellItem.getComponents());
		tvDuration.setText(spellItem.getDuration());
	}

	private void setDescription() {

		tvSpellDescription.setText(
				(spellItem.getHigherLevels() != null) ?
						String.format("%s\n\nAt Higher Levels\n\n%s",
								spellItem.getDescription(), spellItem.getHigherLevels()) :
						spellItem.getDescription()
		);
	}

	private void setSpellName() {
		StringBuilder sb = new StringBuilder();

		sb.append(spellItem.getName());
		if (spellItem.isConcentration()) {
			sb.append(" [C]");
		}
		tvSpellName.setText(sb.toString());
	}

	private void getViews() {
		tvSpellName = (TextView) findViewById(R.id.spellName);
		tvLevelSchool = (TextView) findViewById(R.id.levelAndSchool);
		tvSpellDescription = (TextView) findViewById(R.id.spellDescription);
		tvCastingTime = (TextView) findViewById(R.id.CastingTime);
		tvRange = (TextView) findViewById(R.id.Range);
		tvComponents = (TextView) findViewById(R.id.components);
		tvDuration = (TextView) findViewById(R.id.duration);
	}

	private static String ordinal(int i) {
		String[] sufixes = new String[]{"th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th"};
		switch (i % 100) {
			case 11:
			case 12:
			case 13:
				return i + "th";
			default:
				return i + sufixes[i % 10];

		}
	}
}
