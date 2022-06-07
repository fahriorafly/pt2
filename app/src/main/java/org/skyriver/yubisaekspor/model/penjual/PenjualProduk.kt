package org.skyriver.yubisaekspor.model.penjual

import java.io.Serializable

class PenjualProduk:Serializable {
    lateinit var namaProduk:String
    lateinit var alamatProduk: String
    var gambarProduk: Int = 0
}