package com.example.huang.nyclive;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BronxCam extends Activity {
    protected static final String TAG = "NYCLive";
    ListView listView;
    ArrayAdapter<String> adapter;
    public int itemPosition;
    public String[] link = new String[]{
            "http://207.251.86.238/cctv83.jpg",
            "http://207.251.86.238/cctv137.jpg",
            "http://207.251.86.238/cctv138.jpg",
            "http://webcam.mta.info/btimg/172.28.209.8/2/image.jpg",
            "http://webcam.mta.info/btimg/172.28.202.8/1/image.jpg",
            "http://207.251.86.238/cctv63.jpg",
            "http://207.251.86.238/cctv52.jpg",
            "http://207.251.86.238/cctv53.jpg",
            "http://207.251.86.238/cctv198.jpg",
            "http://webcam.mta.info/btimg/172.28.211.8/1/image.jpg",
            "http://207.251.86.238/cctv232.jpg",
            "http://207.251.86.238/cctv48.jpg",
            "http://207.251.86.238/cctv218.jpg",
            "http://207.251.86.238/cctv192.jpg", "http://207.251.86.238/cctv59.jpg",
            "http://207.251.86.238/cctv190.jpg","http://207.251.86.238/cctv50.jpg",
            "http://207.251.86.238/cctv189.jpg",
           "http://207.251.86.238/cctv197.jpg",
            "http://webcam.mta.info/btimg/172.28.203.8/2/image.jpg",
            "http://webcam.mta.info/btimg/172.28.203.8/1/image.jpg",
            "http://207.251.86.238/cctv121.jpg",
            "http://207.251.86.238/cctv183.jpg",
            "http://207.251.86.238/cctv217.jpg"
    };
    public String[] values = new String[]{
            "MAJOR DEEGAN AT TRIBORO BRIDGE",
            "MAJOR DEEGAN EXPY AT N of ALEX HAMILTON BRIDGE",
            "MAJOR DEEGAN EXPY AT S of W 167 STREETreet",
            "MANHATTAN BBT ENTANCE",
            "MARINE PARKWAY AT NORTH BOUND",
            "MARINE PARKWAY AT SOUTH BOUND",
            "NE THRUWAY AT CONNER STREET",
            "NEW ENGLAND THRU AT BARTOW",
            "NEW ENGLAND TRWY AT EAST TREMONT",
            "NORTHERN BOULEVARD AT 60 STREET",
            "NORTHERN BOULEVARD AT GCP",
            "OCEANIA AT LIE",
            "OUTERBRIDGE CROSSING AT TYRELLAN AVENUE",
            "PROSPECT EXPY AT FORD HAMILTON PARKWAY",
            "QUEENS BOULEVARD AT 65 AVENUE",
            "QUEENS BOULEVARD AT 65 PLAZA",
            "QUEENS BOULEVARD AT QNCNT MALL",
            "QUEENS BOULEVARD AT 36 STREETreet",
            "QUEENS BOULEVARD AT 51 STREET",
            "QUEENS BOULEVARD AT VAN DAM",
            "QUEENS MIDTOWN TUNNEL AT MANHATTAN BOUND",
            "QUEENS MIDTOWN TUNNEL AT QUEENS BOUND",
            "QUEENS Plaza N AT QUEENS BORO BRIDGE",
            "SIE AT 440 DR M.L.KING EXPY EXIT 9",
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
                Intent intent = new Intent(BronxCam.this, Camera.class);
                String pos = link[itemPosition];
                intent.putExtra("loc", pos);
                Log.d(TAG, "Located at"+pos);
                startActivity(intent);
            }
        });
    }
}
