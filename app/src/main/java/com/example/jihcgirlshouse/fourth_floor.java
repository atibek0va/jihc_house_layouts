package com.example.jihcgirlshouse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fourth_floor extends AppCompatActivity {

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_floor);

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
        Intent in = new Intent(this, MainActivity2.class);
        startActivity(in);
    }

    public void ClickUpai(View view){
//        recreate();
        Intent inte = new Intent(this, upai.class);
        startActivity(inte);
    }
    public void ClickKuntizbe(View view){
//        MainActivity2.redirectActivity(this, kuntizbe.class);
        Intent i = new Intent(this, kuntizbe.class);
        startActivity(i);
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