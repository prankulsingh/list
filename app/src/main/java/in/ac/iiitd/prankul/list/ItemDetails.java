package in.ac.iiitd.prankul.list;

/**
 * Created by Prankul on 16-10-2016.
 */

public class ItemDetails
{
    String title, subtitle;

    public ItemDetails(String title, String subtitle) {
        this.title = title;
        this.subtitle = subtitle;
    }

    public ItemDetails() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
}
