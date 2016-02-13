package com.example.huang.nyclive;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CameraListView extends Activity {

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
            "SIE AT 440 WEST SHORE EXPY EXIT 5",
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
                Intent intent = new Intent(CameraListView.this, Camera.class);
                String pos = link[itemPosition];
                intent.putExtra("loc", pos);
                Log.d(TAG, "Located at"+pos);
                startActivity(intent);
            }
        });
    }
}
