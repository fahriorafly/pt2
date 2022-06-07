package org.skyriver.yubisaekspor.adapter.admin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.skyriver.yubisaekspor.R
import org.skyriver.yubisaekspor.model.admin.AdminTkAj

class AdapterAdmin(var data:ArrayList<AdminTkAj>): RecyclerView.Adapter<AdapterAdmin.Holder>() {

    class Holder(view:View): RecyclerView.ViewHolder(view){
        val namaLengkap = view.findViewById<TextView>(R.id.textNamaLengkap)
        val namaToko = view.findViewById<TextView>(R.id.textNamaToko)
        val alamatToko = view.findViewById<TextView>(R.id.textAlamat)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.item_admintkaj, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.namaLengkap.text = data[position].namaLengkap
        holder.namaToko.text = data[position].namaToko
        holder.alamatToko.text = data[position].alamat
    }

    override fun getItemCount(): Int {
        return data.size
    }
}