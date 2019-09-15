package com.example.spinner2;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{

    /*
    because we need to access the internet, we'll need
    to add the internet permission, include the following
    line in the manifest file:
    <uses-permission android:name="android.permission.INTERNET"/>
    */

    private static final String URL = "http://app.visiontechme.com:85/MRMV10WSNEW/easymeeting.asmx/GetCountryNames";
    private Spinner spinner;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        spinner = findViewById(R.id.spinner);
        textView = findViewById(R.id.text_view);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetchJsonDataFromUrl();
            }
        });
    }



    private void fetchJsonDataFromUrl() {
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, URL, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                parseJson(response);
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.printStackTrace();
                    }
                });
        Volley.newRequestQueue(this).add(jsonArrayRequest);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event)
    {
        return super.onKeyLongPress(keyCode, event);
    }

    private void parseJson(JSONArray response) {

        List<Country> countries = new ArrayList<>();

        try {
            for (int i = 0; i < response.length(); i++)
            {
                JSONObject obj = response.getJSONObject(i);

                String cid = obj.getString("CID");

                String countryName = obj.getString("CName");

                String flag = obj.getString("Flag");

                String states = obj.getString("States");

                countries.add(new Country(cid, countryName, flag, states));
            }
            Spinner(countries);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }



    private void Spinner(final List<Country> countries)
    {
        if (countries.size() > 0)
        {
            ArrayAdapter<Country> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, countries);
            spinner.setAdapter(adapter);

            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    Country country = countries.get(position);
                    String meta = "ID: " + country.getCid() + "\nNAME: " + country.getName() + "\nFLAG: " + country.getFlag() + "\nSTATES: " + country.getStates();
                    textView.setText(meta);
                }
                @Override
                public void onNothingSelected(AdapterView<?> parent)
                {

                }
            });
        }
    }
}


/*package com.example.spinner2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}*//*


import android.annotation.SuppressLint;
import android.os.Bundle;
       */
/* import android.support.design.widget.FloatingActionButton;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;*//*

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import  android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{

    */
/*
    because we need to access the internet, we'll need
    to add the internet permission, include the following
    line in the manifest file:
    <uses-permission android:name="android.permission.INTERNET"/>
    *//*


    private static final String URL = "http://app.visiontechme.com:85/MRMV10WSNEW/easymeeting.asmx/GetCountryNames";
    public Spinner spinner;
    public TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        spinner = findViewById(R.id.spinner);
        textView = findViewById(R.id.text_view);

        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                fetchJsonDataFromUrl();
            }
        });
    }
        */
/*Spinner spinner = findViewById(R.id.spinner);
        textView = findViewById(R.id.text_view);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
            {
                fetchJsonDataFromUrl();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView)
            {

            }


        });
    }*//*



 */
/*    fab.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        fetchJsonDataFromUrl();
    }
});
}*//*

 */
/* fab.setOnClickListener(new View.OnClickListener()
        {


            @Override
            public void onClick(View view)
            {

                fetchJsonDataFromUrl();
            }*//*




    private void fetchJsonDataFromUrl()
    {

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, URL, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response)
            {
                parseJson(response);
            }
        }, new Response.ErrorListener()
        {
            @Override
            public void onErrorResponse(VolleyError error)
            {
                error.printStackTrace();
            }
        });

        Volley.newRequestQueue(this).add(jsonArrayRequest);
    }

    private void parseJson(JSONArray response) {

        List<Country> countries = new ArrayList<>();

        try {
            for (int i = 0; i < response.length(); i++) {
                JSONObject obj = response.getJSONObject(i);

                String cid = obj.getString("CID");
                String countryName = obj.getString("CName");

                String flag=obj.getString("Flag");
                String states = obj.getString("States");

                countries.add(new Country(cid, countryName,flag,states));
            }
            initSpinner(countries);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void initSpinner(final List<Country> countries)
    {
        if (countries.size() > 0) {
            ArrayAdapter<Country> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, countries);
            spinner.setAdapter(adapter);

            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    Country country = countries.get(position);
                    String meta = "ID: " + country.getCid() + "\nNAME: " + country.getName() + "\nflag:"+country.getFlag()+  "\nSTATES: " + country.getStates();
                    textView.setText(meta);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                {

                }
            });
        }
    }
}*/
