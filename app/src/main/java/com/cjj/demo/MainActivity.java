package com.cjj.demo;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static com.cjj.demo.LoadingActivity.EXTRA_FRAGMENT;
import static com.cjj.demo.LoadingActivity.EXTRA_TITLE;
import static com.cjj.demo.LoadingActivity.FRAGMENT_DEFAULT;
import static com.cjj.demo.LoadingActivity.FRAGMENT_EMPTY;
import static com.cjj.demo.LoadingActivity.FRAGMENT_FAILURE;

public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener{
	
	private String[] title = new String[]{"DefaultView", "EmptyView", "FairView"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_selectable_list_item,title);
       ListView lv =  (ListView)findViewById(R.id.lv);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);
    }
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		return super.onCreateOptionsMenu(menu);
	}

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(MainActivity.this, LoadingActivity.class);
        intent.putExtra(EXTRA_TITLE, title[position]);
        switch(position)
        {
            case 0:
                intent.putExtra(EXTRA_FRAGMENT, FRAGMENT_DEFAULT);
                break;
            case 1:
                intent.putExtra(EXTRA_FRAGMENT, FRAGMENT_EMPTY);
                break;
            case 2:
                intent.putExtra(EXTRA_FRAGMENT,FRAGMENT_FAILURE);
                break;
        }
        startActivity(intent);
    }
}
