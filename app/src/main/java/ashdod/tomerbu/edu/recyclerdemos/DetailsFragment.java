package ashdod.tomerbu.edu.recyclerdemos;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import ashdod.tomerbu.edu.recyclerdemos.models.Song;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFragment extends Fragment {

    TextView lyrics;
    ImageView ivAlbum;

    public static DetailsFragment newInstance(Song s) {
        Bundle args = new Bundle();
        args.putParcelable(Constants.EXTRA_SONG, s);
        DetailsFragment fragment = new DetailsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_details, container, false);

        lyrics = (TextView) v.findViewById(R.id.tvLyrics);
        ivAlbum = (ImageView) v.findViewById(R.id.ivSongDetails);

        Bundle args = getArguments();
        Song s = args.getParcelable(Constants.EXTRA_SONG);

        lyrics.setText(s.getLyrics());
        ivAlbum.setImageResource(s.getImageResId());
        return v;
    }

}
