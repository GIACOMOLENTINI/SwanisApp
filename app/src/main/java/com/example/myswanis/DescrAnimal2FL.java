package com.example.myswanis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class DescrAnimal2FL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.descrizione_animal2);

        ImageButton button4 = (ImageButton)findViewById(R.id.imageButton20);
        ImageButton button5 = (ImageButton)findViewById(R.id.imageButton21);
        ImageButton button6 = (ImageButton)findViewById(R.id.imageButton22);

        button4.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(DescrAnimal2FL.this,ProjectActivityManage.class);
                        startActivity(openPage2);
                    };
                });
        button5.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(DescrAnimal2FL.this,MainActivity2.class);
                        startActivity(openPage2);
                    };
                });
        button6.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(DescrAnimal2FL.this,DescrProfileFL.class);
                        startActivity(openPage2);
                    };
                });
    }
}
