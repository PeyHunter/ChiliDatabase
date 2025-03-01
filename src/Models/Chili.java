package Models;

public class Chili
{
    private int chiliId;
    private String name;
    private int scoville;
    private int scaleId; // Heat category for chili
    private Integer rating; // Nullable
    private String comments;

    public Chili(int chiliId, String name, int scoville, int scaleId, Integer rating, String comments)
    {
        this.chiliId = chiliId;
        this.name = name;
        this.scoville = scoville;
        this.scaleId = scaleId;
        this.rating = rating;
        this.comments = comments;
    }

    public Chili(){}

    public Chili(String name, int scoville, int scaleId, Integer rating, String comments)
    {
        this.name = name;
        this.scoville = scoville;
        this.scaleId = scaleId;
        this.rating = rating;
        this.comments = comments;
    }


    // Getters
    public int getChiliId()
    {
        return chiliId;
    }

    public String getName()
    {
        return name;
    }

    public int getScoville()
    {
        return scoville;
    }

    public int getScaleId()
    {
        return scaleId;
    }

    public Integer getRating()
    {
        return rating;
    }

    public String getComments()
    {
        return comments;
    }

    //Setters

    public void setChiliId(int chiliId)
    {
        this.chiliId = chiliId;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setScoville(int scoville)
    {
        this.scoville = scoville;
    }


    public void setScaleId(int scaleId)
    {
        this.scaleId = scaleId;
    }


    public void setRating(Integer rating)
    {
        this.rating = rating;
    }

    public void setComments(String comments)
    {
        this.comments = comments;
    }

    @Override
    public String toString()
    {
        return "Chili ID: " + chiliId +
                ", Name: " + name +
                ", Scoville: " + scoville +
                ", Scale ID: " + scaleId +
                ", Rating: " + (rating != null ? rating : "N/A") +  // If rating is null, return "N/A"
                ", Comments: " + (comments != null ? comments : "No comments");  // If comments are null, return a default message
    }

}