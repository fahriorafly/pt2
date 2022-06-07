package org.skyriver.yubisaekspor.fragment.penjual

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.skyriver.yubisaekspor.R
import org.skyriver.yubisaekspor.adapter.penjual.AdapterPenjualProduk
import org.skyriver.yubisaekspor.model.penjual.PenjualProduk

class PenjualListProdukFragment : Fragment() {

    lateinit var rvPenjualListProduk: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_penjual_list_produk, container, false)

        rvPenjualListProduk = view.findViewById(R.id.idRvShowPenjualListProduk)

        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        rvPenjualListProduk.adapter = AdapterPenjualProduk(arrProduk)
        rvPenjualListProduk.layoutManager = layoutManager

        return view
    }

    val arrProduk: ArrayList<PenjualProduk>get(){
        val arr = ArrayList<PenjualProduk>()
        val p1 = PenjualProduk()
        p1.namaProduk = "Cengkeh"
        p1.alamatProduk = "Toko Slebew"
        p1.gambarProduk = R.drawable.ic_dashboard_black_24dp

        val p2 = PenjualProduk()
        p2.namaProduk = "Cengkeh"
        p2.alamatProduk = "Toko Slebew"
        p2.gambarProduk = R.drawable.ic_dashboard_black_24dp

        val p3 = PenjualProduk()
        p3.namaProduk = "Cengkeh"
        p3.alamatProduk = "Toko Slebew"
        p3.gambarProduk = R.drawable.ic_dashboard_black_24dp

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)

        return arr
    }
}