package com.example.ranzer.draxspells;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ranzer.draxspells.data.SimpleSpellDataProvider;
import com.example.ranzer.draxspells.data.SpellItem;

import org.w3c.dom.Text;

public class SpellDetailActivity extends AppCompatActivity {

	private SpellItem spellItem;
	private TextView tvSpellName, tvLevelSchool, tvSpellDescription, tvCastingTime, tvRange;
	private TextView tvComponents, tvDuration;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spell_detail);

//		//start test code
//		spellItem = SimpleSpellDataProvider.spellList.get(0);
//		//end test code

		int spellPos = getIntent().getIntExtra(MainActivity.SPELL_POSITION, -1);
		spellItem = SimpleSpellDataProvider.spellList.get(spellPos);

		getViews();

		setSpellName();
		StringBuilder sb = new StringBuilder();

		if (spellItem.getLevel() == 0) {
			tvLevelSchool.setText(String.format("%s Cantrip", spellItem.getSchool()));
		} else {
			tvLevelSchool.setText(String.format("%s Level %s", ordinal(spellItem.getLevel()), spellItem.getSchool()));
		}

		tvSpellDescription.setText(spellItem.getDescription());

		tvCastingTime.setText(spellItem.getCastingTime());
		tvRange.setText(spellItem.getRange());
		tvComponents.setText(spellItem.getComponents());
		tvDuration.setText(spellItem.getDuration());
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

	public static String ordinal(int i) {
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
