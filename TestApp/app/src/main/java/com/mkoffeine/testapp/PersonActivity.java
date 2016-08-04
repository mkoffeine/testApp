package com.mkoffeine.testapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.mkoffeine.testapp.model.Person;

public class PersonActivity extends AppCompatActivity {

    //It needs better layout
    //key: value
    /*Not
     key:
     value
    */

    public static final String PERSON_DATA = "personData";
    private Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
        person = (Person) getIntent().getSerializableExtra(PERSON_DATA);

        TextView name = (TextView) findViewById(R.id.txt_name);
        name.setText(person.getName());

        TextView birthday = (TextView) findViewById(R.id.txt_birthday);
        birthday.setText(person.getBirthday());
        TextView placeOfBirth = (TextView) findViewById(R.id.txt_place_birth);
        placeOfBirth.setText(person.getPlaceOfBirthName());


    }
}
