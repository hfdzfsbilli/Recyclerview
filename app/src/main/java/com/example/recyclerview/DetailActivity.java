package com.example.recyclerview;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailActivity extends AppCompatActivity {

    TextView tvNamaDetail, tvHpDetail, tvStatusDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ContactModel element = (ContactModel) getIntent().getSerializableExtra("ContactModel");
        tvNamaDetail = findViewById(R.id.tvNamaDetail);
        tvHpDetail = findViewById(R.id.tvHpDetail);
        tvStatusDetail = findViewById(R.id.tvStatusDetail);

        tvNamaDetail.setText(element.getNama());
        tvNamaDetail.setTextColor(Color.parseColor(element.getColor()));
        tvHpDetail.setText(element.getHp());
        tvStatusDetail.setText(element.getStatus());
    }
}