package Models;

public class HeatScale
{

    private int scaleId;
    private String categoryName;
    private int minShu;
    private int maxShu;

    public HeatScale(){}

    public HeatScale(int scaleId, String categoryName, int minShu, int maxShu)
    {
        this.scaleId = scaleId;
        this.categoryName = categoryName;
        this.minShu = minShu;
        this.maxShu = maxShu;
    }

    public HeatScale(String categoryName, int minShu, int maxShu)
    {
        this.categoryName = categoryName;
        this.minShu = minShu;
        this.maxShu = maxShu;
    }

    //getters

    public int getScaleId()
    {
        return scaleId;
    }

    public String getCategoryName()
    {
        return categoryName;
    }

    public int getMinShu()
    {
        return minShu;
    }

    public int getMaxShu()
    {
        return maxShu;
    }


    //setters

    public void setScaleId(int scaleId)
    {
        this.scaleId = scaleId;
    }

    public void setCategoryName(String categoryName)
    {
        this.categoryName = categoryName;
    }

    public void setMinShu(int minShu)
    {
        this.minShu = minShu;
    }

    public void setMaxShu(int maxShu)
    {
        this.maxShu = maxShu;
    }


}
