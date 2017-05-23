package br.com.luan.kotlinintroducion

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.hello.setText("Hi!")

        this.button.setOnClickListener { v: View? -> this.hello.setText("Apertei o botao") }

    }
}
