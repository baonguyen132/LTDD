package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.test.layout.BlankFragment


class MainActivity : AppCompatActivity() {
    lateinit var button: Button ;
    lateinit var fragmentManager: FragmentManager ;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button);
        button.setOnClickListener(View.OnClickListener {
            exchange(BlankFragment())
        })
    }

    public fun exchange(fragment: Fragment){
        this.fragmentManager = supportFragmentManager ;
        fragmentManager.beginTransaction().replace(R.id.frameRoot , fragment).commit();
    }
}