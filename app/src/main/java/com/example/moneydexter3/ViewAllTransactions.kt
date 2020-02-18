package com.example.moneydexter3


import android.os.Bundle
import android.os.IBinder
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation


class ViewAllTransactions : Fragment() {

    lateinit var navController: NavController
    lateinit var tname: String
    lateinit var tcost: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tname = arguments!!.getString("tname").toString()
        tcost = arguments!!.getString("tcost").toString()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_all_transactions, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        val displayName = "$tname"
        val displayCost = "$tcost"
        view.findViewById<TextView>(R.id.firstTrnName).text = displayName
        view.findViewById<TextView>(R.id.firstCostCol).text = displayCost
    }



}
