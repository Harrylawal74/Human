public class Pet
{
    private String species;
    private String sound;
    private String name;
    private int age;

    public Pet(String kind, String noise, String whatCalled, int theAge)
    {
        species = kind;
        sound = noise;
        name = whatCalled;
        age = theAge;
    }

    public void makeNoise()
    {
        System.out.println(sound);
    }

    public void birthday()
    {
        age += 1;
    }

    public int getAge()
    {
        return age;
    }

    public String getSpecies()
    {
        return species;
    }
}

