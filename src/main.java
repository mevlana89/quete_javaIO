import java.io.IOException;
import java.util.List;

public class main {

    public static void main(String[] args) throws IOException {

        Person pers1 = new Person("name", "firstname", "7");
        Person pers2 = new Person("name", "firstname", "2");
        Person pers3 = new Person("name", "firstname", "7");
        Person pers4 = new Person("name", "firstname", "7");
        Person pers5 = new Person("name", "firstname", "7");

        PersonInputStream personInputStream = new PersonInputStream();
        personInputStream.addPerson(pers1);
        personInputStream.addPerson(pers2);

        PersonOutputStream personOutputStream = new PersonOutputStream();
        List<Person> personList = personOutputStream.readTeam();

        for (Person person : personList) {
            System.out.println(person.getFirstname());
            System.out.println(person.getLastname());
            System.out.println(person.getAge());
        }

    }
}
