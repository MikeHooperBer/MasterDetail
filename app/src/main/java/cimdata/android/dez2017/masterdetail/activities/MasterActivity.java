package cimdata.android.dez2017.masterdetail.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;

import cimdata.android.dez2017.masterdetail.R;


public class MasterActivity extends AppCompatActivity {

    ViewGroup masterContainer, detailContainer;

    boolean isTablet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);

        masterContainer = findViewById(R.id.ly_acmaster_container_master);
        detailContainer = findViewById(R.id.ly_acmaster_container_detail);

        // Wenn wir uns beide Container geholt haben entscheiden wir welche Variante wir anzeigen.
        // Wenn es einen Detail Container gibt, merken wir uns, dass wir uns im Landscape Modus befinden.
        // Wir merken daran, welche Layout Datei verwendet wird.
        isTablet = detailContainer != null;

        // Hier füllen wir den master Container mit den Werten.


    }
}
