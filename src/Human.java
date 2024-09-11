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

    //type is pet as pet is being returned but is another class
    public Pet getPet()
    {
        return pet;
    }

    //data type is Pet as pet is another class
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

    //calls "getSpecies method from Pet class
    public void getPetSpecies()
    {
        System.out.println(pet.getSpecies());
    }


    //TESTS
    public static void main(String[] args) {
        Pet elsie = new Pet("poodle", "woof", "elsie", 7);
        Human harry = new Human("Harry", 20);
        //sets the pet "elsie" as human "harry"'s pet
        harry.setPet(elsie);
        elsie.makeNoise();
        harry.birthday();
        System.out.println(harry.getAge());
        harry.petsBirthday();
        System.out.println(harry.pet.getAge());
        System.out.println(elsie.getAge());
        Human george = new Human("George", 30);
        // sets pet "elsie" as georges pet too
        george.setPet(elsie);
        george.petsBirthday();
        /*
        test to show pet "elsie" age changes with human "george" method but also changes for
        human "harry"
         */
        System.out.println(harry.pet.getAge());
        harry.petsBirthday();
        harry.getPetSpecies();
    }


}
