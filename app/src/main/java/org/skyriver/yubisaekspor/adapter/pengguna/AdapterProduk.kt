package org.skyriver.yubisaekspor.adapter.pengguna

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.skyriver.yubisaekspor.R
import org.skyriver.yubisaekspor.model.pengguna.Produk

class AdapterProduk(var data:ArrayList<Produk>): RecyclerView.Adapter<AdapterProduk.Holder>() {

    class Holder(view:View): RecyclerView.ViewHolder(view){
        val nama = view.findViewById<TextView>(R.id.namaRvProduk)
        val alamat = view.findViewById<TextView>(R.id.alamatRvProduk)
        val gambar = view.findViewById<ImageView>(R.id.gambarRvProduk)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.item_produk, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.nama.text = data[position].nama
        holder.alamat.text = data[position].alamat
        holder.gambar.setImageResource(data[position].gambar)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}