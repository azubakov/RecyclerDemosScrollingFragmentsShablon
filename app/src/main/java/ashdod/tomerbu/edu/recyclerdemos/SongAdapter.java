package ashdod.tomerbu.edu.recyclerdemos;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import ashdod.tomerbu.edu.recyclerdemos.models.Song;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongViewHolder> {

    private LayoutInflater inflater;
    private Context context;
    private ArrayList<Song> data;

    //constructor that takes inflater, and optionally the data
    public SongAdapter(Context context, ArrayList<Song> data) {
        this.inflater = LayoutInflater.from(context);
        this.context = context;
        this.data = data;
    }

    //3.2.2 Create a view holder using inflater
    @Override
    public SongViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.song_item, parent, false);
        return new SongViewHolder(itemView);
    }

    //3.2.3: Bind the data using the viewHolder and poisition
    //bindItemByPosition
    @Override
    public void onBindViewHolder(SongViewHolder holder, int position) {
        Song item = data.get(position);
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
    public class SongViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvTitle;
        TextView tvDescription;
        ImageView ivCheese;

        public SongViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            tvDescription = (TextView) itemView.findViewById(R.id.tvDescription);
            ivCheese = (ImageView) itemView.findViewById(R.id.cheeseImage);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, SongDetailsActivity.class);

            //
            int position = getAdapterPosition();

            Song s = data.get(position);
            intent.putExtra(Constants.EXTRA_SONG, s);

            context.startActivity(intent);
        }
    }
}
