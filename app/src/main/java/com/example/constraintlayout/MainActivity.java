package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnEdit, btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Pastikan nama layout-nya sama

        // Hubungkan tombol dengan ID di layout
        btnEdit = findViewById(R.id.btnEdit);
        btnLogout = findViewById(R.id.btnLogout);

        // Aksi saat tombol Edit Profil ditekan
        btnEdit.setOnClickListener(v ->
                Toast.makeText(MainActivity.this,
                        "Fitur Edit Profil belum tersedia",
                        Toast.LENGTH_SHORT).show()
        );

        // Aksi saat tombol Logout ditekan
        btnLogout.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this,
                    "Anda telah logout",
                    Toast.LENGTH_SHORT).show();
            finish(); // Menutup Activity (simulasi logout)
        });
    }
}
