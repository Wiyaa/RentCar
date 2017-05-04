package com.example.pens.rentcar;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ListView listView;
   // ArrayAdapter<String> adapter;
    private String[] programmingLang = {
            "Mobil1", "mobil2", "mobil3", "mobil4", "mobil5 ", "mobil6", "mobil7", "mobil8", "mobil9"
    };
    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataSet;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.mobil));
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, Detail2Activity.class);
                intent.putExtra("mobil", listView.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });

//        dataSet = new ArrayList<>();
//        initDataset();
//
//        rvView = (RecyclerView) findViewById(R.id.rv_main);
//        rvView.setHasFixedSize(true);
//
//        /**
//         * Kita menggunakan LinearLayoutManager untuk list standar
//         * yang hanya berisi daftar item
//         * disusun dari atas ke bawah
//         */
//        layoutManager = new LinearLayoutManager(this);
//        rvView.setLayoutManager(layoutManager);
//
//        adapter = new ViewPagerAdapter(dataSet);
//        rvView.setAdapter(adapter);
//
//    }
//
//    private void initDataset(){
//
//        /**
//         * Tambahkan item ke dataset
//         * dalam prakteknya bisa bermacam2
//         * tidak hanya String seperti di kasus ini
//         */
//        dataSet.add("Karin");
//        dataSet.add("Ingrid");
//        dataSet.add("Helga");
//        dataSet.add("Renate");
//        dataSet.add("Elke");
//        dataSet.add("Ursula");
//        dataSet.add("Erika");
//        dataSet.add("Christa");
//        dataSet.add("Gisela");
//        dataSet.add("Monika");

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Confirmation ");
        builder.setMessage("Apakah anda yakin ingin keluar? ");
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                MainActivity.super.onBackPressed();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu); //inflate our menu
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.log:
                // your code
                Intent LoginAccount = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(LoginAccount);
                return true;
            case R.id.search:
                return true;
            default:
                return true;
        }
    }



}
