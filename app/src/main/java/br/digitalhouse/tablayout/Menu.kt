package br.digitalhouse.tablayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TableLayout

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener(){
            var intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }

        var btn2 = findViewById<Button>(R.id.button2)
        btn2.setOnClickListener(){
            var intent = Intent(this, TabPager:: class.java)
            startActivity(intent)
        }
    }
}