package com.example.ranzer.draxspells;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ranzer.draxspells.data.SimpleSpellDataProvider;
import com.example.ranzer.draxspells.data.SpellItem;

public class SpellDetailActivity extends AppCompatActivity {

	private SpellItem spellItem;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spell_detail);

//		//start test code
//		spellItem = SimpleSpellDataProvider.spellList.get(0);
//		//end test code

		int spellPos = getIntent().getIntExtra(MainActivity.SPELL_POSITION, -1);
		spellItem = SimpleSpellDataProvider.spellList.get(spellPos);

		TextView tvSpellName = (TextView) findViewById(R.id.spellName);
		TextView tvLevelSchool = (TextView) findViewById(R.id.levelAndSchool);
		TextView tvSpellDescription = (TextView) findViewById(R.id.spellDescription);

		tvSpellName.setText(spellItem.getName());
		StringBuilder sb = new StringBuilder();

		if (spellItem.getLevel() == 0) {
			tvLevelSchool.setText(String.format("%s Cantrip", spellItem.getSchool()));
		} else {
			tvLevelSchool.setText(String.format("%s Level %s", ordinal(spellItem.getLevel()), spellItem.getSchool()));
		}

		tvSpellDescription.setText(spellItem.getDescription());
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
