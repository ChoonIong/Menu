package com.example.menu


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.menu.GlobalVariable.userID
import kotlinx.android.synthetic.main.fragment_blank.*
import kotlinx.android.synthetic.main.fragment_garbage_collection.*
import kotlinx.android.synthetic.main.fragment_login.*

/**
 * A simple [Fragment] subclass.
 */
class BlankFragment : Fragment() {

    lateinit var handler: AccDatabase

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        handler = AccDatabase(context!!)

        //handler.verifyUsername("qwe")

        var data = handler.retrieveData(userID)
        for(i in 0..(data.size-1)){
            txtTest.append(data.get(i).username)
           // textAddress2.append(data.get(i).address)
        }

    }
}
