package com.example.thrallon.eosstest1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class kentra_dianomis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kentra_dianomis);
        ListView listView1 = (ListView) findViewById(R.id.listView1);

        Dianomi[] items = {
                new Dianomi(1, "ΑΓΓΛΙΑ"),
                new Dianomi(2, "ΑΥΣΤΡΑΛΙΑ"),
                new Dianomi(3, "ΑΥΣΤΡΙΑ"),
                new Dianomi(4, "ΒΕΛΓΙΟ"),
                new Dianomi(5, "ΓΑΛΛΙΑ"),



        };

        ArrayAdapter<Dianomi> adapter = new ArrayAdapter<Dianomi>(this,
                android.R.layout.simple_list_item_1, items);

        listView1.setAdapter(adapter);
//jhgvckhgjkvjlv
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                switch ((int) id) {
                    case 0:
                        Intent intent0 = new Intent(getApplicationContext(), k_d_1.class);
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getApplicationContext(), k_d_2.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(), Proion3.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getApplicationContext(), Proion4.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getApplicationContext(), Proion5.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getApplicationContext(), Proion6.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getApplicationContext(), Proion7.class);
                        startActivity(intent6);
                        break;


                    // Toast.makeText(getBaseContext(), item, Toast.LENGTH_LONG).show();

                }
            }
        });

    }
}
