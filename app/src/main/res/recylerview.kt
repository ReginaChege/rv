class recylerview {
    class FibonacciRvAdapter(private val sequence: List<Int>) :
        RecyclerView.Adapter<FibonacciRvAdapter.ViewHolder>() {

        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val textView: TextView = itemView.findViewById(R.id.tvNums)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = layout.from(parent.context)
                .inflate(R.layout.num_list_item, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.textView.text = sequence[position].toString()
        }

        override fun getItemCount() = sequence.size
    }
}
