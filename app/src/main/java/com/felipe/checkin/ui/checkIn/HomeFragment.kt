package com.felipe.checkin.ui.checkIn

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.felipe.checkin.R
import java.lang.Exception
import java.sql.Time
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter


class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Fragment for ViewModel of ClockLayout
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        //Set text to TextView
        val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(this, Observer { textView.text = it})

        val clock: TextView = root.findViewById(R.id.clockView)
        val time = LocalTime.now().toString()
        val formatter = DateTimeFormatter.ofPattern("H:mm:ss")
        val ticking: String = time.format(formatter)
        clock.setText(time)


        //Button onListener
        val button:Button = root.findViewById(R.id.check_in)
        button.setOnClickListener {

            Toast.makeText(context, "Checked-In at time:  ${LocalTime.now()}" + "\n"+ ticking, Toast.LENGTH_LONG).show()
        }

        return root
    }
}