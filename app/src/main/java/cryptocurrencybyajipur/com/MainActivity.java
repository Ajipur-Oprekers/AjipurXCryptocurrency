package cryptocurrencybyajipur.com;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private Button button_bitcoin;



    @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        //kita ambil ID yang Button
        button_bitcoin = (Button) findViewById(R.id.button_bitcoin);
    // kita set onClick si button start
    // setelah kita set onClick si Button start, kita pergi ke
    // Activity selanjutnya dengan bantuan INTENT
        button_bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (MainActivity.this, bitcoin.class);
                startActivity(i);
            }
        });


       // Button bitcoin = findViewById(R.id.button_bitcoin);
       // bitcoin.setOnClickListener(new View.OnClickListener(){

         //   @Override
         //   public void onClick(View v) {
           //     Toast.makeText(getApplicationContext(), "Penjelasan tentang bitcoin belum bisa di akses!",Toast.LENGTH_LONG).show();
          //  }
      //  });
        Button ethereum = findViewById(R.id.button_ethereum);
        ethereum.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Penjelasan tentang ethereum belum bisa di akses!",Toast.LENGTH_LONG).show();
            }
        });
        Button ripple = findViewById(R.id.button_ripple);
        ripple.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Penjelasan tentang ripple belum bisa di akses!",Toast.LENGTH_LONG).show();
            }
        });
        Button stellar = findViewById(R.id.button_stellar);
        stellar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Penjelasan tentang stellar belum bisa di akses!",Toast.LENGTH_LONG).show();
            }
        });
        Button stable_coin = findViewById(R.id.button_stable_coin);
        stable_coin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Penjelasan tentang stable_coin belum bisa di akses!",Toast.LENGTH_LONG).show();
            }
        });

    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Yakin mau keluar ?");
        builder.setPositiveButton("Iya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user pressed "yes", then he is allowed to exit from application
                finish();
            }
        });
        builder.setNegativeButton("Enggak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user select "No", just cancel this dialog and continue with app
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

}

