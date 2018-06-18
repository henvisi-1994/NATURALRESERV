package com.naturalreserv.jlh.naturalreserv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class actProv extends AppCompatActivity {
Button btnMachalilla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_prov);
        btnMachalilla = (Button) findViewById(R.id.btnMachalilla);
        btnMachalilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),actMachalilla.class);
                startActivity(intent);
            }
        });

    }
}
