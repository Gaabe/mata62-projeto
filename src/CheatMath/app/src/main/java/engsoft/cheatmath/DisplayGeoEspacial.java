package engsoft.cheatmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class DisplayGeoEspacial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_geo_espacial);

    }

    public void volumeCubo(View view)   {
        Intent intent = new Intent(this, DisplayVolCubo.class);
        startActivity(intent);
    }
}

