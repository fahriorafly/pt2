package org.skyriver.yubisaekspor.fragment.pengguna

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import org.skyriver.yubisaekspor.R
import org.skyriver.yubisaekspor.activity.SigninActivity
import org.skyriver.yubisaekspor.helper.SharedPref

class UserFragment : Fragment() {

    lateinit var sp:SharedPref
    lateinit var btnLogout: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_user, container, false)

        btnLogout = view.findViewById(R.id.btnLogoutUser)

        sp = SharedPref(requireActivity())

        btnLogout.setOnClickListener{
            sp.setStatusSignin(false)
            val intent = Intent (getActivity(), SigninActivity::class.java)
            getActivity()?.startActivity(intent)
        }

        return view
    }
}