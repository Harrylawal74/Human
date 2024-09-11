public class Pet
{
    private String species;
    private String sound;
    private String name;
    private int age;

    public Pet(String kind, String whatCalled, int theAge, String noise)
    {
        species = kind;
        sound = whatCalled;
        name = noise;
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
}

