package com.example.whowanttobemillionerre;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;

    final String COUNTER_METHOD = "counter_method";
    final String ARRAY_CONST1 = "array_const1";
    final String ARRAY_CONST2 = "array_const2";
    final String ARRAY_CONST3 = "array_const3";
    final String ARRAY_CONST4 = "array_const4";
    final String ARRAY_CONST5 = "array_const5";
    final String ARRAY_CONST6 = "array_const6";
    final String ARRAY_CONST7 = "array_const7";
    final String ARRAY_CONST8 = "array_const8";
    final String ARRAY_CONST9 = "array_const9";
    final String ARRAY_CONST10 = "array_const10";

    int counterMethod = 1;
    static int counterMethodNewGame = 2;

    static ArrayList<Integer> arrayListBool = new ArrayList<>();

    Button button1;
    Button button2;
    Button button3;
    Button button4;

    ImageView imageView;
    LinearLayout linearLayoutImage;
    LinearLayout linerLayoutFonButton;
    Animation anim = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        linearLayoutImage = (LinearLayout) findViewById(R.id.linearlayoutImage);
        linerLayoutFonButton = (LinearLayout) findViewById(R.id.linerLayoutFonButton);
        imageView = (ImageView) findViewById(R.id.imageView3);
        arrayListBool.clear();
        arrayListBool.add(0);
        arrayListBool.add(0);
        arrayListBool.add(0);
        arrayListBool.add(0);
        arrayListBool.add(0);
        arrayListBool.add(0);
        arrayListBool.add(0);
        arrayListBool.add(0);
        arrayListBool.add(0);
        arrayListBool.add(0);

        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }

        load();
        if (counterMethodNewGame == 3) {
            stage1();
        }

        if (counterMethod == 1) {
            stage1();
        }
        if (counterMethod == 2) {
            stage2();
        }
        if (counterMethod == 3) {
            stage3();
        }
        if (counterMethod == 4) {
            stage4();
        }
        if (counterMethod == 5) {
            stage5();
        }
        if (counterMethod == 6) {
            stage6();
        }
        if (counterMethod == 7) {
            stage7();
        }
        if (counterMethod == 8) {
            stage8();
        }
        if (counterMethod == 9) {
            stage9();
        }
        if (counterMethod == 10) {
            stage10();
        }
    }

    public void stage1() {
        counterMethod = 1;
        anim = AnimationUtils.loadAnimation(this, R.anim.my_scale);
        imageView.startAnimation(anim);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.image1));
        button1.setText("Деменовская ледяная пещера, Словакия");
        button2.setText("Ледяная пещера под ледником в Джуно, Аляска");
        button3.setText("Кунгуррская ледяная пещера,Сибирь");
        button4.setText("Шкоцянская пещера, Словения");
        button1.startAnimation(anim);
        button2.startAnimation(anim);
        button3.startAnimation(anim);
        button4.startAnimation(anim);
        linearLayoutImage.setBackground(getResources().getDrawable(R.drawable.fon1));
        linerLayoutFonButton.setBackground(getResources().getDrawable(R.drawable.fon1));
        anim = AnimationUtils.loadAnimation(this, R.anim.my_scale);
        imageView.startAnimation(anim);
        button1.startAnimation(anim);
        button2.startAnimation(anim);
        button3.startAnimation(anim);
        button4.startAnimation(anim);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(0, 0);
                stage2();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(0, 1);
                stage2();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(0, 0);
                stage2();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(0, 0);
                stage2();
            }
        });
    }

    public void stage2() {
        counterMethod = 2;
        anim = AnimationUtils.loadAnimation(this, R.anim.my_scale);
        imageView.startAnimation(anim);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.kanionbig));
        button1.setText("Каньон Сумидеро, Мексика");
        button2.setText("Каньон Хейле Турзи, Румыния");
        button3.setText("Большой каньон Ярлунг Цангпо, Тибет");
        button4.setText("Большой Каньон в Аризоне, США");
        button1.startAnimation(anim);
        button2.startAnimation(anim);
        button3.startAnimation(anim);
        button4.startAnimation(anim);
        linearLayoutImage.setBackground(getResources().getDrawable(R.drawable.fon2));
        linerLayoutFonButton.setBackground(getResources().getDrawable(R.drawable.fon2));


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(1, 0);
                stage3();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               arrayListBool.set(1, 0);
                stage3();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(1, 0);
                stage3();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(1, 1);
                stage3();
            }
        });
    }

    public void stage3() {
        counterMethod = 3;
        anim = AnimationUtils.loadAnimation(this, R.anim.my_trans);
        imageView.startAnimation(anim);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.pesheri));
        button1.setText("Мраморные пещеры в Патагонии, на стыке Аргентины и Чили");
        button2.setText("Пещеры Глоуворм, Новая Зеландия");
        button3.setText("Ледниковая пещера Менденхол, США");
        button4.setText("Пещера Фингала на оострове Саффа, Шотландии,");
        button1.startAnimation(anim);
        button2.startAnimation(anim);
        button3.startAnimation(anim);
        button4.startAnimation(anim);
        linearLayoutImage.setBackground(getResources().getDrawable(R.drawable.fon3));
        linerLayoutFonButton.setBackground(getResources().getDrawable(R.drawable.fon3));


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(2, 1);
                stage4();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(2, 0);
                stage4();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(2, 0);
                stage4();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(2, 0);
                stage4();
            }
        });
    }

    public void stage4() {
        counterMethod = 4;
        anim = AnimationUtils.loadAnimation(this, R.anim.my_alpha);
        imageView.startAnimation(anim);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.dira));
        button1.setText("Ик-Киль, Мексика");
        button2.setText("Голубая дыра Дина, Багамы");
        button3.setText("Большая голубая Дыра, Белиз ,Центральная Америка");
        button4.setText("Озеро Утренней Славы, США");
        button1.startAnimation(anim);
        button2.startAnimation(anim);
        button3.startAnimation(anim);
        button4.startAnimation(anim);
        linearLayoutImage.setBackground(getResources().getDrawable(R.drawable.fon4));
        linerLayoutFonButton.setBackground(getResources().getDrawable(R.drawable.fon4));

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(3, 0);
                stage5();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(3, 0);
                stage5();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(3, 1);
                stage5();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(3, 0);
                stage5();
            }
        });
    }

    public void stage5() {
        counterMethod = 5;
        anim = AnimationUtils.loadAnimation(this, R.anim.my_scale);
        imageView.startAnimation(anim);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.kanion));
        button1.setText("Каньон Антилопы в Аризоне, США");
        button2.setText("Каньон Брайс, Юта, США");
        button3.setText("Ущелье Кали-Гандаки, Непал");
        button4.setText("Каньон Фиаргурфуй, Исландия");
        button1.startAnimation(anim);
        button2.startAnimation(anim);
        button3.startAnimation(anim);
        button4.startAnimation(anim);
        linearLayoutImage.setBackground(getResources().getDrawable(R.drawable.fon5));
        linerLayoutFonButton.setBackground(getResources().getDrawable(R.drawable.fon5));


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(4, 1);
                stage6();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(4, 0);
                stage6();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(4, 0);
                stage6();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(4, 0);
                stage6();
            }
        });
    }

    public void stage6() {
        counterMethod = 6;
        anim = AnimationUtils.loadAnimation(this, R.anim.my_trans);
        imageView.startAnimation(anim);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.vodopad));
        button1.setText("Водопад Новый Навахо, Аризона, США");
        button2.setText("Водопад Марморе (Мраморный водопад), Умбрия, Италия");
        button3.setText("Водопад Нурананг, Таванг, Индия");
        button4.setText("Водопад Виктория на стыке Зимбабве и Замбии");
        button1.startAnimation(anim);
        button2.startAnimation(anim);
        button3.startAnimation(anim);
        button4.startAnimation(anim);
        linearLayoutImage.setBackground(getResources().getDrawable(R.drawable.fon6));
        linerLayoutFonButton.setBackground(getResources().getDrawable(R.drawable.fon6));


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(5, 0);
                stage7();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(5, 0);
                stage7();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(5, 0);
                stage7();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(5, 1);
                stage7();
            }
        });
    }

    public void stage7() {
        counterMethod = 7;
        anim = AnimationUtils.loadAnimation(this, R.anim.my_alpha);
        imageView.startAnimation(anim);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.fingalovapeshera));
        button1.setText("Пещера Уэйтомо Глоуворм, Новая Зеландия");
        button2.setText("Фингалова пещера, остров Стаффа, Шотландия");
        button3.setText("Пещера тростниковой флейты, Китай");
        button4.setText("Пещера Ординская, Пермский край, Россия");
        button1.startAnimation(anim);
        button2.startAnimation(anim);
        button3.startAnimation(anim);
        button4.startAnimation(anim);
        linearLayoutImage.setBackground(getResources().getDrawable(R.drawable.fon7));
        linerLayoutFonButton.setBackground(getResources().getDrawable(R.drawable.fon7));


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(6, 0);
                stage8();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(6, 1);
                stage8();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(6, 0);
                stage8();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(6, 0);
                stage8();
            }
        });

    }

    public void stage8() {
        counterMethod = 8;
        anim = AnimationUtils.loadAnimation(this, R.anim.my_scale);
        imageView.startAnimation(anim);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.yaponiya));
        button1.setText("Национальный парк Хитачи, Япония");
        button2.setText("Парк Кекенхоф, Нидерланды");
        button3.setText("Тропический парк Нонг Нуч, Паттайя, Таиланд");
        button4.setText("Версальский парк, Франция");
        button1.startAnimation(anim);
        button2.startAnimation(anim);
        button3.startAnimation(anim);
        button4.startAnimation(anim);
        linearLayoutImage.setBackground(getResources().getDrawable(R.drawable.fon8));
        linerLayoutFonButton.setBackground(getResources().getDrawable(R.drawable.fon8));


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(7, 1);
                stage9();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(7, 0);
                stage9();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(7, 0);
                stage9();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(7, 0);
                stage9();
            }
        });
    }

    public void stage9() {
        counterMethod = 9;
        anim = AnimationUtils.loadAnimation(this, R.anim.my_trans);
        imageView.startAnimation(anim);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.svetnieskali));
        button1.setText("Скалы Бунда, Австралия");
        button2.setText("Пылающие скалы , Монголия");
        button3.setText("Красные скалы, Невада, США");
        button4.setText("Цветные скалы Чжанъе Данксиа, Китай");
        button1.startAnimation(anim);
        button2.startAnimation(anim);
        button3.startAnimation(anim);
        button4.startAnimation(anim);
        linearLayoutImage.setBackground(getResources().getDrawable(R.drawable.fon9));
        linerLayoutFonButton.setBackground(getResources().getDrawable(R.drawable.fon9));


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(8, 0);
                stage10();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(8, 0);
                stage10();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(8, 0);
                stage10();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(8, 1);
                stage10();
            }
        });
    }

    public void stage10() {
        counterMethod = 10;
        anim = AnimationUtils.loadAnimation(this, R.anim.my_alpha);
        imageView.startAnimation(anim);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.kolodec));
        button1.setText("Водосточный колодец Дайсетта");
        button2.setText("Заколдованный колодец, Бразилия");
        button3.setText("Водосточный колодец Макунджи");
        button4.setText("Колодец Тора, мыс Перпетуа, штат Орегон");
        button1.startAnimation(anim);
        button2.startAnimation(anim);
        button3.startAnimation(anim);
        button4.startAnimation(anim);
        linearLayoutImage.setBackground(getResources().getDrawable(R.drawable.fon10));
        linerLayoutFonButton.setBackground(getResources().getDrawable(R.drawable.fon10));

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(9, 0);
                Intent intent = new Intent(MainActivity.this, Result.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(9, 1);
                Intent intent = new Intent(MainActivity.this, Result.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(9, 0);
                Intent intent = new Intent(MainActivity.this, Result.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayListBool.set(9, 0);
                Intent intent = new Intent(MainActivity.this, Result.class);
                startActivity(intent);
            }
        });
    }

    private void save() {
        sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sharedPreferences.edit();
        ed.putInt(COUNTER_METHOD, counterMethod);
        ed.putInt(ARRAY_CONST1, arrayListBool.get(0));
        ed.putInt(ARRAY_CONST2, arrayListBool.get(1));
        ed.putInt(ARRAY_CONST3, arrayListBool.get(2));
        ed.putInt(ARRAY_CONST4, arrayListBool.get(3));
        ed.putInt(ARRAY_CONST5, arrayListBool.get(4));
        ed.putInt(ARRAY_CONST6, arrayListBool.get(5));
        ed.putInt(ARRAY_CONST7, arrayListBool.get(6));
        ed.putInt(ARRAY_CONST8, arrayListBool.get(7));
        ed.putInt(ARRAY_CONST9, arrayListBool.get(8));
        ed.putInt(ARRAY_CONST10, arrayListBool.get(9));
        ed.commit();
    }

    private void load() {
        sharedPreferences = getPreferences(MODE_PRIVATE);
        int counter = sharedPreferences.getInt(COUNTER_METHOD, 1);
        arrayListBool.set(0, sharedPreferences.getInt(ARRAY_CONST1, 0));
        arrayListBool.set(1, sharedPreferences.getInt(ARRAY_CONST2, 0));
        arrayListBool.set(2, sharedPreferences.getInt(ARRAY_CONST3, 0));
        arrayListBool.set(3, sharedPreferences.getInt(ARRAY_CONST4, 0));
        arrayListBool.set(4, sharedPreferences.getInt(ARRAY_CONST5, 0));
        arrayListBool.set(5, sharedPreferences.getInt(ARRAY_CONST6, 0));
        arrayListBool.set(6, sharedPreferences.getInt(ARRAY_CONST7, 0));
        arrayListBool.set(7, sharedPreferences.getInt(ARRAY_CONST8, 0));
        arrayListBool.set(8, sharedPreferences.getInt(ARRAY_CONST9, 0));
        arrayListBool.set(9, sharedPreferences.getInt(ARRAY_CONST10, 0));
        counterMethod = counter;
    }

    @Override
    protected void onStop() {
        save();
        super.onStop();
    }
}



