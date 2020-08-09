package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int) : ViewModel() {

    //Final score
    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int>
        get() = _score

    //Play again event
    private val _playAgainEvent = MutableLiveData<Boolean>()
    val playAgainEvent: LiveData<Boolean>
        get() = _playAgainEvent

    init {
        _score.value = finalScore
    }

    fun onPlayAgain() {
        _playAgainEvent.value = true
    }

    fun onPlayAgainComplete() {
        _playAgainEvent.value = false
    }
}