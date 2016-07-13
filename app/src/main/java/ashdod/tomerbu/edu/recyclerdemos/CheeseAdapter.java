package ashdod.tomerbu.edu.recyclerdemos;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import ashdod.tomerbu.edu.recyclerdemos.models.Cheese;

public class CheeseAdapter extends RecyclerView.Adapter<CheeseAdapter.CheeseViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<Cheese> data;

    //constructor that takes inflater, and optionally the data
    public CheeseAdapter(LayoutInflater inflater, ArrayList<Cheese> data) {
        this.inflater = inflater;
        this.data = data;
    }

    //3.2.2 Create a view holder using inflater
    @Override
    public CheeseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.cheese_item, parent, false);
        return new CheeseViewHolder(itemView);
    }

    //3.2.3: Bind the data using the viewHolder and poisition
    //bindItemByPosition
    @Override
    public void onBindViewHolder(CheeseViewHolder holder, int position) {
        Cheese item = data.get(position);
        holder.tvTitle.setText(item.getTitle());
        holder.tvDescription.setText(item.getDescription());
        holder.ivCheese.setImageResource(item.getImageResId());
    }

    //3.2.1 return the item count
    @Override
    public int getItemCount() {
        return data.size();
    }

    //3.1 View Holder - Does FindViewById
    public class CheeseViewHolder extends RecyclerView.ViewHolder{
        TextView tvTitle;
        TextView tvDescription;
        ImageView ivCheese;

        public CheeseViewHolder(View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            tvDescription = (TextView) itemView.findViewById(R.id.tvDescription);
            ivCheese = (ImageView) itemView.findViewById(R.id.cheeseImage);
        }
    }
}
