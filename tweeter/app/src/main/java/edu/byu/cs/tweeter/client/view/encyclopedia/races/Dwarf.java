package edu.byu.cs.tweeter.client.view.encyclopedia.races;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import edu.byu.cs.client.R;
import edu.byu.cs.tweeter.client.view.encyclopedia.EncyclopediaLandingPage;

public class Dwarf extends AppCompatActivity {
    ImageView encyclopediaIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.races_dwarf);

        encyclopediaIcon = findViewById(R.id.encyclopediaIcon);
        encyclopediaIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dwarf.this, EncyclopediaLandingPage.class);
                startActivity(intent);
            }
        });
    }
}
