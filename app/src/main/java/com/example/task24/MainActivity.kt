package com.example.task24

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.task24.databinding.ActivityMainBinding
import com.example.task24.date.DataView
import com.example.task24.repository.UserManager
import com.example.task24.repository.Task1repository


class MainActivity : AppCompatActivity() {
    lateinit var data2: UserManager
    lateinit var bindingClass: ActivityMainBinding
    val ostrich = Ostrich()
    val tomtit = Tomtit()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.button.setOnClickListener {
            try {
                //bindingClass.text.text = data2.getDataUser("Jon")
                //bindingClass.text.text = tomtit.fly()
                bindingClass.text.text = letBirdClick(ostrich)
            } catch (e: Exception) {
                bindingClass.text.text = "Ошибка данных"
            }
        }
        fun viewParam(textView: TextView) {
            textView.text = "hello"
            textView.setTextColor(Color.BLACK)
        }
        viewParam(bindingClass.TextView1)
        viewParam(bindingClass.TextView2)

    }

}
