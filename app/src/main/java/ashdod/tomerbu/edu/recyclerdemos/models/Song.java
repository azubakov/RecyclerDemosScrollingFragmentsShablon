package ashdod.tomerbu.edu.recyclerdemos.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by stud27 on 13/07/16.
 */
public class Song implements Parcelable {
    private String title;
    private String description;
    private String lyrics;
    private int imageResId;

    //Constructor
    public Song(String title, String description, String lyrics, int imageResId) {
        this.title = title;
        this.description = description;
        this.lyrics = lyrics;
        this.imageResId = imageResId;
    }

    //Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public String getLyrics() {
        return lyrics;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.lyrics);
        dest.writeInt(this.imageResId);
    }

    protected Song(Parcel in) {
        this.title = in.readString();
        this.description = in.readString();
        this.lyrics = in.readString();
        this.imageResId = in.readInt();
    }

    public static final Parcelable.Creator<Song> CREATOR = new Parcelable.Creator<Song>() {
        @Override
        public Song createFromParcel(Parcel source) {
            return new Song(source);
        }

        @Override
        public Song[] newArray(int size) {
            return new Song[size];
        }
    };

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }
}
