package com.zalego.signuppage.signuppage;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.RadioButton;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    EditText edt_Fname, edt_Mail, edt_Password;
    RadioButton rdn_Gender, rdn_Languages;
    Button btn_Send;

    String firstname, email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_Fname = (EditText) findViewById(R.id.edt_Fname);
        edt_Email = (EditText) findViewById(R.id.edt_Mail);
        edt_Password = (EditText) findViewById(R.id.edt_Password);
        rdn_Gender = (RadioButton) findViewById(R.id.rdn_Gender);
        rdn_Langauges = (RadioButton) findViewById(R.id.rdn_Langauges);
        btn_Send = (Button) findViewById(R.id.btn_Send);

        btn_Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!validate()) {
                    return;
                }
                // Intent signupIntent = new Intent(android.content.Intent.ACTION_SEND);
                // signupIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                // signupIntent.setType("vnd.android.cursor.item/email");
                // signupIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{firstname});
                // signupIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, email);
                // signupIntent.putExtra(android.content.Intent.EXTRA_TEXT, password);
                // startActivity(Intent.createChooser(signupIntent, "Sign up using..."));
            }
        });
    }


    public boolean validate() {
        boolean valid = true;

        firstname = edt_Fname.getText().toString();
        email = edt_Mail.getText().toString();
        password = edt_Password.getText().toString();


//        if(mailFrom.length() < 1 || mailFrom.equals("")||!Patterns.EMAIL_ADDRESS.matcher(mailFrom).matches()){
//            edtMailFrom.setError("Invalid Entry");
//            valid = false;
//            return valid;
//        }else{
//            edtMailFrom.setError(null);
//        }

        if (firstname.length() < 1 || firstname.equals("") || !Patterns.EMAIL_ADDRESS.matcher(mailTo).matches()) {
            edt_Fname.setError("Invalid Entry");
            valid = false;
            return valid;
        } else {
            edt_Fname.setError(null);
        }

        if (email.length() < 1 || email.equals("")) {
            edt_Mail.setError("Invalid Entry");
            valid = false;
            return valid;
        } else {
            edt_Mail.setError(null);
        }

        if (password.length() < 1 || password.equals("")) {
            edt_Password.setError("Invalid Entry");
            valid = false;
            return valid;
        } else {
            edt_Password.setError(null);
        }

        return valid;
    }
}






