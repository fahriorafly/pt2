package org.skyriver.yubisaekspor.fragment.admin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.skyriver.yubisaekspor.R
import org.skyriver.yubisaekspor.adapter.admin.AdapterAdmin
import org.skyriver.yubisaekspor.model.admin.AdminTkAj

class AdmintkreqFragment : Fragment() {

    lateinit var rvAdminTkAj: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_admintkreq, container, false)

        rvAdminTkAj = view.findViewById(R.id.idRvShowAdminAjukan)

        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        rvAdminTkAj.adapter = AdapterAdmin(arrProduk)
        rvAdminTkAj.layoutManager = layoutManager

        return view
    }

    val arrProduk: ArrayList<AdminTkAj>get(){
        val arr = ArrayList<AdminTkAj>()
        val p1 = AdminTkAj()
        p1.namaLengkap = "Cengkeh"
        p1.namaToko = "Toko Slebew"
        p1.alamat = "jl. mengger hilir no 69"

        val p2 = AdminTkAj()
        p2.namaLengkap = "Cengkeh"
        p2.namaToko = "Toko Slebew"
        p2.alamat = "jl. mengger hilir no 69"

        val p3 = AdminTkAj()
        p3.namaLengkap = "Cengkeh"
        p3.namaToko = "Toko Slebew"
        p3.alamat = "jl. mengger hilir no 69"

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)

        return arr
    }
}