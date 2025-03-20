package com.kotlinlearning3.phone;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.kotlinlearning3.phone.databinding.ActivityMainBinding;
import com.kotlinlearning3.phone.databinding.ActivityPhone2Binding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);



       binding.kayitol.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i = new Intent(MainActivity.this, phone2.class);
               startActivity(i);
           }
       });


        binding.soru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder message = new AlertDialog.Builder(MainActivity.this);
                message.setMessage("Şifrede büyük harf , küçük harf ve rakam kullanmak zorunludur." +
                                "En az 8 karakterli olmalıdır.")
                        .setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                AlertDialog dialog=message.create();
                dialog.show();


            }
        });
    }
}
