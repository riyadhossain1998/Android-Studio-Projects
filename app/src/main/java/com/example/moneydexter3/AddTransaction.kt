package com.example.moneydexter3


import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_add_transaction2.*


class AddTransaction : Fragment(), View.OnClickListener{

    var navController: NavController? = null
    lateinit var nameOfTrn: EditText
    lateinit var cost: EditText



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_add_transaction2, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.addTrnButton).setOnClickListener(this)
        view.findViewById<Button>(R.id.at2_back).setOnClickListener(this)


    }
    override fun onClick(v: View?) {
        when(v!!.id) {
            R.id.addTrnButton -> {
                if(!TextUtils.isEmpty(addTrnName.text.toString())){
                    val bundle = bundleOf(
                        "tname" to addTrnName.text.toString(),
                        "tcost" to addCost.text.toString())
                    navController!!.navigate(R.id.action_addTransaction_to_viewAllTransactions,
                                bundle)
                }
            }
            R.id.at2_back -> activity!!.onBackPressed()
        }
    }



}



/*
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
                                                   xmlns:app="http://schemas.android.com/apk/res-auto"
                                                   xmlns:tools="http://schemas.android.com/tools"
                                                   android:layout_width="match_parent"
                                                   android:layout_height="match_parent"
                                                   tools:context=".AddTransaction" android:id="@+id/frameLayout">
    <EditText
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:inputType="textPersonName"
            android:text="@string/transaction_name"
            android:ems="10"
            android:id="@+id/nameOfTrn2"
            android:autofillHints=""
            app:layout_constraintTop_toBottomOf="@+id/addTranTitle" android:layout_marginBottom="26dp"
            app:layout_constraintEnd_toEndOf="parent" app:layout_constraintBottom_toTopOf="@+id/trnCost2"
            app:layout_constraintStart_toStartOf="parent"
            android:layout_marginStart="72dp" android:layout_marginEnd="72dp"/>
    <EditText
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:inputType="textPersonName"
            android:text="@string/cost"
            android:ems="10"
            android:id="@+id/trnCost2"
            android:importantForAutofill="no"
            app:layout_constraintTop_toBottomOf="@+id/nameOfTrn2"
            android:layout_marginBottom="34dp" app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintBottom_toTopOf="@+id/addDate" app:layout_constraintStart_toStartOf="parent"
            android:layout_marginStart="72dp" android:layout_marginEnd="72dp"
    />
    <EditText
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:inputType="date"
            android:ems="10"
            android:id="@+id/addDate"
            android:text="@string/date"
            app:layout_constraintTop_toBottomOf="@+id/trnCost2" android:layout_marginBottom="31dp"
            app:layout_constraintEnd_toEndOf="parent" app:layout_constraintBottom_toTopOf="@+id/seekBar"
            app:layout_constraintStart_toStartOf="parent"
            android:layout_marginStart="72dp" android:layout_marginEnd="72dp"/>
    <SeekBar
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:id="@+id/seekBar"
            app:layout_constraintTop_toBottomOf="@+id/addDate" android:layout_marginBottom="32dp"
            app:layout_constraintEnd_toEndOf="parent" app:layout_constraintBottom_toTopOf="@+id/addTrnButton"
            app:layout_constraintStart_toStartOf="parent"
            android:layout_marginStart="72dp" android:layout_marginEnd="72dp"/>
    <Button
            android:text="@string/button"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/addTrnButton"
            tools:text="Add "
            app:layout_constraintTop_toBottomOf="@+id/seekBar" android:layout_marginBottom="99dp"
            app:layout_constraintEnd_toEndOf="parent" app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintBottom_toBottomOf="parent"/>
    <TextView
            android:text="@string/add_transaction"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/addTranTitle" android:textSize="24sp"
            android:gravity="center"
            android:layout_marginTop="78dp"
            android:layout_marginBottom="75dp" app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintBottom_toTopOf="@+id/nameOfTrn2" app:layout_constraintTop_toTopOf="parent"
            app:layout_constraintStart_toStartOf="parent"/>
</androidx.constraintlayout.widget.ConstraintLayout>
 */
