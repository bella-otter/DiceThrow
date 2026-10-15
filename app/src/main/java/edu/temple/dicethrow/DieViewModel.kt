package edu.temple.dicethrow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DieViewModel : ViewModel() {
    private val currentRoll = MutableLiveData<Int>()
    //might need to set a default val w apply
    //but probably not
    fun setRoll(roll:Int) {
        currentRoll.value = roll
    }
    fun getRoll(): LiveData<Int> = currentRoll as LiveData<Int>
    //can remove as LiveData part,
    //seems like kotlin just does it implicitly


}