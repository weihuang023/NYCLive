package com.example.huang.nyclive;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class QueensCam extends Activity {

    protected static final String TAG = "NYCLive";

    ListView listView;
    ArrayAdapter<String> adapter;

    public int itemPosition;
    public String[] link = new String[]{
            "http://207.251.86.238/cctv227.jpg",
            "http://207.251.86.238/cctv223.jpg",
            "http://webcam.mta.info/btimg/172.28.208.8/1/image.jpg",
            "http://207.251.86.238/cctv14.jpg",
            "http://webcam.mta.info/btimg/172.28.208.8/2/image.jpg",
            "http://207.251.86.238/cctv110.jpg",
            "http://207.251.86.238/cctv35.jpg",
            "http://207.251.86.238/cctv5.jpg",
            "http://207.251.86.238/cctv69.jpg",
            "http://207.251.86.238/cctv225.jpg",
            "http://207.251.86.238/cctv2.jpg",
            "http://207.251.86.238/cctv38.jpg",
            "http://207.251.86.238/cctv33.jpg",
            "http://207.251.86.238/cctv178.jpg",
            "http://207.251.86.238/cctv120.jpg",
            "http://webcam.mta.info/btimg/172.28.205.8/2/image.jpg",
            "http://webcam.mta.info/btimg/172.28.205.8/1/image.jpg",
            "http://207.251.86.238/cctv21.jpg",
            "http://207.251.86.238/cctv15.jpg",
            "http://207.251.86.238/cctv16.jpg",
            "http://207.251.86.238/cctv27.jpg",
            "http://207.251.86.238/cctv74.jpg",
            "http://207.251.86.238/cctv134.jpg",
            "http://207.251.86.238/cctv23.jpg",
            "http://207.251.86.238/cctv24.jpg",
            "http://207.251.86.238/cctv25.jpg",
            "http://207.251.86.238/cctv22.jpg",
            "http://207.251.86.238/cctv64.jpg",
            "http://207.251.86.238/cctv88.jpg",
            "http://207.251.86.238/cctv202.jpg",
            "http://207.251.86.238/cctv201.jpg",
            "http://207.251.86.238/cctv127.jpg",
            "http://207.251.86.238/cctv49.jpg",
            "http://207.251.86.238/cctv103.jpg",
            "http://207.251.86.238/cctv46.jpg",
            "http://207.251.86.238/cctv45.jpg",
            "http://207.251.86.238/cctv163.jpg",
            "http://207.251.86.238/cctv98.jpg",
            "http://207.251.86.238/cctv112.jpg",
            "http://207.251.86.238/cctv67.jpg",
            "http://207.251.86.238/cctv113.jpg",
    };
    public String[] values = new String[]{
            "BROADWAY AT 169 STREET",
            "BROADWAY AT 46 STREET",
            "BROADWAY AT FRANKLIN STREET",
            "BROADWAY AT GREENWICH STREET",
            "BROADWAY AT HOWARD STREET",
            "BROADWAY AT PINE STREET",
            "BROADWAY AT VESEY STREET",
            "BRONX RIVER PARKWAY AT 233 STREET",
            "BROOKLYN BATTERY TUNNEL AT WEST STREET",
            "BROOKLYN BRIDGE AT Centre STREET",
            "BROOKLYN BATTERY TUNNEL AT BROOKLYN SIDE",
            "BRUCKNER AT TRIBORO BRIDGE",
            "BRUCKNER EXPY AT BRONX RIVER PARKWAY",
            "CENTRAL PARK S AT COLUMBUS CIRCLE",
            "CENTRAL PARK W AT 96 STREET",
            "CHURCH STREET AT FRANKLIN STREET",
            "CHURCH STREET AT PARK PLAZA",
            "CHURCH STREET AT VESEY",
            "CLEARVIEW AT NORTHERN BOULEVARD",
            "CROSS BRONX EXPY AT EAST OF BRONX RIVER PARKWAY",
            "CROSS BRONX EXPY AT EAST OF UNDERCLIFF  GWB",
            "CROSS BRONX EXPY AT RANDALL AVENUE",
            "CROSS BRONX PARKWAY AT BAYSIDE MARINA",
            "CROSS BRONX PARKWAY AT THROGSNECK",
            "CROSS BRONX PARKWAY AT UNION TPKE",
            "CROSSBAY AT NORTH BOUND",
            "CROSSBAY AT SOUTH BOUND",
            "DYER AT 42 STREET",
            "E 57 STREET AT QBB",
            "E 63 STREET AT QBB",
            "FDR AT 111 ST",
            "FDR AT 135 STREET",
            "FDR AT 155 STREET",
            "FDR AT 23 STREET",
            "FDR AT 3 AVENUE",
            "FDR DR AT 36 STREET",
            "FDR DR AT 78 STREET",
            "FDR DR AT 96 STREET",
            "FDR DR AT CATHERINE STREET",
            "FDR DR AT OLD SLIP",
            "FLATBUSH AT TILLARY",
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
                Intent intent = new Intent(QueensCam.this, Camera.class);
                String pos = link[itemPosition];
                intent.putExtra("loc", pos);
                Log.d(TAG, "Located at"+pos);
                startActivity(intent);
            }
        });
    }
}
