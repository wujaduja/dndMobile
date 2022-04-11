package edu.byu.cs.tweeter.client.view.charactercreation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import edu.byu.cs.client.R;
import edu.byu.cs.tweeter.client.view.encyclopedia.EncyclopediaLandingPage;

public class Tutorial extends AppCompatActivity {
    ImageView encyclopediaIcon;
    LinearLayout creationButton;
    LinearLayout tutorialButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character_creation_tutorial);

        encyclopediaIcon = findViewById(R.id.encyclopediaIcon);
        encyclopediaIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tutorial.this, EncyclopediaLandingPage.class);
                startActivity(intent);
            }
        });

        creationButton = findViewById(R.id.creationButton);
        creationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tutorial.this, CreationMainActivity.class);
                startActivity(intent);
            }
        });

        tutorialButton = findViewById(R.id.tutorialButton);
        tutorialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tutorial.this, EncyclopediaLandingPage.class);
                startActivity(intent);
            }
        });
    }
}

