package br.digitalhouse.tablayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabAdapter  (fragmentoManager : FragmentManager) : FragmentPagerAdapter (fragmentoManager){

    //lista que irá receber os fragments
    var listaDeFragmentos : MutableList<Fragment> = mutableListOf()

    //função de adição dos fragmentos dentro da lista
    fun add(fragmento : Fragment, titulo : String){
        this.listaDeFragmentos.add(fragmento)
    }

    //função responsável por pegar a quantidade de itens na lista de fragmentos
    override fun getCount(): Int {
        return listaDeFragmentos.size
    }

    //função responsável por saber qual item da lista está sendo utilizado
    override fun getItem(position: Int): Fragment {
        return listaDeFragmentos.get(position)
    }

}