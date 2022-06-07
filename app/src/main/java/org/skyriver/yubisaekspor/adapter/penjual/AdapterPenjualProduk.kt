package org.skyriver.yubisaekspor.adapter.penjual

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.skyriver.yubisaekspor.R
import org.skyriver.yubisaekspor.model.penjual.PenjualProduk

class AdapterPenjualProduk(var data:ArrayList<PenjualProduk>): RecyclerView.Adapter<AdapterPenjualProduk.Holder>()  {
    class Holder(view: View): RecyclerView.ViewHolder(view){
        val namaProduk = view.findViewById<TextView>(R.id.penjualNamaRvProduk)
        val alamatProduk = view.findViewById<TextView>(R.id.penjualAlamatRvProduk)
        val gambarProduk = view.findViewById<ImageView>(R.id.penjualGambarRvProduk)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_penjual_list_produk, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.namaProduk.text = data[position].namaProduk
        holder.alamatProduk.text = data[position].alamatProduk
        holder.gambarProduk.setImageResource(data[position].gambarProduk)
    }
}