package com.example.welcome.rao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminActivity extends Activity {
    Button buttonlog,buttonsig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        buttonlog=(Button)findViewById(R.id.log1);
        buttonsig=(Button)findViewById(R.id.sig1);
        buttonlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AdminActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        buttonsig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AdminActivity.this,SigupActivity.class);
                startActivity(intent);
            }
        });

    }
}
