package com.github.kotlin_studio.navigation2019


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.fragment_fragment1.view.*


/**
 * A simple [Fragment] subclass.
 *
 */
class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // получаем ссылку на макет фрагмента
        val fragmentLayout = inflater.inflate(R.layout.fragment_fragment1, container, false)

        // получаем ссылку на NavController (навигационный контроллер)
        val navController = NavHostFragment.findNavController(this)

        // слушатели кнопок, которые передают адрес навигационному контроллеру
        fragmentLayout.button2.setOnClickListener { navController.navigate(R.id.fragment2) }
        fragmentLayout.button3.setOnClickListener { navController.navigate(R.id.fragment3) }
        fragmentLayout.button4.setOnClickListener { navController.navigate(R.id.fragment4) }

        // возвращаем макет фрагмента
        return fragmentLayout
    }

}
