package com.opuz.ceylan.myapp;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView ses;
    private TextView titresim;
    private TextView OnKamera;
    private TextView ArkaKamera;
    private TextView SayfaAyarı;
    private Switch switch1;
    private Switch switch2;
    private RadioButton dugme1;
    private RadioButton dugme2;
    private SeekBar ayar;
    private Button buton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ses=(TextView)findViewById(R.id.ses);
        titresim=(TextView)findViewById(R.id.titresim);
        OnKamera=(TextView)findViewById(R.id.OnKamera);
        ArkaKamera=(TextView)findViewById(R.id.ArkaKamera);
        SayfaAyarı=(TextView)findViewById(R.id.sayfaAyarı);
        switch1=(Switch)findViewById(R.id.switch1);
        switch2=(Switch)findViewById(R.id.switch2);
        dugme1=(RadioButton)findViewById(R.id.dugme1);
        dugme2=(RadioButton)findViewById(R.id.dugme2);
        ayar=(SeekBar)findViewById(R.id.ayar);
        buton1=(Button)findViewById(R.id.buton1);
    }


}

