package pack1;

public abstract class Person {
    public enum Gender {
    MAN,
    WOMAN
}
    public Person partner;
    protected String firstName;
    protected String lastName;
    protected int age;
    protected boolean isRetired() {
        return false;
    }

    protected Person getPartner() {
        return partner;
    }

    protected void setPartner(Person partner) {
        this.partner = partner;
    }

    public Person(String firstName, String lastName, int age, Person partner) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = partner;
    }
    public abstract Gender getGender();
    public abstract String getInfo();
}
