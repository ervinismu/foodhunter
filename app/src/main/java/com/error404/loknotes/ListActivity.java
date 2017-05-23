package com.error404.loknotes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    LinearLayout llmenuBandung, llmenuBali, llmenuJakarta, llmenuYogyakarta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        llmenuBandung = (LinearLayout) findViewById(R.id.ll_menuBandung);
        llmenuBali = (LinearLayout) findViewById(R.id.ll_menuBali);
        llmenuJakarta = (LinearLayout) findViewById(R.id.ll_menuJakarta);
        llmenuYogyakarta = (LinearLayout) findViewById(R.id.ll_menuYogyakarta);

        llmenuBandung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mIntent = new Intent(getApplicationContext(),
                        BandungActivity.class);
                startActivity(mIntent);

                Toast.makeText(getApplicationContext(),"Bandung Clicked!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        llmenuBali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mIntent = new Intent(getApplicationContext(),
                        BaliActivity.class);
                startActivity(mIntent);

                Toast.makeText(getApplicationContext(),"Bali Clicked!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        llmenuJakarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mINtent = new Intent(getApplicationContext(),
                        JakartaActivity.class);
                startActivity(mINtent);

                Toast.makeText(getApplicationContext(),"Jakarta Clicked!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        llmenuYogyakarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mIntent = new Intent(getApplicationContext(),
                        YogyakartaActivity.class);
                startActivity(mIntent);

                Toast.makeText(getApplicationContext(),"Yogyakarta Clicked!",
                        Toast.LENGTH_SHORT).show();
            }
        });

}
}
