package amulp.com.washingtons2.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import amulp.com.washingtons2.R
import amulp.com.washingtons2.adapters.RecycleAdapter
import amulp.com.washingtons2.models.ListItem
import kotlinx.android.synthetic.main.main_fragment.*
import org.jetbrains.anko.toast

class MainFragment : Fragment() {


    companion object {
        private var fragmentType:String = ""
        fun newInstance(fragmentType:String = "washer") {
            this.fragmentType = fragmentType
            MainFragment()
        }
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        initAdapterWithList()
    }

    private fun initAdapterWithList(){
        recyclerView.adapter = RecycleAdapter(
                when(fragmentType){
                    "washer" -> viewModel.getWashList()
                    "dryer" -> viewModel.getDryList()
                    "other" -> viewModel.getOtherList()
                    else -> listOf(ListItem("a", "Error", "Something went wrong"))
                }
        ) {
            context!!.toast(it.firstLine + "clicked")
        }
    }

}
