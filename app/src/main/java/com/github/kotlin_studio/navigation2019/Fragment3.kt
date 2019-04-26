package com.github.kotlin_studio.navigation2019


import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.fragment_fragment3.view.*


/**
 * A simple [Fragment] subclass.
 *
 */
class Fragment3 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // получаем ссылку на макет фрагмента
        val fragmentLayout = inflater.inflate(R.layout.fragment_fragment3, container, false)

        // получаем ссылку на NavController (навигационный контроллер)
        val navController = NavHostFragment.findNavController(this)

        // включаем нижнее меню для данного фрагмента
        val bottomBar = view?.findViewById<NavigationView>(R.id.bottom_nav_view)
        bottomBar?.setupWithNavController(navController)
        fragmentLayout.bottom_nav_view.setOnNavigationItemSelectedListener { item ->
            navController.navigate(item.itemId)
            return@setOnNavigationItemSelectedListener true
        }

        // возвращаем макет фрагмента
        return fragmentLayout
    }
}
