public class Person {
    private String firstname;
    private String lastname;
    private String age;

    public Person(String name, String firstname, String s) {
        lastname = name;
        this.firstname=firstname;
        age=s;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
