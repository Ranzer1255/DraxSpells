package com.example.ranzer.draxspells;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.ranzer.draxspells.data.SimpleSpellDataProvider;
import com.example.ranzer.draxspells.data.SpellItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

		List<String> spellList = new ArrayList<>();
		for (SpellItem spell : SimpleSpellDataProvider.spellList) {
			spellList.add(spell.getName());
		}
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, spellList);

		ListView lv = (ListView) findViewById(android.R.id.list);
		lv.setAdapter(adapter);

    }
}
