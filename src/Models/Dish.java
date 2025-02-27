package Models;

public class Dish
{
    private int dishId;
    private String name;
    private String description;
    private int scaleId; // Heat category for dish

    public Dish(int dishId, String name, String description, int scaleId)
    {
        this.dishId = dishId;
        this.name = name;
        this.description = description;
        this.scaleId = scaleId;
    }

    public Dish(){}

    public Dish(String name, String description, int scaleId)
    {
        this.name = name;
        this.description = description;
        this.scaleId = scaleId;
    }

    // Getters
    public int getDishId()
    {
        return dishId;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public int getScaleId()
    {
        return scaleId;
    }

    //setters

    public void setDishId(int dishId)
    {
        this.dishId = dishId;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setScaleId(int scaleId)
    {
        this.scaleId = scaleId;
    }
}
