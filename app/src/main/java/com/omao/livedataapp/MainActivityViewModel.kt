package com.omao.livedataapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(initialNumber: Int): ViewModel() {

    private var total = MutableLiveData<Int>()
    val totalSum: LiveData<Int>
        get() = total

    init {
        total.value = initialNumber
    }

    fun setTotal(input: Int): Int {
        total.value = (total.value)?.plus(input)
    }

}