package com.example.huang.nyclive;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ManhattanCam extends Activity {

    protected static final String TAG = "NYCLive";

    ListView listView;
    ArrayAdapter<String> adapter;

    public int itemPosition;
    public String[] link = new String[]{
            "http://207.251.86.238/cctv254.jpg",
            "http://207.251.86.238/cctv254.jpg",
            "http://207.251.86.238/cctv252.jpg",
            "http://207.251.86.238/cctv196.jpg",
            "http://207.251.86.238/cctv200.jpg",
            "http://207.251.86.238/cctv31.jpg",
            "http://207.251.86.238/cctv251.jpg",
            "http://207.251.86.238/cctv102.jpg",
            "http://207.251.86.238/cctv4.jpg",
            "http://207.251.86.238/cctv3.jpg",
            "http://207.251.86.238/cctv7.jpg",
            "http://207.251.86.238/cctv466.jpg",
            "http://207.251.86.238/cctv8.jpg",
            "http://207.251.86.238/cctv9.jpg",
            "http://207.251.86.238/cctv12.jpg",
            "http://207.251.86.238/cctv10.jpg",
            "http://207.251.86.238/cctv66.jpg",
            "http://207.251.86.238/cctv68.jpg",
            "http://207.251.86.238/cctv70.jpg",
            "http://207.251.86.238/cctv19.jpg",
            "http://207.251.86.238/cctv20.jpg",
            "http://207.251.86.238/cctv18.jpg",
            "http://207.251.86.238/cctv238.jpg",
            "http://207.251.86.238/cctv17.jpg",
            "http://207.251.86.238/cctv89.jpg",
            "http://207.251.86.238/cctv29.jpg",
            "http://207.251.86.238/cctv11.jpg",
            "http://207.251.86.238/cctv117.jpg",
            "http://207.251.86.238/cctv125.jpg",
            "http://207.251.86.238/cctv167.jpg",
            "http://207.251.86.238/cctv114.jpg",
            "http://207.251.86.238/cctv72.jpg",
            "http://207.251.86.238/cctv116.jpg",
            "http://207.251.86.238/cctv61.jpg",
            "http://207.251.86.238/cctv115.jpg",
            "http://207.251.86.238/cctv13.jpg",
            "http://207.251.86.238/cctv105.jpg",
            "http://207.251.86.238/cctv106.jpg",
            "http://207.251.86.238/cctv65.jpg",
            "http://207.251.86.238/cctv26.jpg",
            "http://207.251.86.238/cctv208.jpg",
    };
    public String[] values = new String[]{
            "1 AVENUE AT 124 STREET",
            "1 AVENUE AT 79 STREET",
            "1 AVENUE AT 80 STREET",
            "11 AVENUE AT 34 STREET",
            "11 AVENUE AT 42 STREET",
            "2 AVENUE AT 110 STREET",
            "2 AVENUE AT 125 STREET",
            "2 AVENUE AT 36 STREET-MIDTOWN TUNNEL",
            "2 AVENUE AT QBB",
            "9 AVENUE AT 207 STREET",
            "5 AVENUE AT 23 STREET",
            "5 AVENUE AT 42 STREET",
            "5 AVENUE AT 49 STREET",
            "6 AVENUE AT 34 STREET",
            "6 AVENUE AT 42 STREET",
            "6 AVENUE AT 49 STREET",
            "7 AVENUE AT 125 STREET",
            "8 AVENUE AT 110 STREET",
            "8 AVENUE AT 34 STREET",
            "8 AVENUE AT 42 STREET",
            "8 AVENUE AT COLUMBUS CIRCLE",
            "9 AVENUE AT 30th STREET",
            "9 AVENUE AT 34 STREET",
            "ADAMS AT TILLARY",
            "AMSTERDAM AVENUE AT 178 STREET",
            "BAXTER AT CANAL STREET",
            "BELT AT 130 STREET",
            "BELT AT 225 STREET",
            "BELT AT BROOKVILLE",
            "BELT AT KNAPP",
            "BELT PARKWAY AT PAERDEGAT BASIN BRIDGE",
            "BELT PARKWAY AT 68 STREET",
            "BELT PARKWAY AT CROSS BAY BOULEVARD",
            "BELT PARKWAY AT ERSKINE",
            "BELT PARKWAY AT FLATBUSH",
            "BELT PARKWAY AT OCEN PARKWAY",
            "BOWERY AT CANAL STREET",
            "BQE AT BROOKLYN NAVY YARD",
            "BQE AT BROADWAY",
            "BQE AT HAMILTON AVENUE B-G RAMP",
            "BROADWAY AT 169 STREET",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_list);
        listView = (ListView) findViewById(R.id.list);

        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView listView, View view, int position, long id) {
                itemPosition = position;
                Intent intent = new Intent(ManhattanCam.this, Camera.class);
                String pos = link[itemPosition];
                intent.putExtra("loc", pos);
                Log.d(TAG, "Located at"+pos);
                startActivity(intent);
            }
        });
    }
}
