package Models;


import java.util.Date;

public class EatingRecord
{
    private int recordId;
    private int personId;
    private int chiliId;
    private int quantityEaten;
    private int rating; // How much they liked it (1-10)
    private Date dateEaten;

    public EatingRecord(int recordId, int personId, int chiliId, int quantityEaten, int rating, Date dateEaten)
    {
        this.recordId = recordId;
        this.personId = personId;
        this.chiliId = chiliId;
        this.quantityEaten = quantityEaten;
        this.rating = rating;
        this.dateEaten = dateEaten;
    }

    public EatingRecord(){}

    public EatingRecord(int personId, int chiliId, int quantityEaten, int rating, Date dateEaten)
    {
        this.personId = personId;
        this.chiliId = chiliId;
        this.quantityEaten = quantityEaten;
        this.rating = rating;
        this.dateEaten = dateEaten;
    }

    // Getters
    public int getRecordId()
    {
        return recordId;
    }

    public int getPersonId()
    {
        return personId;
    }

    public int getChiliId()
    {
        return chiliId;
    }

    public int getRating()
    {
        return rating;
    }

    public int getQuantityEaten()
    {
        return quantityEaten;
    }

    public Date getDateEaten()
    {
        return dateEaten;
    }


    //Setters

    public void setRecordId(int recordId)
    {
        this.recordId = recordId;
    }


    public void setPersonId(int personId)
    {
        this.personId = personId;
    }

    public void setChiliId(int chiliId)
    {
        this.chiliId = chiliId;
    }

    public void setQuantityEaten(int quantityEaten)
    {
        this.quantityEaten = quantityEaten;
    }

    public void setRating(int rating)
    {
        this.rating = rating;
    }

    public void setDateEaten(Date dateEaten) {
        this.dateEaten = dateEaten;
    }
}


