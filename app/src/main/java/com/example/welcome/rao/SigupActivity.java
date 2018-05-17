package com.example.welcome.rao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SigupActivity extends Activity {
    Button submit;
    EditText name,lname,mobile,email;
    String namestr;
    View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigup);
        submit=(Button)findViewById(R.id.sub1);
        name=(EditText)findViewById(R.id.et_name);
        lname=(EditText)findViewById(R.id.et_fname);
        mobile=(EditText)findViewById(R.id.et_mobil);
        email=(EditText)findViewById(R.id.et_email);
            submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent=new Intent(SigupActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}
