package com.example.jihcgirlshouse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity2 extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        drawerLayout = findViewById(R.id.drawer_layout);
//        navigationView = findViewById(R.id.nav_view);
//        toolbar = findViewById(R.id.toolb);

//        setSupportActionBar(toolbar);

//        Menu menu = navigationView.getMenu();
//        menu.findItem(R.id.nav_faq).setVisible(false);
//        menu.findItem(R.id.nav_settings).setVisible(false);

//        navigationView.bringToFront();
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawerLayout.addDrawerListener(toggle);
//        toggle.syncState();
//
//        navigationView.setNavigationItemSelectedListener(this);
//        navigationView.setCheckedItem(R.id.nav_kun);
    }

//    @Override
//    public void onBackPressed() {
//        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
//            drawerLayout.closeDrawer(GravityCompat.START);
//        }else{
//            super.onBackPressed();
//        }
//    }
//
//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//        switch(item.getItemId()){
//            case R.id.nav_kun:
//                break;
//            case R.id.nav_ball:
//                Intent intent = new Intent(MainActivity2.this, kuntizbe.class);
//                startActivity(intent);
//                break;
//
//            case R.id.nav_share:
//                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
//                break;
//        }
//        drawerLayout.closeDrawer(GravityCompat.START);
//        return true;
//    }

    public void ClickMenu(View view){
        openDrawer(drawerLayout);
    }

    public static void openDrawer(DrawerLayout drawerLayout) {

        drawerLayout.openDrawer(GravityCompat.START);

    }

    public void ClickLogo(View view){
        closeDrawer(drawerLayout);
    }

    public static void closeDrawer(DrawerLayout drawerLayout) {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }

    public void ClickHome(View view){
//        recreate();
        Intent inte = new Intent(this, MainActivity2.class);
        startActivity(inte);
    }

    public void ClickKuntizbe(View view){
//        redirectActivity(this, kuntizbe.class);
        Intent in = new Intent(this, kuntizbe.class);
        startActivity(in);
    }

    public void  ClickUpai(View view){
//        redirectActivity(this, upai.class);
        Intent i = new Intent(this, upai.class);
        startActivity(i);
    }

//    public void ClickLogout(View view){
//        logout(this);
//    }

//    public static void logout(Activity activity) {
//        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
//        builder.setTitle("Logout");
//        builder.setMessage("Are you sure you want to logout?");
//        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                activity.finishAffinity();
//                System.exit(0);
//            }
//        });

//        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                dialog.dismiss();
//            }
//        });
//        builder.show();
//    }

//    public static void redirectActivity(Activity activity, Class aClass) {
//        Intent intent = new Intent(activity, aClass);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        activity.startActivity(intent);
//    }

    @Override
    protected void onPause() {
        super.onPause();
        closeDrawer(drawerLayout);
    }
}