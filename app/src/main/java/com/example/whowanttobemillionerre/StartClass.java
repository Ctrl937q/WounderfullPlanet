package com.example.whowanttobemillionerre;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StartClass extends AppCompatActivity implements View.OnClickListener {

    Button buttonStartGame;
    Button buttonNewGame;

    TextView textView;

    boolean exit = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_layout);
        buttonStartGame = (Button) findViewById(R.id.buttonStartGame);
        buttonNewGame = (Button) findViewById(R.id.buttonNewGame);
        textView = (TextView) findViewById(R.id.textView);
        buttonStartGame.setOnClickListener(this);
        buttonNewGame.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == buttonNewGame.getId()) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else if (view.getId() == buttonStartGame.getId()) {
            MainActivity.counterMethodNewGame = 3;
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        onDestroy();
    }
}

