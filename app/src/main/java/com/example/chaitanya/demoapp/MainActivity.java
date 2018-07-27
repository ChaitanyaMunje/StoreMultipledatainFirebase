package com.example.chaitanya.demoapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.projects.alshell.android.Terminal;
import com.projects.alshell.android.TerminalAnimationType;
import com.projects.alshell.android.TerminalChangedListener;
import com.projects.alshell.android.TerminalSeekBar;

import java.util.ArrayList;

import static android.graphics.Color.GREEN;

public class MainActivity extends AppCompatActivity {
       EditText name,email,phone,username,password;
       Button insert;
       FirebaseDatabase database;
       DatabaseReference ref;
       User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.name);
        email=(EditText)findViewById(R.id.email);
        phone=(EditText)findViewById(R.id.phone);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        insert=(Button)findViewById(R.id.insert);
        database=FirebaseDatabase.getInstance();
        ref=database.getReference("User");
        user=new User();
        }
        private void getValue(){

        user.setEmail(email.getText().toString());
        user.setName(name.getText().toString());
        user.setPhone(phone.getText().toString());
        user.setPassword(password.getText().toString());
        user.setUsername(username.getText().toString());

        }

    public void insert(View view) {
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                getValue();
                ref.child("User02").setValue(user);
                Toast.makeText(MainActivity.this, "Data Uploaded", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
