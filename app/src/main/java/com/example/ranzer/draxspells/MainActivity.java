package com.example.ranzer.draxspells;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ranzer.draxspells.data.SimpleSpellDataProvider;
import com.example.ranzer.draxspells.data.SpellItem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class MainActivity extends AppCompatActivity {

	private final static String TAG = "MainActivity";
	public static final String SPELL_NAME = "spellName";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.v(TAG, "Starting MainActivity");
		setContentView(R.layout.activity_main);

		final List<String> spellList = new ArrayList<>();
		SimpleSpellDataProvider.spellList.stream().sorted(new Comparator<SpellItem>() {
			@Override
			public int compare(SpellItem o1, SpellItem o2) {
				return o1.compare(o2);
			}
		}).forEach(new Consumer<SpellItem>() {
			@Override
			public void accept(SpellItem spellItem) {
				spellList.add(spellItem.getName());
			}
		});

//		for (SpellItem spell : SimpleSpellDataProvider.spellList) {
//			spellList.add(spell.getName());
//		}
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, spellList);

		ListView lv = (ListView) findViewById(android.R.id.list);
		lv.setAdapter(adapter);

		lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				launchDetailActivity(spellList.get(position));
			}
		});

	}

	private void launchDetailActivity(String spell) {
		Intent intent = new Intent(this, SpellDetailActivity.class);
		intent.putExtra(SPELL_NAME, spell);
		startActivity(intent);
	}
}
