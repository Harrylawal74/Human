public class Family
{
    private Human elspeth;
    private Human fatima;
    private Human susan;
    private Human jane;
    private Human john;
    private Human mary;

    public Family()
    {
        elspeth = new Human("Elspeth", 96);
        fatima = new Human("Fatima", 65);
        john = new Human("John", 31);
        mary = new Human("Mary", 30);
        jane = new Human("Jane", 29);
        susan = new Human("Susan", 67);

        fatima.setMother(elspeth);
        susan.setMother(elspeth);
        jane.setMother(fatima);
        john.setMother(fatima);
        mary.setMother(fatima);

    }


    public void test()

    {
        //gets the object correlating to susan's mother then uses birthday method on that object
        //prints object "fatima"'s mothers age using getAge method
        susan.getMother().birthday();
        System.out.println(fatima.getMother().getAge());

        //
        Human person;
        Human another;
        Human yetAnother;
        person = mary.getMother();
        another = person.getMother();
        yetAnother = susan.getMother();
        yetAnother.birthday();
        System.out.println(another.getAge());
    }


    //TEST
    public static void main(String[] args) {
        Family happyfam = new Family();
        happyfam.test();
    }
}
