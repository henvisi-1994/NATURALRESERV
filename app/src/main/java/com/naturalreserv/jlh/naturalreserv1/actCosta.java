package com.naturalreserv.jlh.naturalreserv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class actCosta extends AppCompatActivity {

    Button btnPro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_costa);
        btnPro = (Button) findViewById(R.id.btnGuayas);
        btnPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), actProv.class);
                startActivity(intent);
            }
        });
    }
}
