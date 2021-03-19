package com.example.jihcgirlshouse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class kuntizbe extends AppCompatActivity {

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuntizbe);

        drawerLayout = findViewById(R.id.drawer_layout);
    }

    public void ClickMenu(View view){
        MainActivity2.openDrawer(drawerLayout);
    }

    public void ClickLogo(View view){
        MainActivity2.closeDrawer(drawerLayout);
    }

    public void ClickHome(View view){
//        MainActivity2.redirectActivity(this, MainActivity2.class);
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }

    public void ClickKuntizbe(View view){
//        recreate();
        Intent in = new Intent(this, kuntizbe.class);
        startActivity(in);
    }
    public void ClickUpai(View view){
        Intent i = new Intent(this, upai.class);
        startActivity(i);
//        MainActivity2.redirectActivity(this, upai.class);
    }
//    public void ClickLogout(View view){
//        MainActivity2.logout(this);
//    }

    @Override
    protected void onPause() {
        super.onPause();
        MainActivity2.closeDrawer(drawerLayout);
    }
}