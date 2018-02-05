package ua.com.sevenpowerx.android.salarycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by splaa User notebook acer  on 05.02.2018.
 */

public class CreatedNewShift extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_create_shift);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
