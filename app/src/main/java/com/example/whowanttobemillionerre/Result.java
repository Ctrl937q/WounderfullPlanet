package com.example.whowanttobemillionerre;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity implements View.OnClickListener {

    TextView textView1;
    TextView textView2;

    Button buttonStartNewGame;
    Button buttonExit;

    RecyclerView rv;
    int counterWIN = 0;
    int counterLOOSE = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        rv = (RecyclerView) findViewById(R.id.rv);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);

        buttonStartNewGame = (Button) findViewById(R.id.buttonStartNewGame);
        buttonExit = (Button) findViewById(R.id.buttonExitGame);

        buttonStartNewGame.setOnClickListener(this);
        buttonExit.setOnClickListener(this);

        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new TestRVAdapter(this));

        for (int i = 0; i < MainActivity.arrayListBool.size(); i++) {
            if (MainActivity.arrayListBool.get(i) == 1) {
                counterWIN++;
            } else counterLOOSE++;
        }
        textView1.setText("правильных ответов   " + counterWIN);
        textView2.setText("неправильных ответов   " + counterLOOSE);
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(Result.this, StartClass.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == buttonStartNewGame.getId()) {
            MainActivity.counterMethodNewGame = 3;
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else if (view.getId() == buttonExit.getId()) {
            Intent intent = new Intent(Result.this, StartClass.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }
    }
}
