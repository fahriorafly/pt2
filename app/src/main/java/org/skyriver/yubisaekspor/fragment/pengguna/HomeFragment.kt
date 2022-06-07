package org.skyriver.yubisaekspor.fragment.pengguna

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.skyriver.yubisaekspor.R
import org.skyriver.yubisaekspor.adapter.pengguna.AdapterProduk
import org.skyriver.yubisaekspor.model.pengguna.Produk

class HomeFragment : Fragment() {

    lateinit var rvProduk: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_home, container, false)

        rvProduk = view.findViewById(R.id.idRvShowProduk)

        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        rvProduk.adapter = AdapterProduk(arrProduk)
        rvProduk.layoutManager = layoutManager

        return view
    }

    val arrProduk: ArrayList<Produk>get(){
        val arr = ArrayList<Produk>()
        val p1 = Produk()
        p1.nama = "Cengkeh"
        p1.alamat = "jl. mengger hilir no 69"
        p1.gambar = R.drawable.ic_dashboard_black_24dp

        val p2 = Produk()
        p2.nama = "Cengkeh"
        p2.alamat = "jl. mengger hilir no 69"
        p2.gambar = R.drawable.ic_dashboard_black_24dp

        val p3 = Produk()
        p3.nama = "Cengkeh"
        p3.alamat = "jl. mengger hilir no 69"
        p3.gambar = R.drawable.ic_dashboard_black_24dp

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)

        return arr
    }
}