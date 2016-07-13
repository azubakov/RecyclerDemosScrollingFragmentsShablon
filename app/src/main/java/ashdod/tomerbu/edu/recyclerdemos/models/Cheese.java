package ashdod.tomerbu.edu.recyclerdemos.models;

/**
 * Created by stud27 on 13/07/16.
 */
public class Cheese {
    private String title;
    private String description;
    private int imageResId;

    //Constructor
    public Cheese(String title, String description, int imageResId) {
        this.title = title;
        this.description = description;
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

}
