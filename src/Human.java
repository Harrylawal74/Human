public class Human
{
    String name;
    private int age;
    private Pet pet;

    public Human(String theName, int personAge)
    {
        name = theName;
        age = personAge;
        pet = null;
    }

    public int getAge()
    {
        return age;
    }

    public void birthday()
    {
        age += 1;
    }

    public Pet getPet()
    {
        return pet;
    }

    public void setPet(Pet thePet)
    {
        pet = thePet;
    }

    public void strokePet()
    {
        if (pet != null) {
            pet.makeNoise();
        }
    }

    public void petsBirthday()
    {
        if (pet != null) {
            pet.birthday();
        }
    }

    public int getPetAge()
    {
        return pet.getAge();
    }
}
