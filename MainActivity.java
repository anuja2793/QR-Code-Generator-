package com.example.qrcodeproject;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
   private Button generateQRBtn;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate (savedInstanceState);
       setContentView (R.layout.activity_main);

       generateQRBtn=findViewById (R.id.idBtnGenerateQR);
       generateQRBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i =new Intent (MainActivity.this,GenerateQRCode.class);
               startActivity (i);
           }
       });
   }
}

