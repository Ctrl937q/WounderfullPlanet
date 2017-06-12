package com.example.whowanttobemillionerre;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Result extends AppCompatActivity implements View.OnClickListener {

    TextView textView1;
    TextView textView2;
    TextView textView3;
    ImageView imageView;

    Button buttonStartNewGame;
    Button buttonLearnMore;

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
        textView3 = (TextView) findViewById(R.id.textView3);
        imageView = (ImageView)findViewById(R.id.imageViewSmile);

        buttonStartNewGame = (Button) findViewById(R.id.buttonStartNewGame);
        buttonLearnMore = (Button) findViewById(R.id.buttonLearnMore);

        buttonStartNewGame.setOnClickListener(this);
        buttonLearnMore.setOnClickListener(this);

        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new TestRVAdapter(this));

        for (int i = 0; i < MainActivity.arrayListBool.size(); i++) {
            if (MainActivity.arrayListBool.get(i) == 1) {
                counterWIN++;
            } else counterLOOSE++;
        }
        textView1.setText("правильных ответов   " + counterWIN);
        textView2.setText("неправильных ответов   " + counterLOOSE);
        if (counterWIN < 5) {
            textView3.setText("плохо! тебе надо знать больше!");
            textView3.setTextSize(18);
            imageView.setBackground(getResources().getDrawable(R.drawable.badsmile));
        }
        if (counterWIN == 5) {
            textView3.setText("половина, так себе результат...");
            imageView.setBackground(getResources().getDrawable(R.drawable.olosmile));
        }

        if (counterWIN > 5 && counterWIN <= 8) {
            textView3.setText("знаешь больше половины!");
            imageView.setBackground(getResources().getDrawable(R.drawable.brsmile));
        }
        if (counterWIN == 9) {
            textView3.setText("всего на 1 ошибся :(");
            imageView.setBackground(getResources().getDrawable(R.drawable.nicesmile));
        }
        if (counterWIN == 10) {
            textView3.setText("все ответы правильные!");
            imageView.setBackground(getResources().getDrawable(R.drawable.brainsmile));
        }
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
        } else if (view.getId() == buttonLearnMore.getId()) {
            Intent intent = new Intent(Result.this, LearMore.class);
            startActivity(intent);
        }
    }
}
