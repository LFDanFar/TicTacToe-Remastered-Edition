package com.example.tictactoeremastered

import android.util.Log
import androidx.lifecycle.ViewModel

private const val TAG = "TTTViewModel"

class TTTViewModel : ViewModel(){
    init{
        Log.d(TAG, "ViewModel instance created")
    }

    var currentIndex: Int = 0

    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "ViewModel instance about to be destroyed")
    }
}