package com.example.moneydexter3


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation


class AppMain : Fragment(), View.OnClickListener {

    var navController: NavController? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_app_main, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<ImageButton>(R.id.imageButton).setOnClickListener(this)  // Add Transaction
        view.findViewById<ImageButton>(R.id.imageButton2).setOnClickListener(this) // About
        view.findViewById<ImageButton>(R.id.imageButton3).setOnClickListener(this) // Settings
        view.findViewById<TextView>(R.id.textView2).setOnClickListener(this) // All Transactions
    }

    override fun onClick(v: View) {
        when(v!!.id){
            R.id.imageButton -> navController!!.navigate(R.id.action_appMain_to_addTransaction)
            R.id.imageButton2 -> navController!!.navigate(R.id.action_appMain_to_about)
            R.id.imageButton3 -> navController!!.navigate(R.id.action_appMain_to_settings)
            R.id.textView2 -> navController!!.navigate(R.id.action_appMain_to_viewAllTransactions)
        }
    }


}
