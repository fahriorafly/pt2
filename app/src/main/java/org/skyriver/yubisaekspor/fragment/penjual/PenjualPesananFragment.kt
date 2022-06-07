package org.skyriver.yubisaekspor.fragment.penjual

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.skyriver.yubisaekspor.R
import org.skyriver.yubisaekspor.adapter.penjual.AdapterPenjualPesanan
import org.skyriver.yubisaekspor.model.penjual.PenjualPesanan

class PenjualPesananFragment : Fragment() {

    lateinit var rvPenjualPesanan: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_penjual_pesanan, container, false)

        rvPenjualPesanan = view.findViewById(R.id.idRvShowPenjualPesanan)

        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        rvPenjualPesanan.adapter = AdapterPenjualPesanan(arrProduk)
        rvPenjualPesanan.layoutManager = layoutManager

        return view
    }

    val arrProduk: ArrayList<PenjualPesanan>get(){
        val arr = ArrayList<PenjualPesanan>()
        val p1 = PenjualPesanan()
        p1.namaPembeli = "Cengkeh"
        p1.pesananPembeli = "Toko Slebew"
        p1.alamatPembeli = "jl. mengger hilir no 69"

        val p2 = PenjualPesanan()
        p2.namaPembeli = "Cengkeh"
        p2.pesananPembeli = "Toko Slebew"
        p2.alamatPembeli = "jl. mengger hilir no 69"

        val p3 = PenjualPesanan()
        p3.namaPembeli = "Cengkeh"
        p3.pesananPembeli = "Toko Slebew"
        p3.alamatPembeli = "jl. mengger hilir no 69"

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)

        return arr
    }
}