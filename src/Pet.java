public class Pet
{
    private String species;
    private String sound;
    private String name;
    private int age;
    private Human owner;

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

    public void setOwner(Human person)
    {
        owner = person;
    }

    public Human getOwner()
    {
        return owner;
    }

    public String getOwnerName()
    {
        return owner.getName() ;
    }


    public static void main(String[] args) {
        Pet fred = new Pet("tabby", "meow", "Fred", 3);
        Human greg = new Human("Simon", 25);
        //assigns human object "greg" as pet object "fred"'s owner.
        fred.setOwner(greg);
        System.out.println(fred.getOwner().getAge());
        System.out.println(fred.getOwnerName());
    }
}

