package br.digitalhouse.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class TabPager : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_pager)

        var adapter = TabAdapter(supportFragmentManager)
        adapter.add(Charmander.criaChar(),"Charmander")
        adapter.add(Squirtle.criaSquirtle(),"Squirtle")
        adapter.add(Bulbasauro.criaBulba(),"FragmentoAula1")

        var pager = findViewById<ViewPager>(R.id.pager)
        pager.adapter = adapter

        var tabLayout = findViewById<TabLayout>(R.id.tablayout)
        tabLayout.setupWithViewPager(pager)

    }

}
