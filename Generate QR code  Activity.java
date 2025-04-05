package com.example.qrcodeproject;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.os.Bundle;
	

public class GenerateQRCode extends AppCompatActivity {
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate (savedInstanceState);
       setContentView (R.layout.activity_generate_qrcode);
       EditText editText =findViewById(R.id.esit_text);
       Button button =findViewById(R.id.button);
       ImageView imageView =findViewById(R.id.qr_code);
       button.setOnClickListener (new View.OnClickListener () {
           @Override
           public void onClick(View v) {
               MultiFormatWriter multiFormatWriter = new MultiFormatWriter ();
               try {
                   BitMatrix bitMatrix = multiFormatWriter.encode(editText.getText().toString(), BarcodeFormat.QR_CODE, 300, 300);

                   BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
                   Bitmap bitmap = barcodeEncoder.createBitmap (bitMatrix);
                   imageView.setImageBitmap(bitmap);
               } catch (WriterException e) {
                   throw new RuntimeException (e);
               }
           }
       });

