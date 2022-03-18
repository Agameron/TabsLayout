package br.digitalhouse.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import android.widget.Toast
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var aba: TabLayout = findViewById(R.id.tablayout)
        aba.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    when (tab.position) {
                        0 -> trocaDeFragment(Charmander.criaChar())
                        1 -> trocaDeFragment(Squirtle.criaSquirtle())
                        2 -> trocaDeFragment(Bulbasauro.criaBulba())
                    }
                }
            }


            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity, "deselecionado", Toast.LENGTH_SHORT).show()
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity, "Aba ja Selecionada", Toast.LENGTH_SHORT).show()
            }


        })
    }

        private fun trocaDeFragment(fragment: Fragment) {
            var mudar = supportFragmentManager.beginTransaction()
            mudar.replace (R.id.mycontainer,fragment)
            mudar.commit()
        }

    }
