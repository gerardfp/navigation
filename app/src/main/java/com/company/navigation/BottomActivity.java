package com.company.navigation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.company.navigation.databinding.ActivityBottomBinding;


public class BottomActivity extends AppCompatActivity {

    ActivityBottomBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((binding = ActivityBottomBinding.inflate(getLayoutInflater())).getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = ((NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment)).getNavController();
        NavigationUI.setupWithNavController(binding.bottomNavView, navController);

        /* No actualiza el titulo la primera vez !*@!#*/
        NavigationUI.setupWithNavController(binding.toolbar, navController);

        /* La ActionBar si que actualiza el titulo la primera vez */
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
    }
}