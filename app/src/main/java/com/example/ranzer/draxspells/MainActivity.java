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
import java.util.List;

public class MainActivity extends AppCompatActivity {

	private final static String TAG = "MainActivity";
	public final static String SPELL_POSITION = "spellPosition";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.v(TAG, "Starting MainActivity");
		setContentView(R.layout.activity_main);

		List<String> spellList = new ArrayList<>();
		for (SpellItem spell : SimpleSpellDataProvider.spellList) {
			spellList.add(spell.getName());
		}
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, spellList);

		ListView lv = (ListView) findViewById(android.R.id.list);
		lv.setAdapter(adapter);

		lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				launchDetailActivity(position);
			}
		});

	}

	private void launchDetailActivity(int position) {
		Intent intent = new Intent(this, SpellDetailActivity.class);
		intent.putExtra(SPELL_POSITION, position);
		startActivity(intent);
	}
}
