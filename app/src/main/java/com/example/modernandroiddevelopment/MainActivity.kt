package com.example.modernandroiddevelopment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.example.modernandroiddevelopment.ui.UserViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val userViewModel : UserViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userViewModel.fetchData()
        userViewModel.data.observe(this, Observer {
            Log.d( "userViewModel","userViewModel.data$it")
        })

        userViewModel.isGetDataSuccess.observe(this, Observer {
            Log.d( "userViewModel","loadingState$it")
        })
    }
}