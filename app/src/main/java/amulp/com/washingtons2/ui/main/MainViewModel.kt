package amulp.com.washingtons2.ui.main

import amulp.com.washingtons2.utils.ListProvider
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    fun getWashList() = ListProvider.getWasherList()
    fun getDryList() = ListProvider.getDryerList()
    fun getOtherList() = ListProvider.getOtherList()
}
