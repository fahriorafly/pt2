package org.skyriver.yubisaekspor.adapter.penjual

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.skyriver.yubisaekspor.R
import org.skyriver.yubisaekspor.model.penjual.PenjualPesanan

class AdapterPenjualPesanan(var data:ArrayList<PenjualPesanan>): RecyclerView.Adapter<AdapterPenjualPesanan.Holder>() {

    class Holder(view: View): RecyclerView.ViewHolder(view){
        val namaPembeli = view.findViewById<TextView>(R.id.penjualPesananNamaLengkap)
        val pesananPembeli = view.findViewById<TextView>(R.id.penjualPesananPesanan)
        val alamatPembeli = view.findViewById<TextView>(R.id.penjualPesananAlamat)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.item_penjual_pesanan, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.namaPembeli.text = data[position].namaPembeli
        holder.pesananPembeli.text = data[position].pesananPembeli
        holder.alamatPembeli.text = data[position].alamatPembeli
    }

    override fun getItemCount(): Int {
        return data.size
    }
}