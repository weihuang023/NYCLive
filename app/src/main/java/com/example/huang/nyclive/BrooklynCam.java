package com.example.huang.nyclive;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BrooklynCam extends Activity {

    protected static final String TAG = "NYCLive";

    ListView listView;
    ArrayAdapter<String> adapter;

    public int itemPosition;
    public String[] link = new String[]{
            "http://207.251.86.238/cctv113.jpg",
            "http://webcam.mta.info/btimg/172.28.204.8/2/image.jpg",
            "http://webcam.mta.info/btimg/172.28.204.8/1/image.jpg",
            "http://207.251.86.238/cctv28.jpg",
            "http://207.251.86.238/cctv173.jpg",
            "http://207.251.86.238/cctv176.jpg",
            "http://207.251.86.238/cctv188.jpg",
            "http://207.251.86.238/cctv92.jpg",
            "http://207.251.86.238/cctv40.jpg",
            "http://207.251.86.238/cctv32.jpg",
            "http://207.251.86.238/cctv247.jpg",
            "http://207.251.86.238/cctv181.jpg",
            "http://207.251.86.238/cctv182.jpg",
            "http://207.251.86.238/cctv157.jpg",
            "http://207.251.86.238/cctv129.jpg",
            "http://207.251.86.238/cctv55.jpg",
            "http://207.251.86.238/cctv58.jpg",
            "http://207.251.86.238/cctv91.jpg",
            "http://207.251.86.238/cctv191.jpg",
            "http://207.251.86.238/cctv111.jpg",
            "http://207.251.86.238/cctv184.jpg",
            "http://webcam.mta.info/btimg/172.28.206.8/1/image.jpg",
            "http://webcam.mta.info/btimg/172.28.206.8/2/image.jpg",
            "http://207.251.86.238/cctv122.jpg",
            "http://207.251.86.238/cctv36.jpg",
            "http://207.251.86.238/cctv187.jpg",
            "http://207.251.86.238/cctv149.jpg",
            "http://207.251.86.238/cctv95.jpg",
            "http://207.251.86.238/cctv47.jpg",
            "http://207.251.86.238/cctv146.jpg",
            "http://207.251.86.238/cctv148.jpg",
            "http://207.251.86.238/cctv145.jpg",
            "http://207.251.86.238/cctv185.jpg",
            "http://webcam.mta.info/btimg/172.28.207.8/2/image.jpg",
            "http://webcam.mta.info/btimg/172.28.207.8/1/image.jpg",
            "http://207.251.86.238/cctv54.jpg",
            "http://207.251.86.238/cctv135.jpg",
            "http://207.251.86.238/cctv96.jpg",
            "http://207.251.86.238/cctv142.jpg",
            "http://207.251.86.238/cctv133.jpg",
            "http://207.251.86.238/cctv83.jpg",
    };
    public String[] values = new String[]{
            "FORDHAM ROAD AT HUGHES AVENUE",
            "FORDHAM ROAD AT GRAND CONCOURSE",
            "GCP AT 166 STREET",
            "GCP AT 214 STREET",
            "GCP AT 31 ST",
            "GOWANUS EXPYAT 63 STREET",
            "GOWANUS EXPYAT 92 STREET",
            "GOWANUS EXPYAT GOWANUS PROSPECT",
            "GOWANUS EXPYAT SACKETT STREET",
            "Gower STREET WOF MANOR ROAD UNDERPASS",
            "GRAND BREWER AT BELT",
            "GRAND ARMY PLAZA",
            "GWB APPROACH",
            "H BEACH AT 158 STREET",
            "HARLEM RIVER DR AT G WASHINGTON BRIDGE",
            "HENRY HUDSON AT 72 STREET",
            "HENRY HUDSON AT NORTH BOUND",
            "HENRY HUDSON AT SOUTH BOUND",
            "HENRY HUDSON PARKWAY AT 125 STREET",
            "HENRY HUDSON PARKWAY AT 135 STREET",
            "HENRY HUDSON PARKWAY AT 153 STREET",
            "HENRY HUDSON PARKWAY AT 232 STREET",
            "HENRY HUDSON PARKWAY AT 58 ST",
            "HENRY HUDSON PARKWAY AT 96 ST",
            "HOLLAND TUNNEL",
            "HUTCHISON RIVER PARKWAY AT EAST TREMONT",
            "HUTCHISON RIVER PARKWAY AT WHITESTONE BR",
            "HYLAN BOULEVARD AT NEW DORP LANE",
            "LEXINGTON AT 59 STREET",
            "LEXINGTON AT 72 STREET",
            "LEXINGTON AT 86 STREET",
            "LIE AT 84 STREET",
            "LIE AT GCP",
            "LIE AT KISSENA BOULEVARD",
            "LIE AT MARATHON BOULEVARD",
            "LIE AT MIDTOWN TUNNEL",
            "LIE NEAR WOODHAVEN BOULEVARD",
            "LINCOLN TUNNEL",
            "MACOMBS DAM BRIDGE",
            "MAJOR DEEGAN AT TRIBORO BRIDGE",
            "MAJOR DEEGAN EXPY AT N of ALEX HAMILTON BRIDGE",
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
                Intent intent = new Intent(BrooklynCam.this, Camera.class);
                String pos = link[itemPosition];
                intent.putExtra("loc", pos);
                Log.d(TAG, "Located at"+pos);
                startActivity(intent);
            }
        });
    }
}
