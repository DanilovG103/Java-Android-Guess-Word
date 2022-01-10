package com.example.guessword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    char[] letters = "абвгдежзийклмнопрстуфхцчшщъыьэюя".toCharArray();
    String secretWord = "словосекретное";

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final View.OnClickListener onClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button t1 = (Button) view;
                for (int i = 0; i < secretWord.length(); i++) {
                    if (secretWord.contains(t1.getText().toString())){
                    }
                }
            }
        };
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        GridLayout gridLayout = new GridLayout(this);
        t = new TextView(this);
        t.setText("***************");
        linearLayout.addView(t);
        gridLayout.setRowCount(6);
        gridLayout.setColumnCount(6);
        linearLayout.addView(gridLayout);
        for (int i = 0; i < letters.length; i++) {
            Button btn = new Button(this);
            btn.setText(letters[i] + "");
            btn.setOnClickListener(onClick);
            gridLayout.addView(btn, i);
        }
        setContentView(linearLayout);
    }
}