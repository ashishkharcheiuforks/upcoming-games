package com.gavinsappcreations.upcominggames.ui.sort

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SortViewModel : ViewModel() {

    private val _message = MutableLiveData<String>()
    val message: LiveData<String>
        get() = _message



}
