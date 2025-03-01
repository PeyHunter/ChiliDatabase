package Models;

public class Person
{

    private int personId;
    private String name;
    private int age;
    private int scaleId; // Spice tolerance category

    public Person()
    {
    }

    public Person(String name, int age, int scaleId)
    {
        this.personId = personId;
        this.name = name;
        this.age = age;
        this.scaleId = scaleId;
    }
    public Person(int personId, String name, int age, int scaleId)
    {
        this.personId = personId;
        this.name = name;
        this.age = age;
        this.scaleId = scaleId;
    }

    // Getters
    public int getPersonId()
    {
        return personId;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    // setters

    public int getScaleId()
    {
        return scaleId;
    }

    public void setPersonId(int personId)
    {
        this.personId = personId;
    }

    public void setScaleId(int scaleId)
    {
        this.scaleId = scaleId;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {

            return "Name: " + name +
                    ", ID: " + personId +
                    ", Age: " + age +
                    ", Scale: " +
                    scaleId;

    }
}

