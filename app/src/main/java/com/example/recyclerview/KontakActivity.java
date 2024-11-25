package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class KontakActivity extends AppCompatActivity {

    List<ContactModel> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kontak);

        addData();

    }

    private void addData() {
        elements = new ArrayList<>();
        elements.add(new ContactModel("#46C8DA", "Billi", "081381331823", "Busy"));
        elements.add(new ContactModel("#C5DA46", "Runi", "089375632123", "Available"));
        elements.add(new ContactModel("#DA4646", "Jeje", "089375632123", "Not Available"));
        elements.add(new ContactModel("#9946DA", "Bob", "089375632123", "Available"));
        elements.add(new ContactModel("#98D696", "Aisyah", "089375632123", "Chat Only"));
        elements.add(new ContactModel("#96D6D2", "Gendhis", "089375632123", "Not Available"));
        elements.add(new ContactModel("#C596D6", "Valen", "089375632123", "Available"));
        elements.add(new ContactModel("#D6AD96", "Tama", "089375632123", "Available"));
        elements.add(new ContactModel("#C9D696", "Marsha", "089375632123", "Available"));
        elements.add(new ContactModel("#96A4D6", "El", "089375632123", "Available"));

        ContactAdapter adapter = new ContactAdapter(elements, this, new ContactAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(ContactModel item) {
                detail(item);
            }
        });

        RecyclerView recyclerView = findViewById(R.id.rvContact);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private void detail(ContactModel item) {
        Intent intent = new Intent(KontakActivity.this, DetailActivity.class);
        intent.putExtra("ContactModel", item);
        startActivity(intent);
    }
}