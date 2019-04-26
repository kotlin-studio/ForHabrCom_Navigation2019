package com.github.kotlin_studio.navigation2019

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v7.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // получаем navController
        val host: NavHostFragment = supportFragmentManager
            .findFragmentById(R.id.navFragment) as NavHostFragment? ?: return
        navController = host.navController

        // включаем боковое меню
        val sideBar = findViewById<NavigationView>(R.id.nav_view)
        sideBar?.setupWithNavController(navController)

        // настраиваем и включаем панель инструментов (toolbar)
        appBarConfiguration = AppBarConfiguration(navController.graph, drawerLayout = drawer_layout)
        val toolBar = findViewById<Toolbar>(R.id.toolbar)
        toolBar.setupWithNavController(navController, appBarConfiguration)

    }
}



