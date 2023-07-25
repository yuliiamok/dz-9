package pack1;

public class Man extends Person {
    public Man(String firstName, String lastName, int age, Person partner) {
    super(firstName, lastName, age, partner);
}

    @Override
    public Gender getGender() {
        return Gender.MAN;
    }

    @Override
    public boolean isRetired() {
        if (age < 65) {
            return super.isRetired();
        } else
            return true;
    }

    public void registerPartnership() {}
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getLastName(){
        return lastName;
    }
    @Override
    public String getInfo() {
        return String.format("%s has %d years old, is Retired: %s%n", Gender.MAN, age, isRetired());
    }
}
