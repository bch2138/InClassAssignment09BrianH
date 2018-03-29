package com.example.uhylabr.inclassassignment09_brianh;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private FirebaseDatabase database  = FirebaseDatabase.getInstance();
    private DatabaseReference personRef = database.getReference(s:"person");
    private DatabaseReference peopleRef = database.getReference(s: "Multiple people");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void set (View view){personRef.setValue(new Person("Brad", 36, true));

    public void add(View view){
        peopleRef.push().setValue(new Person("Nigel", 30, true));
    }

}
