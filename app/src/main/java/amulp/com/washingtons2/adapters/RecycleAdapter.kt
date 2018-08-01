package amulp.com.washingtons2.adapters

import amulp.com.washingtons2.R
import amulp.com.washingtons2.models.ListItem
import amulp.com.washingtons2.utils.inflate
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class RecycleAdapter(val items: List<ListItem>, val listener: (ListItem) -> Unit)
    : RecyclerView.Adapter<RecycleAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(parent.inflate(R.layout.list_item))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(items[position], listener)

    override fun getItemCount() = items.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(item: ListItem, listener: (ListItem) -> Unit) = with(itemView) {

            mainIcon.text = item.icon
            firstLine.text = item.firstLine
            secondLine.text = item.secondLine

            setOnClickListener { listener(item) }
        }
    }
}